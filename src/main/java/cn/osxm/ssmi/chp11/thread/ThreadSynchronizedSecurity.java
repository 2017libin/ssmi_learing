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

	static int iAddTimes = 1;

    public void addOne() {
        iAddTimes++;
        iTotal++;
        System.out.println(Thread.currentThread().getName() + "--->��  " + iAddTimes + " �μ�1.");
    }
    
	class Calculator implements Runnable {

		@Override
		public void run() {

			while (iAddTimes <=10) {
				synchronized (this) {
					if (iAddTimes >10) {
						return;
					}
				
					addOne();
				}
			}
			if (iAddTimes >10) {
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
