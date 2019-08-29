/**
 * @Title: BeanScopeDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��23�� ����9:55:43
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
		System.out.println("singletonʵ����һ�λ�ȡ��" + singleFourService.toString());
		singleFourService = (FourService) context.getBean("singleFourService");
		System.out.println("singletonʵ���ڶ��λ�ȡ��" + singleFourService.toString());
		
		FourService prototypeFourService= (FourService) context.getBean("prototypeFourService");
		System.out.println("prototypeʵ����һ�λ�ȡ��" + prototypeFourService.toString());
		prototypeFourService = (FourService) context.getBean("prototypeFourService");
		System.out.println("prototypeʵ���ڶ��λ�ȡ��" + prototypeFourService.toString());
	}

}
