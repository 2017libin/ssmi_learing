/**
 * @Title: ThreadLockSecurity.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��28�� ����10:20:29
 * @version V1.0
 */

package cn.osxm.ssmi.chp18.thread.bak;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: ThreadLockSecurity
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ThreadLockSecurity {
	   static int iTotal = 0;

	    static int iAddTimes = 1;

	    public void addOne() {
	        System.out.println(Thread.currentThread().getName() + "--->��  " + iAddTimes + " �μ�1.");
	        iAddTimes++;
	        iTotal++;       
	    }

	    class Calculator implements Runnable {
	        Lock lock = new ReentrantLock();
	        @Override
	        public void run() {
	            while (iAddTimes <10) {
	                try {
	                    lock.lock();

	                    if (iAddTimes > 10) {
	                        return;
	                    }
	                    addOne();

	                } catch (Exception e1) {
	                    e1.printStackTrace();
	                } finally {
	                    lock.unlock();
	                }
	            }
	            if (iAddTimes > 10) {
	                System.out.println(Thread.currentThread().getName() + "--->���������������=" + iTotal + ".");
	            }
	        }
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Calculator calculator = new ThreadLockSecurity().new Calculator();
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
