/**
 * @Title: MyException.java
 * @Package cn.osxm.ssmi.chp15.exception
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:14:58
 * @version V1.0
 */

package cn.osxm.ssmi.chp15.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
  * @ClassName: MyException
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@SuppressWarnings("serial")
//@ResponseStatus(value=HttpStatus.FORBIDDEN,reason="使用@ResponseStatus注解标注，不允许访问异常")
@ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED,reason = "GET方法是不可以的，请使用POST方法。")
public class MyException extends RuntimeException{

}