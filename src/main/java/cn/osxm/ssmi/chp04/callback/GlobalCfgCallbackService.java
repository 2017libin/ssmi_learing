/**
 * @Title: GlobalCfgCallbackService.java
 * @Package cn.osxm.ssmi.chp04.callback
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��6�� ����8:05:01
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.callback;

/**
 * @ClassName: GlobalCfgCallbackService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class GlobalCfgCallbackService {
	public void initEvery() {
		System.out.println(this.getClass().getSimpleName() + ":[������beans��default-init-method]��ʼ�������ص�������");
	}
	
	public void destroyEvery() {
		System.out.println(this.getClass().getSimpleName() + ":[������beans��default-destroy-method]��ʼ�������ص�������");
	}

}
