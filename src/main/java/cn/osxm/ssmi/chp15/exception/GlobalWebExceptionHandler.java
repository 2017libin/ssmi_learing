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
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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

	/**
	 * 400 - Bad Request
	 */
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ServiceResponse handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
		logger.error("��������ʧ��", e);
		return ServiceResponse.fail("could_not_read_json");
	}

	/**
	 * 405 - Method Not Allowed
	 */
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ServiceResponse handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
		logger.error("��֧�ֵ�ǰ���󷽷�", e);
		return ServiceResponse.fail("request_method_not_supported");
	}

	/**
	 * 415 - Unsupported Media Type
	 */
	@ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
	@ExceptionHandler(HttpMediaTypeNotSupportedException.class)
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
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ MyJsonException.class })
	public Map myJsonExceptionHandler() {
		Map exceptionMap = new HashMap();
		exceptionMap.put("status", "My Status");
		return exceptionMap;
	}

}
