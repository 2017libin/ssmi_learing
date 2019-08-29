/**
 * @Title: GlobalWebExceptionHandler.java
 * @Package cn.osxm.ssmi.chp15.exception
 * @Description: TODO
 * @author oscarchen
 * @date 2019年7月28日
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

	/**覆写父类处理方法
	 * 400 - Bad Request
	 */
	@Override
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	//@ExceptionHandler(HttpMessageNotReadableException.class) 不能加
	public ResponseEntity<Object> handleHttpMessageNotReadable(
			HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.error("参数解析失败", ex);
		return new ResponseEntity<Object>(status);
	}

	/**覆写父类处理方法
	 * 405 - Method Not Allowed
	 */
	@Override
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	//@ExceptionHandler(HttpRequestMethodNotSupportedException.class) 不能加
	public ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {  
		logger.error("不支持当前请求方法", ex);
		return new ResponseEntity<Object>(status);
	}
	
	/**
	 *自定义异常的处理
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ MyJsonException.class }) //需要
	public Map myJsonExceptionHandler() {
		Map exceptionMap = new HashMap();
		exceptionMap.put("status", "My Status");
		return exceptionMap;
	}

	/**
	 * 415 - Unsupported Media Type
	 */
	@ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
	//@ExceptionHandler(HttpMediaTypeNotSupportedException.class)不能加
	public ServiceResponse handleHttpMediaTypeNotSupportedException(Exception e) {
		logger.error("不支持当前媒体类型", e);
		return ServiceResponse.fail("content_type_not_supported");
	}


	/**
	 * 500 - Internal Server Error
	 */
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ServiceResponse handleException(Exception e) {
		logger.error("服务运行异常", e);
		return ServiceResponse.fail("BUSINESS_ERROR");

	}
	


}
