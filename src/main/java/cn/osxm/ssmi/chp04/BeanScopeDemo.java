/**
 * @Title: BeanScopeDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月23日 上午9:55:43
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: BeanScopeDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class BeanScopeDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml", BeanScopeDemo.class);
		FourService singleFourService = (FourService) context.getBean("singleFourService");
		System.out.println("singleton实例第一次获取：" + singleFourService.toString());
		singleFourService = (FourService) context.getBean("singleFourService");
		System.out.println("singleton实例第二次获取：" + singleFourService.toString());
		
		FourService prototypeFourService= (FourService) context.getBean("prototypeFourService");
		System.out.println("prototype实例第一次获取：" + prototypeFourService.toString());
		prototypeFourService = (FourService) context.getBean("prototypeFourService");
		System.out.println("prototype实例第二次获取：" + prototypeFourService.toString());
	}

}
