/**
 * @Title: AutowiredAnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��13�� ����8:58:17
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: AutowiredAnnoDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class AutowiredAnnoDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				RequiredAnnoDemo.class);

		AutowiredUsage autowiredUsage = (AutowiredUsage) context.getBean("autowiredUsage");
		// 1.������ע���Զ�װ��
		System.out.println(autowiredUsage.getFoo());
		// 2.����setter����ע���Զ�װ��
		System.out.println(autowiredUsage.getBar());
		// 3.����ע���Զ�װ��
		System.out.println(autowiredUsage.getBaz());

		// �������͵�ע��
		// 1. ����
		System.out.println(autowiredUsage.getBazs().length);

		// 2. Set
		System.out.println(autowiredUsage.getBazSet().size());
		// 3.Map
		System.out.println(autowiredUsage.getBazMap().keySet().toString());
		context.close();

	}

}
