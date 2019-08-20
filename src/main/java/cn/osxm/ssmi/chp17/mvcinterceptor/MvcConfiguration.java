/**
 * @Title: MvcConfiguration.java
 * @Package cn.osxm.ssmi.chp17.mvcinterceptor
 * @Description: TODO
 * @author oscarchen
 * @date 2019Äê8ÔÂ20ÈÕ
 * @version V1.0
 */
package cn.osxm.ssmi.chp17.mvcinterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
  * @ClassName: MvcConfiguration
  * @Description: TODO
  * @author oscarchen
  */
@Configuration
public class MvcConfiguration extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SessionCheckInterceptor()).addPathPatterns("/users/**");
    }
    
}
