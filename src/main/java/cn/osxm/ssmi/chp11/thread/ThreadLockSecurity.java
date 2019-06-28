/**
 * @Title: ThreadLockSecurity.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��28�� ����10:20:29
 * @version V1.0
 */

package cn.osxm.ssmi.chp11.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: ThreadLockSecurity
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ThreadLockSecurity {
	static int iTotal = 0;

	static int iAddTimes = 10;

	class Calculator implements Runnable {
		Lock lock = new ReentrantLock();

		@Override
		public void run() {
			while (iAddTimes > 0) {
				try {
					lock.lock();

					if (iAddTimes <= 0) {
						return;
					}
					System.out.println(Thread.currentThread().getName() + "--->��  " + iAddTimes + " �μ�1.");
					iTotal += 1;
					iAddTimes--;

				} catch (Exception e1) {
					e1.printStackTrace();
				} finally {
					lock.unlock();

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
}
