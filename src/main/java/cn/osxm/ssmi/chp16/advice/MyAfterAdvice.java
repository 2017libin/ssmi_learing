/**
 * @Title: MyAfterAdvice.java
 * @Package cn.osxm.ssmi.chp16.advice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��19�� ����8:46:55
 * @version V1.0
 */

package cn.osxm.ssmi.chp16.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @ClassName: MyAfterAdvice
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MyAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("=======������ǿ=======");

	}

}
