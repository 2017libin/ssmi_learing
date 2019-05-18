/**
 * @Title: LogAspect.java
 * @Package cn.osxm.ssmi.chp08.aop.springaspect
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��18�� ����5:41:18
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.aop.springaspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/**
  * @ClassName: LogAspect
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Aspect
@Component
public class LogAspect {
    @Before("execution(public * cn.osxm..*Service.add(..))")
    public void beforeAdd(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();  
        System.out.println("�ڷ����� " + methodName+"֮ǰִ��");
    }
}
