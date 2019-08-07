/**
 * @Title: SpringAOPAnnoConfigTest.java
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
import cn.osxm.ssmi.chp17.anno.UserService;

/**
 * @ClassName: SpringAOPAnnoConfigTest
 * @Description: TODO
 * @author oscarchen
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp17/spring-aop-anno.xml")
public class SpringAOPAnnoConfigTest {
	@Autowired
	private UserService userService;

	@Test
	public void aopAnnoConfig() throws Exception {
		userService.add();
	}
}
