/**
 * @Title: JUnit5Test.java
 * @Package cn.osxm.ssmi.chp6
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月12日 上午5:42:40
 * @version V1.0
 */

package cn.osxm.ssmi.chp6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @ClassName: JUnit5Test
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class JUnit5Test {
	private int iNo = 0;

	@BeforeEach
	void mySetUp() {
		// "Initial Some ...."
		iNo = 1;
	}

	@Test
	@DisplayName("start test tStr method....")
	void tStr() {
		assertEquals(iNo, 1);
	}
}
