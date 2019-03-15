/**
 * @Title: InjectNamedAnno.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月20日 下午7:43:34
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.anno;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import cn.osxm.ssmi.com.Bar;
import cn.osxm.ssmi.com.Baz;
import cn.osxm.ssmi.com.Foo;
import cn.osxm.ssmi.com.User;

/**
 * @ClassName: InjectNamedAnno
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class InjectNamedAnno {

	private Foo foo;

	private Baz baz;

	// 1.构造函数注入
	@Inject
	public InjectNamedAnno(@Named("foo") Foo foo) {
		this.foo = foo;
	}

	// 2. 属性注入
	@Inject
	@Named("bar")
	private Bar bar;

	// 3. 属性Setter方法注入
	@Inject
	public void setBaz(@Named("baz2") Baz baz) {
		this.baz = baz;
	}

	private Provider<User> user;

	@Inject
	public void setUser(Provider<User> user) {
		this.user = user;
	}
	
	public void getUserName() {
		this.user.get().getName();
	}

	///////// for test
	public Foo getFoo() {

		return foo;
	}

	public Bar getBar() {

		return bar;
	}

	public Baz getBaz() {

		return baz;
	}
}
