/**
 * @Title: ThreadTest.java
 * @Package cn.osxm.ssmi.chp18
 * @Description: TODO
 * @author oscarchen
 * @date 2019��8��20��
 * @version V1.0
 */
package cn.osxm.ssmi.chp18;

import org.junit.Test;

import cn.osxm.ssmi.chp18.thread.MyThread;

/**
 * @ClassName: ThreadTest
 * @Description: TODO
 * @author oscarchen
 */
public class ThreadTest {
	@Test
	public void threadTest() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("�߳�ִ��");
			}
		};
		thread.start();
	}

	// @Test
	public void runTest() {
		MyThread myThread = new MyThread();
		myThread.run();

		myThread = new MyThread("My Thread");
		myThread.run();
	}
}
