/**
 * @Title: HelloPointCut.java
 * @Package cn.osxm.ssmi.chp5.aop
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月12日 上午5:37:17
 * @version V1.0
 */

package cn.osxm.ssmi.chp5.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
  * @ClassName: HelloPointCut
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Aspect
public class HelloPointCut {
    @Pointcut("execution(* cn.osxm.ssmi.chp5.aop.*.*(..))")
    public void helloPointCut() {}
}
