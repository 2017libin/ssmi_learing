/**
 * @Title: SsimXmlCfgAppInitializer.java
 * @Package cn.osxm.ssmi.chp7
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月18日 上午6:01:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @ClassName: SsimXmlCfgAppInitializer
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SsimXmlCfgAppInitializer
// extends AbstractDispatcherServletInitializer
{

	// @Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext cxt = new XmlWebApplicationContext();
		cxt.setConfigLocation("classpath:applicationContext.xml");
		return cxt;
	}

	// @Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	// @Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}

}
