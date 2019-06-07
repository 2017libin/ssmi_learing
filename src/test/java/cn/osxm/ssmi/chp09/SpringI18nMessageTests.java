/**
 * @Title: SpringI18nMessageTests.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月7日 上午10:28:37
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.Assert;
/**
  * @ClassName: SpringI18nMessageTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp09/i18n-messages.xml")
public class SpringI18nMessageTests {

    @Autowired
    private ApplicationContext applicationContext;
    
    @Test
    public void getMessage() {
        String username = applicationContext.getMessage("username", null,Locale.ENGLISH);
        Assert.assertEquals(username, "Zhang San");
        System.out.println(username);
    }
}

