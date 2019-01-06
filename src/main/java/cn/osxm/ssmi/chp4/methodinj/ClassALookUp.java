/**
 * @Title: ClassLookUp.java
 * @Package cn.osxm.ssmi.chp4.methodinj
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 上午6:45:39
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.methodinj;

import org.springframework.beans.factory.annotation.Lookup;

/**
 * @ClassName: ClassLookUp
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ClassALookUp {
	
	
	@Lookup
	public ClassB getClassB() {
		return null;
	}
	
	public void useBMoreTimes() {
		for (int i = 0; i < 3; i++) {
			System.out.println("[LookUp]"+getClassB().toString());
		}
	}
}
