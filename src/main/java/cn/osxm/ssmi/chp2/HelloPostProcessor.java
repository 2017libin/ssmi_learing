/**
 * @Title: MyPostProcessor.java
 * @Package cn.osxm.ssmi.chp2
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月1日 下午3:46:49
 * @version V1.0
 */

package cn.osxm.ssmi.chp2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName: MyPostProcessor
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class HelloPostProcessor implements BeanPostProcessor {
	@Override
	//实例化、依赖注入完毕，在调用显示的初始化之前完成一些定制的初始化任务
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("后置处理器开始, beanName="+beanName);
		return bean;
	}

	@Override
	//实例化、依赖注入、初始化完毕时执行  
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("后置处理器结束, beanName="+beanName);
		return bean;
	}
}
