/**
 * @Title: I18nMessageTests.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��7�� ����10:28:00
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
/**
  * @ClassName: I18nMessageTests
  * @Description: TODO1
  * @author osxm:oscarxueming
  */

public class I18nMessageTests {
	@Test
    public void javaBaseI18n() throws UnsupportedEncodingException {
        String baseName = "cn.osxm.ssmi.chp09.i18n.messages";
        String engUserName = ResourceBundle.getBundle(baseName, new Locale("en", "US")).getString("username");
        //engUserName = ResourceBundle.getBundle(baseName, new Locale("en")).getString("username");
        String chineseUserName = ResourceBundle.getBundle(baseName, new Locale("zh", "CN")).getString("username");
        chineseUserName =  new String(ResourceBundle.getBundle(baseName, new Locale("zh", "CN")).getString("username").getBytes("ISO-8859-1"), "UTF8");
        
        System.out.println(chineseUserName);
        System.out.println(engUserName);
        //System.out.println(chineseUserName);
    }
    
    //@Test
    /*public void springI18n() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:cn.osxm.ssmi.chp09.i18n.messages");
        messageSource.setCacheSeconds(5);
        Locale locale = new Locale("en","EN");
        String username = messageSource.getMessage("message.user.username", null, locale);
        System.out.println(username);
        
    }*/
}
