/**
 * @Title: MyThread.java
 * @Package cn.osxm.ssmi.chp18.thread
 * @Description: TODO
 * @author oscarchen
 * @date 2019��8��20��
 * @version V1.0
 */
package cn.osxm.ssmi.chp18.thread;

/**
 * @ClassName: MyThread
 * @Description: TODO
 * @author oscarchen
 */
public class MyThread extends Thread {

	public MyThread() {
		super();
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("MyThread Run");
	}
}
