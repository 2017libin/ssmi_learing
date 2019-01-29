/**
 * @Title: MyPostProcessor.java
 * @Package cn.osxm.ssmi.chp2
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月1日 下午3:46:49
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import cn.osxm.ssmi.chp02.HelloService;

/**
 * @ClassName: MyPostProcessor
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class HelloBeanPostProcessor implements BeanPostProcessor {
	@Override
	//实例化、依赖注入完毕，在初始化(inti-method)之前调用
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof HelloService)
		{			
			((HelloService) bean).setName("王五");
		}
		return bean;
	}

	@Override
	//实例化、依赖注入、初始化完毕时执行  
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
