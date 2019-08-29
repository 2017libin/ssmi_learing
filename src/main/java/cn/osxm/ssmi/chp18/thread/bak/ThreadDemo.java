/**
 * @Title: ThreadDemo.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��28�� ����6:33:07
 * @version V1.0
 */

package cn.osxm.ssmi.chp18.thread.bak;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
  * @ClassName: ThreadDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ThreadDemo {
	  
    int iTotalPhone = 10;

    class MyThread extends Thread {
        public void run() {
            while (iTotalPhone > 0) {
                iTotalPhone--;
                System.out.println(Thread.currentThread().getName() + ",����1���ֻ�,��ʣ" + iTotalPhone + "��.");
            }
            if (iTotalPhone < 1) {
                System.out.println(Thread.currentThread().getName() + ",�ֻ�������.");
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
    
    class MyRunnable implements Runnable  {
        @Override
        public void run() {
            while (iTotalPhone > 0) {
                iTotalPhone--;
                System.out.println(Thread.currentThread().getName() + ",����1���ֻ�,��ʣ" + iTotalPhone + "��.");
                if (iTotalPhone < 1) {
                    System.out.println(Thread.currentThread().getName() + ",�ֻ�������.");
                    break;
                }
                
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                }
            }       
        }
    }
    
    class MySynchronizedRunnable implements Runnable  {
        @Override
        public void run() {
            while (iTotalPhone > 0) {
                synchronized (this) {
                    iTotalPhone--;
                    System.out.println(Thread.currentThread().getName() + ",����1���ֻ�,��ʣ" + iTotalPhone + "��.");               
                    if (iTotalPhone < 1) {
                        System.out.println(Thread.currentThread().getName() + ",�ֻ�������.");
                        break;
                    }
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
            }

        }
    }
    class MyLockRunnable implements Runnable  {
        Lock lock = new ReentrantLock();
        @Override
        public void run() {
            while (iTotalPhone > 0) {
                lock.lock();
                iTotalPhone--;
                System.out.println(Thread.currentThread().getName() + ",����1���ֻ�,��ʣ" + iTotalPhone + "��.");               
                if (iTotalPhone < 1) {
                    System.out.println(Thread.currentThread().getName() + ",�ֻ�������.");
                    break;
                }    
                lock.unlock();    
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }

        }
    }

    public static void main(String[] args) {
       /*MyThread thread1 = new ThreadDemo().new MyThread();
        thread1.setName("�߳�1");
        MyThread thread2 = new ThreadDemo().new MyThread();
        thread2.setName("�߳�2");
        MyThread thread3 = new ThreadDemo().new MyThread();
        thread3.setName("�߳�3");

        thread1.start();
        thread2.start();
        thread3.start();*/
        MyRunnable myTask= new ThreadDemo().new MyRunnable();
        Thread thread1 = new Thread(myTask,"�߳�1");
        Thread thread2 = new Thread(myTask,"�߳�2");
        Thread thread3 = new Thread(myTask,"�߳�3");
   
        thread1.start();
        thread2.start();
        thread3.start();
        /*MySynchronizedRunnable myTask= new ThreadDemo().new MySynchronizedRunnable();
        Thread thread1 = new Thread(myTask,"�߳�1");
        Thread thread2 = new Thread(myTask,"�߳�2");
        Thread thread3 = new Thread(myTask,"�߳�3");
   
        thread1.start();
        thread2.start();
        thread3.start();*/
        
        /*MyLockRunnable myTask= new ThreadDemo().new MyLockRunnable();
        Thread thread1 = new Thread(myTask,"�߳�1");
        Thread thread2 = new Thread(myTask,"�߳�2");
        Thread thread3 = new Thread(myTask,"�߳�3");
   
        thread1.start();
        thread2.start();
        thread3.start();*/

    }

    /*
     * public void doAdd(CountDownLatch countDownLatch) { for (int i = 0; i < 4;
     * i++) { new Thread(new Runnable() { public void run() { for (int j = 0; j <
     * 25; j++) { count++; } countDownLatch.countDown(); } }).start(); } }
     */
}
