/**
 * @Title: AnnoCfgMvcConvertTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 上午8:45:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
/**
  * @ClassName: AnnoCfgMvcConvertTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=cn.osxm.ssmi.chp08.convertservice.MvcConvertConfigure.class)
@WebAppConfiguration
public class AnnoCfgMvcConvertTests {

    @Autowired
    private FormattingConversionService mvcConversionService;
    
    //@Autowired
    //private  ConversionService conversionService ;

     @Autowired
    private ApplicationContext applicationContext;
    
    @Test
    public void conversionConfig() {
        //Assert.assertNotNull(applicationContext);
        //Assert.assertNotNull(applicationContext.getBean(FormattingConversionServiceFactoryBean.class));
        Assert.assertNotNull(mvcConversionService);
       // Assert.assertNotNull(conversionService);
        //Assert.assertNotNull(formattingConversionServiceFactoryBean);
        User user = mvcConversionService.convert("User 1", User.class);
        System.out.println(user);
        
      //String[] conversionServiceNames  = applicationContext.getBeanNamesForType(FormattingConversionService.class);
     // System.out.println(conversionServiceNames.length);
    }
}