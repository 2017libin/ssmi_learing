/**
 * @Title: NoThreadSecurity.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月28日 上午6:32:27
 * @version V1.0
 */

package cn.osxm.ssmi.chp11.thread;

/**
 * @ClassName: NoThreadSecurity
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class NoThreadSecurity {
	static int iTotal = 0;

	static int iAddTimes = 10;

	class Calculator implements Runnable {

		@Override
		public void run() {
			while (iAddTimes > 0) {
				System.out.println(Thread.currentThread().getName() + "--->第：  " + iAddTimes + " 次加1.");
				iAddTimes--;
				iTotal += 1;
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (iAddTimes <= 0) {
				System.out.println(Thread.currentThread().getName() + "--->计算结束，计算结果=" + iTotal + "!");
			}
		}
	}

	public static void main(String[] args) {
		Calculator calculator = new NoThreadSecurity().new Calculator();
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
