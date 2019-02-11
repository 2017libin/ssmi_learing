/**
 * @Title: BeanDClass.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 上午5:34:15
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;
/**
  * @ClassName: BeanDClass
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class BeanDClass {
	private BeanCClass beanC;
	

//	public BeanDClass(BeanCClass beanC) {
//		this.beanC = beanC;
//	}

	public BeanCClass getBeanC() {
	
		return beanC;
	}

	public void setBeanC(BeanCClass beanC) {
		this.beanC = beanC;
	}

	public void method() {		
		System.out.println("Call Bean C method");
		//beanC.method();
	}
}
