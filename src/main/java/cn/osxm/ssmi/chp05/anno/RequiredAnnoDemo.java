/**
 * @Title: AnnoUseDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月12日 下午8:07:13
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: AnnoUseDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class RequiredAnnoDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				ResoureAnnoDemo.class);
		RequiredAnno beanC = (RequiredAnno) context.getBean("requiredAnno");

		context.close();

	}

}
