/**
 * @Title: ImplBeanFactoryAware.java
 * @Package cn.osxm.ssmi.chp04.aware
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月6日 下午5:05:05
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @ClassName: ImplBeanFactoryAware
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ImplBeanFactoryAware implements BeanFactoryAware {

	private BeanFactory beanFactory;

	/**
	 * Title: setBeanFactory Description:
	 * 
	 * @param beanFactory
	 * @throws BeansException
	 * @see org.springframework.beans.factory.BeanFactoryAware#setBeanFactory(org.springframework.beans.factory.BeanFactory)
	 */

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	public User getUser() {
		return (User)beanFactory.getBean("user2");
	}

}
