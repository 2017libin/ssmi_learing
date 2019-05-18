/**
 * @Title: UserServiceAspect.java
 * @Package cn.osxm.ssmi.chp08.aop.aspect
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:39:52
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.aop.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
/**
  * @ClassName: UserServiceAspect
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserServiceAspect {
	 /*@Pointcut("execution(* cn.osxm..*.add(..))")
    public void serviceLayer() {
    }
    
    @Around("serviceLayer()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        System.out.println("[UserServiceAspect]方法: 【" + joinPoint.getSignature() + "】结束，用时: " + (System.currentTimeMillis() - start));
        return result;
    }*/
}
