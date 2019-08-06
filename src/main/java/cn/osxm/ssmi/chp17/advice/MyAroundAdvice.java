/**
 * @Title: MyAroundAdvice.java
 * @Package cn.osxm.ssmi.chp16.advice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��19�� ����8:48:17
 * @version V1.0
 */

package cn.osxm.ssmi.chp17.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
  * @ClassName: MyAroundAdvice
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {	
		System.out.println("=======������ǿ,ִ�з���ǰ=======");
		Object result= invocation.proceed();
		System.out.println("=======������ǿ,ִ�з�����=======");
		return result;
	}

}
