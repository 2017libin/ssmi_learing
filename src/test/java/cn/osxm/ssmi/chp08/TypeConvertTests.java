/**
 * @Title: PropertyEditorTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月26日 上午9:46:29
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
  * @ClassName: PropertyEditorTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp08/type-convert.xml")
public class TypeConvertTests {

	@Autowired
	private User user;
	
	@Test
	public void containerTypeConvert() {
		System.out.println(user.getBirthDay());
	}
}
