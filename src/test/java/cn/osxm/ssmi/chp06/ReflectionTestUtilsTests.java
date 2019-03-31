/**
 * @Title: ReflectionTestUtilsTests.java
 * @Package cn.osxm.ssmi.chp06
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��3��30�� ����8:22:17
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
		//����˽�б�����ֵ
		ReflectionTestUtils.setField(foo, "name", "Oscar");
		//���ó�ʼ�������ٷ���
		ReflectionTestUtils.invokeMethod(foo, "onInit");
		ReflectionTestUtils.invokeMethod(foo, "onDestroy");	
	}
}
