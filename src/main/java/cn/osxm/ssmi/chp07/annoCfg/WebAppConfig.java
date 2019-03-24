/**
 * @Title: WebAppConfig.java
 * @Package cn.osxm.ssmi.chp07.annoCfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月25日 上午6:03:52
 * @version V1.0
 */

package cn.osxm.ssmi.chp07.annoCfg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
/**
  * @ClassName: WebAppConfig
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = { "com.bean" })
public class WebAppConfig extends WebMvcConfigurationSupport {
    @Bean
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
        RequestMappingHandlerAdapter handlerAdapter = super.requestMappingHandlerAdapter();
        return handlerAdapter;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        return new LocaleChangeInterceptor();
    }

    // @Bean
    // public LogAspect logAspect() {
    // return new LogAspect();
    // }
}