/**
 * @Title: JUnit3Test.java
 * @Package cn.osxm.ssmi.chp6
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月12日 上午5:44:32
 * @version V1.0
 */

package cn.osxm.ssmi.chp06;

import junit.framework.TestCase;

/**
 * @ClassName: JUnit3Test
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class JUnit3Test extends TestCase{
	private int iNo = 0;

	@Override
	protected void setUp() {
		// "Initial Some ...."
		iNo = 1;
	}

	public  void testStr() {
		assertEquals(iNo, 1);
	}
}
