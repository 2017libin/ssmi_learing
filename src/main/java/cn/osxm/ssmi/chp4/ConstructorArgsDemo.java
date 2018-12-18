/**
 * @Title: ConstructorArgsDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��18�� ����10:35:08
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: ConstructorArgsDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ConstructorArgsDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml", ConstructorArgsDemo.class);
		// ͨ����XML���õ�bean��id�ҵ����ʵ��
		TwoService twoService = (TwoService) context.getBean("twoService");
		twoService.doMethod();

		SimpleTypeDepService simpleTypeDepService = (SimpleTypeDepService) context.getBean("simpleTypeDepService");
		simpleTypeDepService.fooBar();
	}

}
