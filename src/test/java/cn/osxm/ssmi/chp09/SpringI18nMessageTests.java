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
import org.springframework.context.MessageSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
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
    
    @Autowired
    private MessageSource  messageSource;
    
    @Test
    public void getMessage() {
    	String username = messageSource.getMessage("username", new String[]{"变量"}, Locale.CHINA);
    	System.out.println(username);
    	//username = messageSource.getMessage("username1", null, "User Name",Locale.CHINA);
    	username = messageSource.getMessage("username1", null,Locale.CHINA);
    	System.out.println(username);
        username = applicationContext.getMessage("username", null,Locale.US);
        System.out.println(username);
        //AbstractApplicationContext.initMessageSource();
        //Assert.assertEquals(username, "User Name");
        //ReloadableResourceBundleMessageSource
        //String chineseUsername = applicationContext.getMessage("username", null,Locale.CHINESE);
        //System.out.println(chineseUsername);
    }
}

