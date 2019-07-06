/**
 * @Title: SpringJPATests.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月6日 下午10:44:37
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: SpringJPATests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp14/spring-dbaccess.xml")
public class SpringJPATests {
    @Autowired
    private UserDao jpaUserDao;
    
    @Test
    public void jpa() {
        User user = jpaUserDao.get(1);
        
        System.out.println(user.getName());
    }
}

