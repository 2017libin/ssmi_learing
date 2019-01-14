/**
 * @Title: SessionScopedBeanTest.java
 * @Package cn.osxm.ssmi.chp6.webbean
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月13日 下午8:28:22
 * @version V1.0
 */

package cn.osxm.ssmi.chp6.webbean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.osxm.ssmi.chp2.UserService;

/**
  * @ClassName: SessionScopedBeanTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp6/webApplicationContext.xml" })
@WebAppConfiguration
public class SessionScopedBeanTest {
    @Autowired
    UserService userService;

    @Autowired
    MockHttpSession session;
    
    @Test
    public void sessionScope() throws Exception {
        session.setAttribute("theme", "blue");

        // assert results
    }
}
