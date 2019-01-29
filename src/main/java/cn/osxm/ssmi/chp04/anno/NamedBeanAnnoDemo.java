/**
 * @Title: NamedBeanAnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月20日 下午8:36:41
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: NamedBeanAnnoDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class NamedBeanAnnoDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				NamedBeanAnnoDemo.class);
		System.out.println(context.getBean(NamedBeanAnno.class));
		System.out.println(context.getBean("namedBeanAnno"));
		context.close();

	}

}
