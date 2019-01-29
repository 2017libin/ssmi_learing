/**
 * @Title: ConstructorArgsDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��18�� ����10:35:08
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
		// ͨ����XML���õ�bean��id�ҵ����ʵ��
		TwoService twoService = (TwoService) context.getBean("twoService");
		twoService.doMethod();

		System.out.println("����ע������͵�������");
		SimpleTypeConArgsDepService simpleTypeDepService = (SimpleTypeConArgsDepService) context.getBean("simpleTypeDepService");
		simpleTypeDepService.fooBar();
		
		System.out.println("����ֵע������͵�������");
		SimpleTypePropertyDepService simpleTypePropertyDepService  = (SimpleTypePropertyDepService) context.getBean("simpleTypePropertyDepService");
		simpleTypePropertyDepService.fooBar();
		//��ȡ����bean id, ʹ��idref����֤
		String fourServiceBeanId = simpleTypePropertyDepService.getBaz();
		FourService fourService = (FourService)context.getBean(fourServiceBeanId);
		System.out.println("ͨ��idref��ȡ��bean"+fourService.toString());
		
		System.out.println("����ֵע������͵������ļ�෽ʽ��");
		SimpleTypePropertyDepService simpleTypePropertyDepService2  = (SimpleTypePropertyDepService) context.getBean("simpleTypePropertyDepService2");
		simpleTypePropertyDepService2.fooBar();		
	
		System.out.println("ʹ��java.util.Properties����ֵע������͵������ļ�෽ʽ��");
		PropertiesDepService propertiesDepService  = (PropertiesDepService) context.getBean("propertiesDepService");
		propertiesDepService.fooBar();		
	}

}
