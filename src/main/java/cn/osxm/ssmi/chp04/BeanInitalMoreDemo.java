/**
 * @Title: BeanInitalMoreDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:40:47
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: BeanInitalMoreDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class BeanInitalMoreDemo {
	 /**
     * @Title: main
     * @Description: TODO
     * @param args
     */

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml", BeanInitalMoreDemo.class);
        StaticFactoryService staticFactoryService = (StaticFactoryService) context.getBean("staticFactoryService");
        System.out.println(staticFactoryService.getInstance().toString());

        Foo foo = (Foo)context.getBean("foo");
        System.out.println(foo.toString());
    }
}
