/**
 * @Title: ClassA.java
 * @Package cn.osxm.ssmi.chp4.methodinj
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 上午6:23:22
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.methodinj;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName: ClassA
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ClassA implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	private ClassB beanB;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ClassB getBeanB() {
		return (ClassB)applicationContext.getBean("beanB");
		//return beanB;
	}

	public void setBeanB(ClassB beanB) {
		this.beanB = beanB;
	}

	public void useBMoreTimes() {
		for (int i = 0; i < 3; i++) {
			System.out.println(beanB.toString());
		}
	}

	public void useCMoreTimes() {
		for (int i = 0; i < 3; i++) {
			System.out.println(applicationContext.getBean("beanB").toString());
		}
	}

}
