/**
 * @Title: SpringAdvisorTest.java
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
  * @ClassName: SpringAdvisorTest
  * @Description: TODO
  * @author oscarchen
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp17/spring-advisor.xml")
public class SpringAdvisorTest {

    @Autowired
    private IUserService userServiceProxy;
    
    
    @Test
    public void testAdvisor() {
    	userServiceProxy.add();
    }
}
