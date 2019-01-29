/**
 * @Title: MyAppConfig.java
 * @Package cn.osxm.ssmi.chp6
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月13日 下午8:33:49
 * @version V1.0
 */

package cn.osxm.ssmi.chp06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.osxm.ssmi.chp02.HelloService;

/**
  * @ClassName: MyAppConfig
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Configuration
public class MyAppConfig {
    @Bean
    public HelloService getHelloBean() {
        HelloService hello = new HelloService();
        return hello;
    }
}
