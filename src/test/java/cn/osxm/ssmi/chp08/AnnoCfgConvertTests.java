/**
 * @Title: AnnoCfgConvertTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 上午8:56:09
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
  * @ClassName: AnnoCfgConvertTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=cn.osxm.ssmi.chp08.convertservice.ConvertConfigure.class)
public class AnnoCfgConvertTests {

    @Autowired
    private ConversionService conversionService;
    
    @Test
    public void conversionConfig() {
        //Assert.assertNotNull(conversionService);
        User user = conversionService.convert("User 1", User.class);
        System.out.println(user);
    }
}