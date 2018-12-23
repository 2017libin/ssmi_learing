/**
 * @Title: WithCallbackService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月24日 上午5:11:30
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
  * @ClassName: WithCallbackService
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ImplCallbackService implements InitializingBean,DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
          System.out.println("初始化方法回调．．．");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("销毁方法回调．．．．");
	}

}
