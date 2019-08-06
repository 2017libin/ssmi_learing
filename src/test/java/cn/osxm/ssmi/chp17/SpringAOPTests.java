/**
 * @Title: SpringAOPTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:35:45
 * @version V1.0
 */

package cn.osxm.ssmi.chp17;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
/**
  * @ClassName: SpringAOPTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp16/spring-aop.xml")
public class SpringAOPTests {

    
    @Autowired
    private IUserService  userService;
    
    //no interface, use CGLIB
    @Autowired
    private UserServiceNoInterface  userServiceImpl;

    //@Test
    public void testUserAddPointCut() {
        userService.add();
    }
    
    @Test
    public void testAutoCglib() {
        userServiceImpl.add();
    }

}