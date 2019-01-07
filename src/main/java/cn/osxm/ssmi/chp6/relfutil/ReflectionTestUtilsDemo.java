/**
 * @Title: ReflectionTestUtilsDemo.java
 * @Package cn.osxm.ssmi.chp6.relfutil
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:55:11
 * @version V1.0
 */

package cn.osxm.ssmi.chp6.relfutil;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
  * @ClassName: ReflectionTestUtilsDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ReflectionTestUtilsDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyAppConfig.class);
        context.refresh();
        
        ClassA beanA=(ClassA)context.getBean("beanA");
        System.out.println(beanA.getBeanB());
        
        context.close();

    }
}
