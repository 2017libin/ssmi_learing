/**
 * @Title: Baz.java
 * @Package cn.osxm.ssmi.com.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月21日 下午9:50:55
 * @version V1.0
 */

package cn.osxm.ssmi.com.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

/**
  * @ClassName: Baz
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Repository
public class Baz {

	private Foo foo;

	@Required
	@Autowired
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	
}
