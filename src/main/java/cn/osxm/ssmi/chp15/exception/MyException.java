/**
 * @Title: MyException.java
 * @Package cn.osxm.ssmi.chp15.exception
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��7��11�� ����6:14:58
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
//@ResponseStatus(value=HttpStatus.FORBIDDEN,reason="ʹ��@ResponseStatusע���ע������������쳣")
@ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED,reason = "GET�����ǲ����Եģ���ʹ��POST������")
public class MyException extends RuntimeException{

}