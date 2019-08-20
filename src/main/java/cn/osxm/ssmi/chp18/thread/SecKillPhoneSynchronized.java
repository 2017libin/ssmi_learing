/**
 * @Title: SecKillPhoneSynchronized.java
 * @Package cn.osxm.ssmi.chp18.thread
 * @Description: TODO
 * @author oscarchen
 * @date 2019��8��20��
 * @version V1.0
 */
package cn.osxm.ssmi.chp18.thread;

/**
 * @ClassName: SecKillPhoneSynchronized
 * @Description: TODO
 * @author oscarchen
 */
public class SecKillPhoneSynchronized {
	int iTotal = 10;

	public void secKill() {
		Runnable task = new Runnable() {
			public void run() {
				while (iTotal > 0) {
					synchronized (this) {
						//if (iTotal < 1) {
						//	System.out.println("�ֻ�������.");
						//	break;
						//}
						iTotal--;
						System.out.println(Thread.currentThread().getName() + ",����1���ֻ�,��ʣ" + iTotal + "��.");
						// try {
						// Thread.sleep(3000);
						// } catch (InterruptedException e) {
						// }
					}
				}
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
		SecKillPhoneSynchronized secKillPhone = new SecKillPhoneSynchronized();
		secKillPhone.secKill();
	}
}
