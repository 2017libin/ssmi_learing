/**
 * @Title: InjectNamedAnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月20日 下午7:52:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: InjectNamedAnnoDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class InjectNamedAnnoDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				ResoureAnnoDemo.class);
		InjectNamedAnno injectNamedAnno = (InjectNamedAnno) context.getBean("injectNamedAnno");
		System.out.println(injectNamedAnno.getFoo());
		System.out.println(injectNamedAnno.getBar());
		System.out.println(injectNamedAnno.getBaz());

		context.close();
	}

}
