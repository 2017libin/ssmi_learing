/**
 * @Title: ConvertServiceMvcTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 上午8:46:19
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
/**
  * @ClassName: ConvertServiceMvcTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp08/mvc-convert.xml")
@WebAppConfiguration
public class ConvertServiceMvcTests {

    @Autowired
    private DefaultConversionService defaultConversionService;
    

}
