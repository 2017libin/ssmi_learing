/**
 * @Title: Demo.java
 * @Package cn.osxm.ssmi.chp4.methodinj
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 上午6:35:08
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.methodinj;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
  * @ClassName: Demo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class Demo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml",
				Demo.class);
		ClassA beanA = (ClassA) context.getBean("beanA");
		beanA.useBMoreTimes();
		beanA.useCMoreTimes();
		
		
		ClassALookUp beanALookUp = (ClassALookUp) context.getBean("beanALookUp");
		beanALookUp.useBMoreTimes();
		
		context.close();

	}

}
