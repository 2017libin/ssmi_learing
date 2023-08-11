/**
 * @Title: HookDemo.java
 * @Package cn.osxm.ssmi.chp02
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月5日 下午2:46:16
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
		//1.程序开始执行
		System.out.println("程序开始.....");		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("执行关闭钩子.....");
			}
		}));		
		System.out.println("程序结束.....");
	}

}
