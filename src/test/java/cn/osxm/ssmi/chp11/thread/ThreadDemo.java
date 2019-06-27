/**
 * @Title: ThreadDemo.java
 * @Package cn.osxm.ssmi.chp11.thread
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月28日 上午6:33:07
 * @version V1.0
 */

package cn.osxm.ssmi.chp11.thread;
/**
  * @ClassName: ThreadDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ThreadDemo {
	/**
     * @Title: main
     * @Description: TODO
     * @param args
     */

   public static void main(String[] args) {
       // TODO Auto-generated method stub

   }

   
  /* public void doAdd(CountDownLatch countDownLatch) {
       for (int i = 0; i < 4; i++) {
           new Thread(new Runnable() {
               public void run() {
                   for (int j = 0; j < 25; j++) {
                       count++;
                   }
                   countDownLatch.countDown();
               }
           }).start();
       }
   }*/
}
