/**
 * @Title: MyPostProcessor.java
 * @Package cn.osxm.ssmi.chp2
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��1�� ����3:46:49
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
	//ʵ����������ע����ϣ��ڵ�����ʾ�ĳ�ʼ��֮ǰ���һЩ���Ƶĳ�ʼ������
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("���ô�������ʼ, beanName="+beanName);
		return bean;
	}

	@Override
	//ʵ����������ע�롢��ʼ�����ʱִ��  
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("���ô���������, beanName="+beanName);
		return bean;
	}
}
