/**
 * @Title: MyWebApplicationInitializer.java
 * @Package cn.osxm.ssmi.chp09.staticres
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月5日 下午10:32:04
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.staticres;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @ClassName: MyWebApplicationInitializer
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MyWebApplicationInitializer 
//implements WebApplicationInitializer 
{

	//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext annoAppContext = new AnnotationConfigWebApplicationContext();
		// servletContext.getServlet("default");

		annoAppContext.register(MyAppConfig.class);
		annoAppContext.refresh();
		DispatcherServlet servlet = new DispatcherServlet(annoAppContext);

	}

}
