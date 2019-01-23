/**
 * @Title: QualifierAnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��21�� ����10:42:27
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: QualifierAnnoDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class QualifierAnnoDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoApplicationContext.xml",
				QualifierAnnoDemo.class);
		System.out.println(context.getBean("myQualifierAnno"));
		context.close();

	}

}
