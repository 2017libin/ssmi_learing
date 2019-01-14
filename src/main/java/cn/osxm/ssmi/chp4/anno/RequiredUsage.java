/**
 * @Title: AnnoUseClass.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月12日 下午8:00:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.anno;

import org.springframework.beans.factory.annotation.Required;

import cn.osxm.ssmi.com.Foo;

/**
 * @ClassName: AnnoUseClass
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class RequiredUsage {

	public Foo foo;

	@Required
	public void setFoo(Foo foo) {
		this.foo = foo;
	}

}
