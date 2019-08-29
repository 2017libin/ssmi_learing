/**
 * @Title: CallbackDemo.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月24日 上午5:14:57
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

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
		// 如果设置了懒加载， 需要在获取bean的时候才执行
		// AnnoCallbackService annoCallbackService =
		// (AnnoCallbackService)context.getBean("annoCallbackService");
		// ImplCallbackService implCallbackService =
		// (ImplCallbackService)context.getBean("implCallbackService");
		// CfgCallbackService cfgCallbackService =
		// (CfgCallbackService)context.getBean("cfgCallbackService");

		//AllCallbackService allCallbackService = (AllCallbackService) context.getBean("allCallbackService");

		context.registerShutdownHook();
		context.close();

	}

}
