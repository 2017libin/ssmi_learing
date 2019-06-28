/**
 * @Title: ThreadSynchronizedSecurity.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月28日 下午10:23:11
 * @version V1.0
 */

package cn.osxm.ssmi.chp11.thread;

/**
 * @ClassName: ThreadSynchronizedSecurity
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ThreadSynchronizedSecurity {
	static int iTotal = 0;

	static int iAddTimes = 10;

	class Calculator implements Runnable {

		@Override
		public void run() {

			while (iAddTimes > 0) {
				synchronized (this) {
					if (iAddTimes <= 0) {
						return;
					}
					System.out.println(Thread.currentThread().getName() + "--->第  " + iAddTimes + " 次加1.");
					iTotal += 1;
					iAddTimes--;
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if (iAddTimes <= 0) {
				System.out.println(Thread.currentThread().getName() + "--->计算结束，计算结果=" + iTotal + ".");
			}
		}

	}

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new ThreadSynchronizedSecurity().new Calculator();
		Thread thread1 = new Thread(calculator, "1号计算器");
		Thread thread2 = new Thread(calculator, "2号计算器");
		Thread thread3 = new Thread(calculator, "3号计算器");
		Thread thread4 = new Thread(calculator, "4号计算器");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
