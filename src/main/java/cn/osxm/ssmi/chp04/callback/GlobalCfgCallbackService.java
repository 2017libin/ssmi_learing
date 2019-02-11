/**
 * @Title: GlobalCfgCallbackService.java
 * @Package cn.osxm.ssmi.chp04.callback
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月6日 上午8:05:01
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
		System.out.println(this.getClass().getSimpleName() + ":[配置在beans中default-init-method]初始化方法回调．．．");
	}
	
	public void destroyEvery() {
		System.out.println(this.getClass().getSimpleName() + ":[配置在beans中default-destroy-method]初始化方法回调．．．");
	}

}
