/**
 * @Title: ThreadLocalTest.java
 * @Package cn.osxm.ssmi.chp18
 * @Description: TODO
 * @author oscarchen
 * @date 2019Äê8ÔÂ20ÈÕ
 * @version V1.0
 */
package cn.osxm.ssmi.chp18;

import org.junit.Test;

/**
 * @ClassName: ThreadLocalTest
 * @Description: TODO
 * @author oscarchen
 */
public class ThreadLocalTest {
	@Test
	public void test() {
		ThreadLocal<Integer> iThreadLocal = new ThreadLocal<Integer>();
		iThreadLocal.set(10);
		iThreadLocal.get();
		System.out.println(iThreadLocal.get());
	}
}
