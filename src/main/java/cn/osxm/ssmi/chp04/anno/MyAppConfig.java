/**
 * @Title: MyAppConfig.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:39:57
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
  * @ClassName: MyAppConfig
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Configuration
public class MyAppConfig {

    @Bean
    @Profile("dev")
    public HelloClass getDevBean() {
        HelloClass hello = new HelloClass();
        hello.setName("开发环境的bean");
        return hello;
        //return new HelloClass("开发环境的bean");
    }
    
    @Bean
    @Profile("prd")
    public HelloClass getProdBean() {
        HelloClass hello = new HelloClass();
        hello.setName("正式环境的bean");
        return hello;
        //return new HelloClass("正式环境的bean");
    }
}

