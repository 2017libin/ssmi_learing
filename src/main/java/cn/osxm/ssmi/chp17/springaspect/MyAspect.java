/**
 * @Title: MyAspect.java
 * @Package cn.osxm.ssmi.chp17.springaspect
 * @Description: TODO
 * @author oscarchen
 * @date 2019年8月7日
 * @version V1.0
 */
package cn.osxm.ssmi.chp17.springaspect;

/**
  * @ClassName: MyAspect
  * @Description: TODO
  * @author oscarchen
  */
public class MyAspect {
    public void myBeforeMethod(JoinPoint joinPoint) {
        System.out.println("前置执行");
    }

    public void myAfterMethod(JoinPoint joinPoint) {
        System.out.println("后置执行");
    }
}
