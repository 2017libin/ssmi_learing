/**
 * @Title: MyExceptionAdvice.java
 * @Package cn.osxm.ssmi.chp16.advice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 下午8:52:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp17.advice;

import org.springframework.aop.ThrowsAdvice;

/**
  * @ClassName: MyExceptionAdvice
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyExceptionAdvice implements ThrowsAdvice{
	public void throwsAdvice(){
        System.out.println("出现了异常");
    }
}
