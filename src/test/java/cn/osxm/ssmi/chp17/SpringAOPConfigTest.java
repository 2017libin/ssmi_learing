/**
 * @Title: SpringAOPConfigTest.java
 * @Package cn.osxm.ssmi.chp17
 * @Description: TODO
 * @author oscarchen
 * @date 2019Äê8ÔÂ7ÈÕ
 * @version V1.0
 */
package cn.osxm.ssmi.chp17;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
  * @ClassName: SpringAOPConfigTest
  * @Description: TODO
  * @author oscarchen
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp17/spring-aop-xml.xml")
public class SpringAOPConfigTest {

    
    @Autowired
    private IUserService  userService;
    
    @Test
    public void aopConfig() {
        userService.add();
    }
}
