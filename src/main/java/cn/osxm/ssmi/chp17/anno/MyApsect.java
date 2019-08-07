/**
 * @Title: MyApsect.java
 * @Package cn.osxm.ssmi.chp17.anno
 * @Description: TODO
 * @author oscarchen
 * @date 2019��8��7��
 * @version V1.0
 */
package cn.osxm.ssmi.chp17.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyApsect
 * @Description: TODO
 * @author oscarchen
 */
@Aspect
@Component
public class MyApsect {

	@Pointcut("execution(public * cn.osxm..*Service.add(..))")
	public void myPointcut() {

	}

	@Before("myPointcut()")
	public void beforeAdd(JoinPoint joinPoint) {
		Object object = joinPoint.getTarget();
		String methodName = joinPoint.getSignature().getName();
		System.out.println("����" + methodName + "֮ǰִ��");
	}

	@After("execution(public * cn.osxm..*Service.add(..))")
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("����" + methodName + "֮��ִ��");
	}

	@AfterReturning("execution(public * cn.osxm..*Service.add(..))")
	public void afterReturn(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("����" + methodName + "ִ�гɹ�֮��ִ��");
	}

	/*
	 * @Before("execution(public * cn.osxm..*Service.add(..))") public void
	 * beforeAdd(JoinPoint joinPoint){ String methodName =
	 * joinPoint.getSignature().getName(); System.out.println("�ڷ����� " +
	 * methodName+"֮ǰִ��"); }
	 */
}
