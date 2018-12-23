/**
 * @Title: CallbackDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月24日 上午5:14:57
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: CallbackDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class CallbackDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml", CallbackDemo.class);
		ImplCallbackService implCallbackService = (ImplCallbackService)context.getBean("implCallbackService");		
		CfgCallbackService  cfgCallbackService = (CfgCallbackService)context.getBean("cfgCallbackService");
		AnnoCallbackService  annoCallbackService = (AnnoCallbackService)context.getBean("annoCallbackService");	
		context.registerShutdownHook();
	}

}
