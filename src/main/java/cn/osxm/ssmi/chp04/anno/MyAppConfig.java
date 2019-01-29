/**
 * @Title: MyAppConfig.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��7�� ����10:39:57
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
        hello.setName("����������bean");
        return hello;
        //return new HelloClass("����������bean");
    }
    
    @Bean
    @Profile("prd")
    public HelloClass getProdBean() {
        HelloClass hello = new HelloClass();
        hello.setName("��ʽ������bean");
        return hello;
        //return new HelloClass("��ʽ������bean");
    }
}

