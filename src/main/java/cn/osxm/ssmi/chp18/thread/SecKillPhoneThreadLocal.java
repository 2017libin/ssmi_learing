/**
 * @Title: SecKillPhoneThreadLocal.java
 * @Package cn.osxm.ssmi.chp18.thread
 * @Description: TODO
 * @author oscarchen
 * @date 2019年8月20日
 * @version V1.0
 */
package cn.osxm.ssmi.chp18.thread;

/**
 * @ClassName: SecKillPhoneThreadLocal
 * @Description: TODO
 * @author oscarchen
 */
public class SecKillPhoneThreadLocal {
	private ThreadLocal<Integer> iTotalThreadLocal = new ThreadLocal<Integer>() {
		@Override
		public Integer initialValue() {
			return 10;
		}
	};

	public void secKill() {
		Runnable task = new Runnable() {
			public void run() {
				while (iTotalThreadLocal.get() > 0) {
					int iTotal = iTotalThreadLocal.get();
					iTotal--;
					System.out.println(Thread.currentThread().getName() + ",抢了1个手机,还剩" + iTotal + "个.");
					iTotalThreadLocal.set(iTotal);
				}
				// if(iTotalThreadLocal.get()<1) {
				// System.out.println(Thread.currentThread().getName()+",手机抢完了.");
				// break;
				// }
				// try {
				// Thread.sleep(2000);
				// } catch (InterruptedException e) {
				// }
			}
		};
		Thread thread1 = new Thread(task, "秒杀线程1");
		Thread thread2 = new Thread(task, "秒杀线程2");
		Thread thread3 = new Thread(task, "秒杀线程3");
		thread1.start();
		thread2.start();
		thread3.start();
	}

	public static void main(String[] args) {
		SecKillPhoneThreadLocal secKillPhone = new SecKillPhoneThreadLocal();
		secKillPhone.secKill();
	}
}
