/**
 * @Title: MyAroundAdvice.java
 * @Package cn.osxm.ssmi.chp16.advice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 下午8:48:17
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
		System.out.println("=======环绕增强,执行方法前=======");
		Object result= invocation.proceed();
		System.out.println("=======环绕增强,执行方法后=======");
		return result;
	}

}
