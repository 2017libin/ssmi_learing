/**
 * @Title: MyMethodBeforeAdvice.java
 * @Package cn.osxm.ssmi.chp17.advice
 * @Description: TODO
 * @author oscarchen
 * @date 2019��8��6��
 * @version V1.0
 */
package cn.osxm.ssmi.chp17.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
  * @ClassName: MyMethodBeforeAdvice
  * @Description: TODO
  * @author oscarchen
  */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("======����ǰ����ǿ=======");		
	}

}
