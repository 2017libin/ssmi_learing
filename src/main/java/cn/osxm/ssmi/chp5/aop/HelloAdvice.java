/**
 * @Title: HelloAdvice.java
 * @Package cn.osxm.ssmi.chp5.aop
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月12日 上午5:37:52
 * @version V1.0
 */

package cn.osxm.ssmi.chp5.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.util.StopWatch;

/**
 * @ClassName: HelloAdvice
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Aspect
public class HelloAdvice {
	@Before("cn.osxm.ssmi.chp5.aop.HelloPointCut.helloPointCut()")
	public void doHelloPointCut() {
		System.out.println("this is HelloPointCut!");
	}

	@Around("cn.osxm.ssmi.chp5.aop.HelloPointCut.helloPointCut()")
	public Object doAroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		System.out.println("around: before!");
		Object retVal = pjp.proceed();
		System.out.println("around: doing!");
		stopWatch.stop();
		System.out.println("around: after!");
		return retVal;
	}
}
