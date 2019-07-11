/**
 * @Title: SpringMyBatisTests.java
 * @Package cn.osxm.ssmi.chp15
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月10日 下午10:58:26
 * @version V1.0
 */

package cn.osxm.ssmi.chp15;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: SpringMyBatisTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp15/spring-mybatis.xml")
public class SpringMyBatisTests {

	@Autowired
    public UserMapper userMapper;
    
    @Test
    public void beanMapper() {
        User user = userMapper.getUser(1);
        System.out.println(user.getName());
    }
}
