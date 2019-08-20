/**
 * @Title: RunnableTest.java
 * @Package cn.osxm.ssmi.chp18
 * @Description: TODO
 * @author oscarchen
 * @date 2019年8月20日
 * @version V1.0
 */
package cn.osxm.ssmi.chp18;

import org.junit.Test;

/**
 * @ClassName: RunnableTest
 * @Description: TODO
 * @author oscarchen
 */
public class RunnableTest {
	@Test
	public void test() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Runnable运行");
			}
		};
		Thread thread = new Thread(r);
		thread.start();
	}
}
