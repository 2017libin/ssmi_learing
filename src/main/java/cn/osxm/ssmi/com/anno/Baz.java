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
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
  * @ClassName: Baz
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Component
public class Baz {

	@SuppressWarnings("unused")
	private Foo foo;

	//@Required
	//@Autowired(required=false)
	@Autowired
	//public void setFoo(<Optional>Foo foo) {
	public void setFoo(@Nullable Foo foo) {
		this.foo = foo;
	}
	
	
}
