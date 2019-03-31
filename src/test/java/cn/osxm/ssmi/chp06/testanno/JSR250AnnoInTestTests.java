/**
 * @Title: JSR250AnnoInTestTests.java
 * @Package cn.osxm.ssmi.chp06.testanno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月31日 上午6:25:15
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.com.anno.Baz;
import cn.osxm.ssmi.com.anno.Foo;

/**
 * @ClassName: JSR250AnnoInTestTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp06/testAnno.xml" })
public class JSR250AnnoInTestTests {
	

	@Resource
	private Foo foo;

	
	@Test
	public void testMethod() {
		System.out.println(foo.toString());
		
	}
}
