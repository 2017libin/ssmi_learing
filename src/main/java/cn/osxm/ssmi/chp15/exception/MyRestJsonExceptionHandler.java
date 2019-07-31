/**
 * @Title: MyRestJsonExceptionHandler.java
 * @Package cn.osxm.ssmi.chp15.exception
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:15:36
 * @version V1.0
 */

package cn.osxm.ssmi.chp15.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @ClassName: MyRestJsonExceptionHandler
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@ControllerAdvice
@ResponseBody
public class MyRestJsonExceptionHandler 
//extends ResponseEntityExceptionHandler  //继承会把HTTP异常一并处理。
{
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ MyJsonException.class })
	public Map myJsonExceptionHandler() {
		Map exceptionMap = new HashMap();
		exceptionMap.put("status", "My Status");
		return exceptionMap;
	}

}