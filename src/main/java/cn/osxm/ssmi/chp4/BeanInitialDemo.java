/**
 * @Title: BeanInitialDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月10日 下午9:14:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: BeanInitialDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class BeanInitialDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml",BeanInitialDemo.class);
		ThirdService thirdService = (ThirdService)context.getBean("thirdService");
		System.out.println(thirdService);
		
	    thirdService = (ThirdService)context.getBean("thirdService2");
		System.out.println(thirdService);
		
		FourService fourService = (FourService)context.getBean("fourService");
		System.out.println(fourService);
	}

}
