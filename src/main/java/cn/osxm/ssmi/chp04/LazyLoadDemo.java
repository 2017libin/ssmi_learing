/**
 * @Title: LazyLoadDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月6日 上午8:42:44
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
  * @ClassName: LazyLoadDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class LazyLoadDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml", LazyLoadDemo.class);
		//CfgCallbackService  cfgCallbackService = (CfgCallbackService)context.getBean("lazyInitService");
		
		UseLazyService useLazyService = (UseLazyService)context.getBean("useLazyService");
		
		
		context.close();
	}

}
