/**
 * @Title: BeforeAdvice.java
 * @Package cn.osxm.ssmi.chp16.advice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��19�� ����8:45:13
 * @version V1.0
 */

package cn.osxm.ssmi.chp16.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
  * @ClassName: BeforeAdvice
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("=======ǰ����ǿ=======");
		
	}

}
