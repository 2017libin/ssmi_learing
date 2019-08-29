/**
 * @Title: MyWebAppInitializer.java
 * @Package cn.osxm.ssmi.chp09.parentchild
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月6日 上午5:46:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.parentchild;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @ClassName: MyWebAppInitializer
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MyWebAppInitializer 
//extends AbstractDispatcherServletInitializer
{

	//@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	//@Override
	protected WebApplicationContext createRootApplicationContext() {
		XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
		applicationContext.setConfigLocation("/WEB-INF/spring/applicationContext.xml");
		return applicationContext;
	}

	//@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
		applicationContext.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");
		return applicationContext;
	}

}
