/**
 * @Title: MvcConvertConfigure.java
 * @Package cn.osxm.ssmi.chp08.convertservice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 上午8:49:14
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.convertservice;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
  * @ClassName: MvcConvertConfigure
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Configuration
@EnableWebMvc
public class MvcConvertConfigure extends WebMvcConfigurationSupport{
    
    @Autowired
    private FormattingConversionService mvcConversionService;
    
    @PostConstruct
    public void addCustomConvert(){
        if (mvcConversionService!=null){
            //mvcConversionService.addConverter(new MyUserConvert());
        	mvcConversionService.addConverter(new MyDateConvert());
        }
    }

    
    /**
    @Bean
    public FormattingConversionService conversionService() {         
        FormattingConversionService conversionService = new DefaultFormattingConversionService();
        conversionService.addConverter(new MyUserConvert());
        return conversionService;
    }*/

}


