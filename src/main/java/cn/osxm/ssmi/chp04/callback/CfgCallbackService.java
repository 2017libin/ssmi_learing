/**
 * @Title: CfgCallbackService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��24�� ����5:28:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.callback;

/**
 * @ClassName: CfgCallbackService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class CfgCallbackService {


	public void init() {
		System.out.println(this.getClass().getSimpleName()+":[����bean��init-method����]��ʼ�������ص�������");
	}

	public void destroy() {
		System.out.println(this.getClass().getSimpleName()+":[����bean��destroy-method����]���ٷ����ص���������");
	}
}
