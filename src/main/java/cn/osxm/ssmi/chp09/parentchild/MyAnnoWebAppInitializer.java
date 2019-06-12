/**
 * @Title: MyAnnoWebAppInitializer.java
 * @Package cn.osxm.ssmi.chp09.parentchild
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月6日 上午5:44:42
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.parentchild;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @ClassName: MyAnnoWebAppInitializer
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MyAnnoWebAppInitializer 
//extends AbstractAnnotationConfigDispatcherServletInitializer 
{

	//@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	//@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { MyAppConfig.class };
	}

	//@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { MyAppWebConfig.class };
	}

}
