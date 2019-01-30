/**
 * @Title: AllCallbackService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��6�� ����7:45:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
  * @ClassName: AllCallbackService
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class AllCallbackService implements InitializingBean,DisposableBean{
	@Override
	public void afterPropertiesSet() throws Exception {
          System.out.println("[ʵ��InitializingBean�ӿڵ�afterPropertiesSet����]��ʼ�������ص�������");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("[ʵ��DisposableBean�ӿڵ�destroy����]���ٷ����ص���������");
	}
	
	
	public void cfgInit() {
		System.out.println("[����bean��init-method����]��ʼ�������ص�������");
	}

	public void cfgDestroy() {
		System.out.println("[����bean��destroy-method����]���ٷ����ص���������");
	}
	
	
	@PostConstruct
	public void annoInit() {
		System.out.println("[ע��@PostConstruct]��ʼ�������ص�������");
	}

	@PreDestroy
	public void annoDestroy() {
		System.out.println("[ע��@PreDestroy]���ٷ����ص���������");
	}
}