/**
 * @Title: MyRestJsonExceptionHandler.java
 * @Package cn.osxm.ssmi.chp15.exception
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��7��11�� ����6:15:36
 * @version V1.0
 */

package cn.osxm.ssmi.chp15.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ClassName: MyRestJsonExceptionHandler
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@ControllerAdvice
@ResponseBody
public class MyRestJsonExceptionHandler 
//extends ResponseEntityExceptionHandler  //�̳л��HTTP�쳣һ������
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ MyJsonException.class })
	public Map myJsonExceptionHandler() {
		Map exceptionMap = new HashMap();
		exceptionMap.put("status", "My Status");
		return exceptionMap;
	}

}