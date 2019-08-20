/**
 * @Title: SecKillPhoneThreadLocal.java
 * @Package cn.osxm.ssmi.chp18.thread
 * @Description: TODO
 * @author oscarchen
 * @date 2019��8��20��
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
					System.out.println(Thread.currentThread().getName() + ",����1���ֻ�,��ʣ" + iTotal + "��.");
					iTotalThreadLocal.set(iTotal);
				}
				// if(iTotalThreadLocal.get()<1) {
				// System.out.println(Thread.currentThread().getName()+",�ֻ�������.");
				// break;
				// }
				// try {
				// Thread.sleep(2000);
				// } catch (InterruptedException e) {
				// }
			}
		};
		Thread thread1 = new Thread(task, "��ɱ�߳�1");
		Thread thread2 = new Thread(task, "��ɱ�߳�2");
		Thread thread3 = new Thread(task, "��ɱ�߳�3");
		thread1.start();
		thread2.start();
		thread3.start();
	}

	public static void main(String[] args) {
		SecKillPhoneThreadLocal secKillPhone = new SecKillPhoneThreadLocal();
		secKillPhone.secKill();
	}
}
