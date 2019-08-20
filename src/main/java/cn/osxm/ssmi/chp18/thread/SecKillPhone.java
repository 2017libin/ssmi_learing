/**
 * @Title: SecKillPhone.java
 * @Package cn.osxm.ssmi.chp18.thread
 * @Description: TODO
 * @author oscarchen
 * @date 2019年8月20日
 * @version V1.0
 */
package cn.osxm.ssmi.chp18.thread;

/**
 * @ClassName: SecKillPhone
 * @Description: TODO
 * @author oscarchen
 */
public class SecKillPhone {
	// static int iTotal = 10;
	int iTotal = 10;

	public void secKill() {
		Runnable task = new Runnable() {
			public void run() {
				while (iTotal > 0) {
					iTotal--;
					System.out.println(Thread.currentThread().getName() + ",抢了1个手机,还剩" + iTotal + "个.");
				}
			}
		};
		Thread thread1 = new Thread(task, "秒杀线程1");
		Thread thread2 = new Thread(task, "秒杀线程2");
		Thread thread3 = new Thread(task, "秒杀线程3");
		thread1.start();
		thread2.start();
		thread3.start();
	}

	public static void main(String[] args) {
		SecKillPhone secKillPhone = new SecKillPhone();
		secKillPhone.secKill();
	}
}
