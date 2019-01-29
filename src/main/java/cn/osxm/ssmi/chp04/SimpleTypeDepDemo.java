/**
 * @Title: ConstructorArgsDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月18日 下午10:35:08
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: ConstructorArgsDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SimpleTypeDepDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml", SimpleTypeDepDemo.class);
		// 通过在XML配置的bean的id找到类的实例
		TwoService twoService = (TwoService) context.getBean("twoService");
		twoService.doMethod();

		System.out.println("构造注入简单类型的依赖：");
		SimpleTypeConArgsDepService simpleTypeDepService = (SimpleTypeConArgsDepService) context.getBean("simpleTypeDepService");
		simpleTypeDepService.fooBar();
		
		System.out.println("设置值注入简单类型的依赖：");
		SimpleTypePropertyDepService simpleTypePropertyDepService  = (SimpleTypePropertyDepService) context.getBean("simpleTypePropertyDepService");
		simpleTypePropertyDepService.fooBar();
		//获取的是bean id, 使用idref会验证
		String fourServiceBeanId = simpleTypePropertyDepService.getBaz();
		FourService fourService = (FourService)context.getBean(fourServiceBeanId);
		System.out.println("通过idref获取的bean"+fourService.toString());
		
		System.out.println("设置值注入简单类型的依赖的简洁方式：");
		SimpleTypePropertyDepService simpleTypePropertyDepService2  = (SimpleTypePropertyDepService) context.getBean("simpleTypePropertyDepService2");
		simpleTypePropertyDepService2.fooBar();		
	
		System.out.println("使用java.util.Properties设置值注入简单类型的依赖的简洁方式：");
		PropertiesDepService propertiesDepService  = (PropertiesDepService) context.getBean("propertiesDepService");
		propertiesDepService.fooBar();		
	}

}
