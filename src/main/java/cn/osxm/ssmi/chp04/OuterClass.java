/**
 * @Title: OuterClass.java
 * @Package cn.osxm.ssmi.chp04
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��19�� ����9:52:28
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

/**
 * @ClassName: OuterClass
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class OuterClass {
	//��̬�ڲ���
	static class InnerClass {
		public void innerMethod() {
			System.out.println("This is InnerClass's Innermethod");
		}
	}
}
