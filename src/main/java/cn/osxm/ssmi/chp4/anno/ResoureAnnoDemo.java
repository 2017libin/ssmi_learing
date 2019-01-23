/**
 * @Title: ResoureAnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月20日 上午8:34:43
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: ResoureAnnoDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ResoureAnnoDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				ResoureAnnoDemo.class);
		RequiredAnno beanC = (RequiredAnno) context.getBean("requiredUsage");

		context.close();

	}

}
