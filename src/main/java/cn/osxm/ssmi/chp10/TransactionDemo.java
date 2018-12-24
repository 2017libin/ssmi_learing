/**
 * @Title: TransactionDemo.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月25日 上午6:21:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: TransactionDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class TransactionDemo {
	/**
     * @Title: main
     * @Description: TODO
     * @param args
     */

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml", TransactionDemo.class);
        FooService fooService =(FooService) context.getBean("fooService");
        fooService.addFoo(new Foo());
    }

}
