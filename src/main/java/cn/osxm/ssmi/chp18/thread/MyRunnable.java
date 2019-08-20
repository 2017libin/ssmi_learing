/**
 * @Title: MyRunnable.java
 * @Package cn.osxm.ssmi.chp18.thread
 * @Description: TODO
 * @author oscarchen
 * @date 2019年8月20日
 * @version V1.0
 */
package cn.osxm.ssmi.chp18.thread;

/**
 * @ClassName: MyRunnable
 * @Description: TODO
 * @author oscarchen
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("自定义Runnable运行");
	}

}
