/**
 * @Title: MyAspect.java
 * @Package cn.osxm.ssmi.chp17.springaspect
 * @Description: TODO
 * @author oscarchen
 * @date 2019��8��7��
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
        System.out.println("ǰ��ִ��");
    }

    public void myAfterMethod(JoinPoint joinPoint) {
        System.out.println("����ִ��");
    }
}
