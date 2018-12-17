/**
 * @Title: SsmiApplicationInitializer.java
 * @Package cn.osxm.ssmi.chp7
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��18�� ����6:02:07
 * @version V1.0
 */

package cn.osxm.ssmi.chp7;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @ClassName: SsmiApplicationInitializer
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SsmiApplicationInitializer
//implements WebApplicationInitializer
{

	// @Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		XmlWebApplicationContext appContext = new XmlWebApplicationContext();
		appContext.setConfigLocation("classpath:applicationContext.xml");

		ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet",
				new DispatcherServlet(appContext));
		registration.setLoadOnStartup(1);
		registration.addMapping("/");

	}

}
