/**
 * @Title: PropertyEditorDemo.java
 * @Package cn.osxm.ssmi.chp5
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月4日 下午9:52:39
 * @version V1.0
 */

package cn.osxm.ssmi.chp5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: PropertyEditorDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class PropertyEditorDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml", PropertyEditorDemo.class);
		School school = (School) context.getBean("school");
		System.out.println(school.getPrincipal().getName());
	}

}
