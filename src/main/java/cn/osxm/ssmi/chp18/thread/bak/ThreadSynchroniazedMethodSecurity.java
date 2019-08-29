/**
 * @Title: ThreadSynchroniazedMethodSecurity.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��28�� ����10:21:30
 * @version V1.0
 */

package cn.osxm.ssmi.chp18.thread.bak;

/**
  * @ClassName: ThreadSynchroniazedMethodSecurity
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ThreadSynchroniazedMethodSecurity {
	  static int iTotal = 0;

	    static int iAddTimes = 1;

	    class Calculator implements Runnable {

	        @Override
	        public void run() {
	            while (iAddTimes <= 10) {
	                synAddMethod();

	                if (iAddTimes > 10) {
	                    System.out.println(Thread.currentThread().getName() + "--->���������������=" + iTotal + ".");
	                }
	            }

	        }

	        synchronized void synAddMethod() {
	            synchronized (this) {
	                if (iAddTimes > 10) {
	                    return;
	                }
	                iAddTimes++;
	                iTotal++;
	                System.out.println(Thread.currentThread().getName() + "--->��  " + iAddTimes + " �μ�1.");
	            }
	        }

	    }

	    /**
	     * @Title: main
	     * @Description: TODO
	     * @param args
	     */

	    public static void main(String[] args) {
	        Calculator calculator = new ThreadSynchroniazedMethodSecurity().new Calculator();
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
