/**
 * @Title: HelloBeanFactoryPostProcessor.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月5日 上午8:39:57
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.TypedStringValue;

/**
  * @ClassName: HelloBeanFactoryPostProcessor
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class HelloBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	/**
	  * Title: postProcessBeanFactory
	  * Description:
	  * @param beanFactory
	  * @throws BeansException
	  * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
	  */

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanDefinition=beanFactory.getBeanDefinition("helloService");
		MutablePropertyValues pv =  beanDefinition.getPropertyValues();  
        //替换设置值注入的值
		pv.addPropertyValue("name", "李四");  
	}

}
