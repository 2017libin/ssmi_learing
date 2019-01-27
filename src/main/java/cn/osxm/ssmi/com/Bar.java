/**
 * @Title: Bar.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月13日 上午8:53:21
 * @version V1.0
 */

package cn.osxm.ssmi.com;

/**
 * @ClassName: Bar
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class Bar {

	private Foo foo;

	public Bar(Foo foo) {
		this.foo = foo;
	}

	public Foo getFoo() {
		return foo;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}
}
