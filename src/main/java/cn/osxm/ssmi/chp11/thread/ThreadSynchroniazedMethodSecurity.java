/**
 * @Title: ThreadSynchroniazedMethodSecurity.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��28�� ����10:21:30
 * @version V1.0
 */

package cn.osxm.ssmi.chp11.thread;

/**
  * @ClassName: ThreadSynchroniazedMethodSecurity
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ThreadSynchroniazedMethodSecurity {
    static int iTotal = 0;

    static int iAddTimes = 10;

    class Calculator implements Runnable {

        @Override
        public void run() {
            while (iAddTimes > 0) {
                synAddMethod();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (iAddTimes <= 0) {
                    System.out.println(Thread.currentThread().getName() + "--->���������������=" + iTotal + ".");
                }
            }

        }

        synchronized void synAddMethod() {
            synchronized (this) {
                if (iAddTimes <= 0) {
                    return;
                }
                System.out.println(Thread.currentThread().getName() + "--->��  " + iAddTimes + " �μ�1.");
                iTotal += 1;
                iAddTimes--;
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
