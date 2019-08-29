/**
 * @Title: MyWebApplicationInitializer.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月25日 上午6:06:56
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import cn.osxm.ssmi.chp07.annoCfg.AppConfig;
/**
  * @ClassName: MyWebApplicationInitializer
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        // 1.1 Load Spring web application configuration By XML
        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
        appContext.setConfigLocation("/WEB-INF/classes/springmvc.xml");

        // 1.2 Load Load Spring web application configuration By Java
        // AnnotationConfigWebApplicationContext annoAppContext = new
        // AnnotationConfigWebApplicationContext();
        // annoAppContext.register(AppConfig.class);
        // annoAppContext.refresh();

        // Create and register the DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(appContext);
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");

    }

    // 父容器
    @SuppressWarnings("unused")
	private void initSpringConfig(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(AppConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));
    }

    @SuppressWarnings("unused")
	private void initSpringMVCConfig(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        // dispatcherContext.register(RestServiceConfiguration.class);
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatch", new DispatcherServlet(dispatcherContext));
        dispatcher.setLoadOnStartup(2);
        dispatcher.setAsyncSupported(true);
        dispatcher.addMapping("/springmvc/*");
    }

    @SuppressWarnings("unused")
	private void initLogConfig(ServletContext servletContext) {
        servletContext.setInitParameter("log4jConfigLocation", "file:${rdm.home}/log4j.properties");
        // servletContext.addListener(Log4jConfigListener.class);
        // PropertyConfigurator.configureAndWatch(System.getProperty("rdm.home") +
        // "/log4j.properties",60);
    }

    @SuppressWarnings("unused")
	private void registerServlet(ServletContext servletContext) {
        //ServletRegistration.Dynamic dynamic = servletContext.addServlet("staggingServlet", staggingServlet);
       //dynamic.setLoadOnStartup(3);
        //dynamic.addMapping("*.stagging");
    }
    
    @SuppressWarnings("unused")
	private void registerFilter(ServletContext servletContext) {
        //FilterRegistration.Dynamic filterRegistration = container.addFilter("SAMLFilter", DelegatingFilterProxy.class);
        //filterRegistration.addMappingForUrlPatterns(null, false, "/*");
        //filterRegistration.setAsyncSupported(true);
    }
    
    @SuppressWarnings("unused")
	private void registerListener(ServletContext servletContext) {
        //servletContext.addListener(RequestContextListener.class);
    }
}
