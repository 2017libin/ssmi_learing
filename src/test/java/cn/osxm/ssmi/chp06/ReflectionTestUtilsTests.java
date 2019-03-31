/**
 * @Title: ReflectionTestUtilsTests.java
 * @Package cn.osxm.ssmi.chp06
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月30日 上午8:22:17
 * @version V1.0
 */

package cn.osxm.ssmi.chp06;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * @ClassName: ReflectionTestUtilsTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ReflectionTestUtilsTests {
	@Test
	public void test() {
		
		SpringJUnit4ClassRunner s;
		Foo foo = new Foo();
		//设置私有变量的值
		ReflectionTestUtils.setField(foo, "name", "Oscar");
		//调用初始化和销毁方法
		ReflectionTestUtils.invokeMethod(foo, "onInit");
		ReflectionTestUtils.invokeMethod(foo, "onDestroy");	
	}
}
