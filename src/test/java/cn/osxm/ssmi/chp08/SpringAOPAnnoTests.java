/**
 * @Title: SpringAOPAnnoTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月19日 上午10:17:31
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.chp08.aop.IUserService;
import cn.osxm.ssmi.chp08.aop.UserServiceImpl;
import cn.osxm.ssmi.chp08.aop.springaspect.UserService;
/**
  * @ClassName: SpringAOPAnnoTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp08/spring-aop-anno.xml")
public class SpringAOPAnnoTests {

    @Autowired
    private IUserService userService;
    

    
    @Test
    public void testUserAddPointCut() {
        userService.add();
    }

}
