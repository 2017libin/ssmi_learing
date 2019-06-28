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
	private static ThreadLocal<Integer> countNum = new ThreadLocal<Integer>() { 
		  public Integer initialValue() {  
	            return 0;  
	        }  
	};	
	 // ②获取下一个序列值  
    public int add() {  
    	countNum.set(countNum.get() + 1);  
        return countNum.get();  
    }  
    
    
    private static class TestThread extends Thread {  
        private ThreadLocalDemo ;  
  
        public TestThread(ThreadLocalDemo sn) {  
            this.sn = sn;  
        }  
  
        public void run() {  
            for (int i = 0; i < 3; i++) {  
                //每个线程加1
            	
                System.out.println("thread[" + Thread.currentThread().getName() + "] --> sn["  
                         + sn.getNextNum() + "]");  
            }  
        }  
    }  
  
    public static void main(String[] args) {  
    	ThreadLocalDemo sn = new ThreadLocalDemo();  
        // ③ 3个线程共享sn，各自产生序列号  
        TestClient t1 = new TestClient(sn);  
        TestClient t2 = new TestClient(sn);  
        TestClient t3 = new TestClient(sn);  
        t1.start();  
        t2.start();  
        t3.start();  
    }  
}
