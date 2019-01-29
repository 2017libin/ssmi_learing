/**
 * @Title: AnnoUseDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月12日 下午8:07:13
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

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

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				RequiredAnnoDemo.class);
		
		ResoureAnno resoureAnno = (ResoureAnno) context.getBean("resoureAnno");
			
		System.out.println(resoureAnno.getFoo());
		System.out.println(resoureAnno.getContext());
		System.out.println(resoureAnno.getBar());
		context.close();
		
	
		
	}

}
