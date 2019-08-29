/**
 * @Title: WithCallbackService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��24�� ����5:11:30
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.callback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @ClassName: WithCallbackService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ImplCallbackService implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("[ʵ��InitializingBean�ӿڵ�afterPropertiesSet����]��ʼ�������ص�������");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("[ʵ��DisposableBean�ӿڵ�destroy����]���ٷ����ص���������");
	}

}
