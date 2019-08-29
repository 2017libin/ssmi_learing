/**
 * @Title: GlobalWebExceptionHandler.java
 * @Package cn.osxm.ssmi.chp15.exception
 * @Description: TODO
 * @author oscarchen
 * @date 2019��7��28��
 * @version V1.0
 */
package cn.osxm.ssmi.chp15.exception;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @ClassName: GlobalWebExceptionHandler
 * @Description: TODO
 * @author oscarchen
 */
@ControllerAdvice
@ResponseBody
public class GlobalWebExceptionHandler extends ResponseEntityExceptionHandler {
	private static Logger logger = LoggerFactory.getLogger(GlobalWebExceptionHandler.class);

	/**��д���ദ����
	 * 400 - Bad Request
	 */
	@Override
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	//@ExceptionHandler(HttpMessageNotReadableException.class) ���ܼ�
	public ResponseEntity<Object> handleHttpMessageNotReadable(
			HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.error("��������ʧ��", ex);
		return new ResponseEntity<Object>(status);
	}

	/**��д���ദ����
	 * 405 - Method Not Allowed
	 */
	@Override
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	//@ExceptionHandler(HttpRequestMethodNotSupportedException.class) ���ܼ�
	public ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {  
		logger.error("��֧�ֵ�ǰ���󷽷�", ex);
		return new ResponseEntity<Object>(status);
	}
	
	/**
	 *�Զ����쳣�Ĵ���
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ MyJsonException.class }) //��Ҫ
	public Map myJsonExceptionHandler() {
		Map exceptionMap = new HashMap();
		exceptionMap.put("status", "My Status");
		return exceptionMap;
	}

	/**
	 * 415 - Unsupported Media Type
	 */
	@ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
	//@ExceptionHandler(HttpMediaTypeNotSupportedException.class)���ܼ�
	public ServiceResponse handleHttpMediaTypeNotSupportedException(Exception e) {
		logger.error("��֧�ֵ�ǰý������", e);
		return ServiceResponse.fail("content_type_not_supported");
	}


	/**
	 * 500 - Internal Server Error
	 */
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ServiceResponse handleException(Exception e) {
		logger.error("���������쳣", e);
		return ServiceResponse.fail("BUSINESS_ERROR");

	}
	


}
