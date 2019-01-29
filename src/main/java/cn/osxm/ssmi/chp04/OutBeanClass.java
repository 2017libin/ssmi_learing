/**
 * @Title: OutBeanClass.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月6日 下午2:47:56
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

/**
 * @ClassName: OutBeanClass
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class OutBeanClass {

	private InnerBeanClass innerBean;

	
	public OutBeanClass(InnerBeanClass innerBean) {
		this.innerBean = innerBean;
	}
	public InnerBeanClass getInnerBean() {
	
		return innerBean;
	}

	public void setInnerBean(InnerBeanClass innerBean) {
		this.innerBean = innerBean;
	}
}
