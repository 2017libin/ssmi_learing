/**
 * @Title: ConvertConfigure.java
 * @Package cn.osxm.ssmi.chp08.convertservice
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 上午8:48:35
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.convertservice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionService;
/**
  * @ClassName: ConvertConfigure
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Configuration
public class ConvertConfigure {

    
    @Bean
    public FormattingConversionService conversionService() {
        FormattingConversionService conversionService = new FormattingConversionService();
        conversionService.addConverter(new MyUserConvert());    
        return conversionService;
    }
}