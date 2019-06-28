/**
 * @Title: ThreadSynchronizedSecurity.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��28�� ����10:23:11
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
					System.out.println(Thread.currentThread().getName() + "--->��  " + iAddTimes + " �μ�1.");
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
				System.out.println(Thread.currentThread().getName() + "--->���������������=" + iTotal + ".");
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
