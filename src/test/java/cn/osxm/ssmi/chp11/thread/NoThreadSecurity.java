/**
 * @Title: NoThreadSecurity.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��28�� ����6:32:27
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
				System.out.println(Thread.currentThread().getName() + "--->�ڣ�  " + iAddTimes + " �μ�1.");
				iAddTimes--;
				iTotal += 1;
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (iAddTimes <= 0) {
				System.out.println(Thread.currentThread().getName() + "--->���������������=" + iTotal + "!");
			}
		}
	}

	public static void main(String[] args) {
		Calculator calculator = new NoThreadSecurity().new Calculator();
		Thread thread1 = new Thread(calculator, "1�ż�����");
		Thread thread2 = new Thread(calculator, "2�ż�����");
		Thread thread3 = new Thread(calculator, "3�ż�����");
		Thread thread4 = new Thread(calculator, "4�ż�����");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}
}
