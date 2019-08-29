/**
 * @Title: NoThreadLocalDemo.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月29日 下午4:29:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp18.thread.bak;

/**
  * @ClassName: NoThreadLocalDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class NoThreadLocalDemo {
	 private int iTotal = 0;
	    
	    public int getiTotal() {
	        return iTotal;
	    }
	    
	    public int addOne() {
	        iTotal += 1;
	        return iTotal;
	    }

	    private class MyCalculatorThread extends Thread {  
	        private NoThreadLocalDemo demo;  
	  
	        public MyCalculatorThread(NoThreadLocalDemo demo) {  
	            this.demo = demo;  
	        }        
	        public void run() {  
	            for (int i = 1; i <= 4; i++) {  
	                demo.addOne();    
	                System.out.println("thread[" + Thread.currentThread().getName() + "], 第"+i+"次加1，总数="  
	                         +demo.getiTotal());  
	            }  
	        }  
	    }
	    
	    public static void main(String[] args) {  
	        NoThreadLocalDemo demo = new NoThreadLocalDemo();
	        MyCalculatorThread calculator = new NoThreadLocalDemo().new MyCalculatorThread(demo);
	        Thread thread1 = new Thread(calculator, "1号计算器");
	        Thread thread2 = new Thread(calculator, "2号计算器");
	        Thread thread3 = new Thread(calculator, "3号计算器");
	        Thread thread4 = new Thread(calculator, "4号计算器");
	        thread1.start();
	        thread2.start();
	        thread3.start();
	        thread4.start();
	    }
}
