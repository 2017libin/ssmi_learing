/**
 * @Title: BeanCClass.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 上午5:34:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

/**
 * @ClassName: BeanCClass
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class BeanCClass {
	private BeanDClass beanD;

	/*public BeanCClass(BeanDClass beanD) {
		this.beanD = beanD;
	}*/
	
	public BeanDClass getBeanD() {
	
		return beanD;
	}

	public void setBeanD(BeanDClass beanD) {
		this.beanD = beanD;
	}

	public void method() {		
		System.out.println("Call Bean D method");
		beanD.method();
	}
}
