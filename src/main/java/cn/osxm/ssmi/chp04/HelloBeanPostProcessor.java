/**
 * @Title: MyPostProcessor.java
 * @Package cn.osxm.ssmi.chp2
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��1�� ����3:46:49
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
	//ʵ����������ע����ϣ��ڳ�ʼ��(inti-method)֮ǰ����
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof HelloService)
		{			
			((HelloService) bean).setName("����");
		}
		return bean;
	}

	@Override
	//ʵ����������ע�롢��ʼ�����ʱִ��  
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
