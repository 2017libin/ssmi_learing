/**
 * @Title: HookDemo.java
 * @Package cn.osxm.ssmi.chp02
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��5�� ����2:46:16
 * @version V1.0
 */

package cn.osxm.ssmi.chp02;

/**
 * @ClassName: HookDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class HookDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		//1.����ʼִ��
		System.out.println("����ʼ.....");		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("ִ�йرչ���.....");
			}
		}));		
		System.out.println("�������.....");
	}

}
