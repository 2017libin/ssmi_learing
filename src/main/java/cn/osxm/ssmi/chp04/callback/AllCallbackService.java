/**
 * @Title: AllCallbackService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月6日 上午7:45:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.callback;

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
          System.out.println(this.getClass().getSimpleName()+":[实现InitializingBean接口的afterPropertiesSet方法]初始化方法回调．．．");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this.getClass().getSimpleName()+":[实现DisposableBean接口的destroy方法]销毁方法回调．．．．");
	}
	
	
	public void cfgInit() {
		System.out.println(this.getClass().getSimpleName()+":[配置bean的init-method属性]初始化方法回调．．．");
	}

	public void cfgDestroy() {
		System.out.println(this.getClass().getSimpleName()+":[配置bean的destroy-method属性]销毁方法回调．．．．");
	}
	
	
	@PostConstruct
	public void annoInit() {
		System.out.println(this.getClass().getSimpleName()+":[注解@PostConstruct]初始化方法回调．．．");
	}

	@PreDestroy
	public void annoDestroy() {
		System.out.println(this.getClass().getSimpleName()+":[注解@PreDestroy]销毁方法回调．．．．");
	}
}
