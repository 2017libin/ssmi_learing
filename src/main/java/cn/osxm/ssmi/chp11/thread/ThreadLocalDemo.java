/**
 * @Title: ThreadLocalDemo.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月28日 下午10:49:08
 * @version V1.0
 */

package cn.osxm.ssmi.chp11.thread;
/**
  * @ClassName: ThreadLocalDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ThreadLocalDemo {
	private static ThreadLocal<Integer> iTotalPhoneThreadLocal = new ThreadLocal<Integer>() {
        public Integer initialValue() {
            return 10;
        }
    };
    
    public static class MyRunnable implements Runnable { 
        @Override       
        public void run() {        
            while(iTotalPhoneThreadLocal.get()>0){
                int iTotalPhone = iTotalPhoneThreadLocal.get();
                iTotalPhone--;               
                System.out.println(Thread.currentThread().getName()+",抢了1个手机,还剩"+iTotalPhone+"个.");
                iTotalPhoneThreadLocal.set(iTotalPhone);
            }      
            if(iTotalPhoneThreadLocal.get()<1) {
                System.out.println(Thread.currentThread().getName()+",手机抢完了.");
            }
              try {      
                 Thread.sleep(2000);        
              } catch (InterruptedException e) {  
              }     
        }
    }
    
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable, "线程1");
        Thread thread2 = new Thread(myRunnable, "线程1");
        Thread thread3 = new Thread(myRunnable, "线程1");
        thread1.start();
        thread2.start();
        thread3.start();
    }
    
   /* private static ThreadLocal<Integer> iTotal = new ThreadLocal<Integer>() {
        public Integer initialValue() {
            return 0;
        }
    };

    public static ThreadLocal<Integer> getiTotal() {
        return iTotal;
    }

    public int addOne() {
        iTotal.set(iTotal.get() + 1);
        return iTotal.get();
    }

    private class MyCalculatorThread extends Thread {
        private ThreadLocalDemo demo;

        public MyCalculatorThread(ThreadLocalDemo demo) {
            this.demo = demo;
        }

        public void run() {
            for (int i = 0; i < 4; i++) {
                demo.addOne();
                System.out.println("thread[" + Thread.currentThread().getName() + "], 第" + i + "次加1，总数=" + demo.getiTotal().get());
            }
        }
    }

    public static void main(String[] args) {
        ThreadLocalDemo demo = new ThreadLocalDemo();
        MyCalculatorThread calculator = new ThreadLocalDemo().new MyCalculatorThread(demo);
        Thread thread1 = new Thread(calculator, "1号计算器");
        Thread thread2 = new Thread(calculator, "2号计算器");
        Thread thread3 = new Thread(calculator, "3号计算器");
        Thread thread4 = new Thread(calculator, "4号计算器");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }*/

    /*
     * private static ThreadLocal<Integer> countNum = new ThreadLocal<Integer>() {
     * public Integer initialValue() { return 0; } };
     * 
     * public int add() { countNum.set(countNum.get() + 1); return countNum.get(); }
     * 
     * 
     * private static class TestThread extends Thread { private ThreadLocalDemo ;
     * 
     * public TestThread(ThreadLocalDemo sn) { this.sn = sn; }
     * 
     * public void run() { for (int i = 0; i < 3; i++) { //每个线程加1
     * 
     * System.out.println("thread[" + Thread.currentThread().getName() + "] --> sn["
     * + sn.getNextNum() + "]"); } } }
     * 
     * public static void main(String[] args) { ThreadLocalDemo sn = new
     * ThreadLocalDemo(); // ③ 3个线程共享sn，各自产生序列号 TestClient t1 = new TestClient(sn);
     * TestClient t2 = new TestClient(sn); TestClient t3 = new TestClient(sn);
     * t1.start(); t2.start(); t3.start(); }
     */
}
