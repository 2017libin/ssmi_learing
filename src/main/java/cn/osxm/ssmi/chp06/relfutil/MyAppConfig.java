/**
 * @Title: MyAppConfig.java
 * @Package cn.osxm.ssmi.chp6.relfutil
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:53:56
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.relfutil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
  * @ClassName: MyAppConfig
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Configuration
public class MyAppConfig {

    @Bean(name="beanA")
    public ClassA beanA() {
        ClassA beanA = new ClassA();
        return beanA;
    }
    
    @Bean(name="beanB")
    public ClassB beanB() {
        ClassB beanB = new ClassB();
        return beanB;
    }
}
