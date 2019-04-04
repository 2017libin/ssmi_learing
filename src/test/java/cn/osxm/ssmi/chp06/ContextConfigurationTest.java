/**
 * @Title: ContextConfigurationTest.java
 * @Package cn.osxm.ssmi.chp6
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月13日 下午8:31:41
 * @version V1.0
 */

package cn.osxm.ssmi.chp06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.chp02.HelloService;
import cn.osxm.ssmi.chp04.anno.MyAppConfig;

/**
  * @ClassName: ContextConfigurationTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
//@ContextConfiguration(locations ="classpath:cn/osxm/ssmi/chp06/applicationContext.xml")
//@ContextConfiguration(classes = MyAppConfig.class)
//@ContextConfiguration("classpath:cn/osxm/ssmi/chp06/applicationContext.xml")

public class ContextConfigurationTest {
	@Autowired()
    private HelloService helloService;
    
    @Test
    public void sayHello() {
        helloService.sayHello();
    }
    
    ApplicationContextInitializer a;
}
