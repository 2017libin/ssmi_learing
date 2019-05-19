/**
 * @Title: UserServiceAspect.java
 * @Package cn.osxm.ssmi.chp08.aop.aspect
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��18�� ����5:39:52
 * @version V1.0
 */
package cn.osxm.ssmi.chp16.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.AfterThrowing;;

/**
 * @ClassName: UserServiceAspect
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Aspect
public class UserServiceAspectAnno {
	@Pointcut("execution(* cn.osxm..*.add(..))")
	public void userServicePointCut() {
	}

	//@Before("userServicePointCut()")
	public void beforeAdvice() throws Throwable {
		System.out.println("[UserServiceAspectAnno][beforeAdvice]ǰ����ǿ");
	}

	@After("userServicePointCut()")
	public void afterAdvice() throws Throwable {
		System.out.println("[UserServiceAspectAnno][afterAdvice]������ǿ");
	}

	@Around("userServicePointCut()")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("[UserServiceAspectAnno][Around]������ǿ��ִ�з���ǰ");
		Object result = joinPoint.proceed();
		System.out.println("[UserServiceAspectAnno][Around]������ǿ��ִ�з�����");
		return result;
	}

	@AfterReturning("userServicePointCut()")
	public void afterRunningAdvice() throws Throwable {
		System.out.println("[UserServiceAspectAnno][AfterReturning]���ؽ��֮��");
	}

	@AfterThrowing("userServicePointCut()")
	public void afterThrowingAdvice() throws Throwable {
		System.out.println("[UserServiceAspectAnno][afterThrowingAdvice]�׳��쳣֮��");
	}
}
