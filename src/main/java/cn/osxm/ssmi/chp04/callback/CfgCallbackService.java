/**
 * @Title: CfgCallbackService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月24日 上午5:28:12
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
		System.out.println(this.getClass().getSimpleName()+":[配置bean的init-method属性]初始化方法回调．．．");
	}

	public void destroy() {
		System.out.println(this.getClass().getSimpleName()+":[配置bean的destroy-method属性]销毁方法回调．．．．");
	}
}
