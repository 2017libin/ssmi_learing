/**
 * @Title: Baz.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月13日 上午8:57:31
 * @version V1.0
 */

package cn.osxm.ssmi.com;

/**
 * @ClassName: Baz
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class Baz {

	private Foo foo;
	@SuppressWarnings("unused")
	private Bar bar;

	public Baz() {
		
	}
	public Baz(Foo foo,Bar bar) {
		this.foo = foo;
		this.bar = bar;
	}
	
	public Foo getFoo() {

		return foo;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}

//	public Bar getBar() {
//
//		return bar;
//	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}
}
