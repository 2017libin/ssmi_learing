/**
 * @Title: ConvertServiceTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��5��22�� ����10:04:16
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.chp08.convertservice.MyUserConvert;
import cn.osxm.ssmi.chp08.propertyeditor.User;
/**
  * @ClassName: ConvertServiceTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp08/data-bind-convert.xml")
public class ConvertServiceTests {
	  @Autowired
	    private DefaultConversionService defaultConversionService;
	    
	    @Test
	    public void convert() {
	        //DefaultConversionService conversionService = new DefaultConversionService();     
	        //conversionService.addConverter(new MyUserConvert());
	        User user = defaultConversionService.convert("User 1", User.class);
	        System.out.println(user);
	    }
}
