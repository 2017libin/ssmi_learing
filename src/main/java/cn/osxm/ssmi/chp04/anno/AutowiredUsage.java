/**
 * @Title: AutowiredUsage.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��13�� ����8:49:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import cn.osxm.ssmi.com.Bar;
import cn.osxm.ssmi.com.Baz;
import cn.osxm.ssmi.com.Foo;

/**
 * @ClassName: AutowiredUsage
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class AutowiredUsage {

	private Foo foo;

	private Bar bar;

	@Autowired
	private Baz baz;

	@Autowired
	private Baz[] bazs;

	@Autowired
	private Set<Baz> bazSet;

	@Autowired
	private Map<String,Baz> bazMap;

	// �����������Ҫ��@Autowired����������Ҫ��
	@Autowired
	public AutowiredUsage(Foo foo) {
		this.foo = foo;
	}

	public AutowiredUsage() {

	}

	// @Autowired
	public void setBar(Bar bar) {
		this.bar = bar;
	}
    //ע����һ�㷽��
	@Autowired
	public void myInitBar(Bar bar) {
		this.bar = bar;
	}

	// get�������ڲ��ԣ� ����Ҫ
	public Foo getFoo() {
		return foo;
	}

	// get�������ڲ��ԣ� ����Ҫ
	public Bar getBar() {
		return bar;
	}

	// get�������ڲ��ԣ� ����Ҫ
	public Baz getBaz() {
		return baz;
	}

	// get�������ڲ��ԣ� ����Ҫ
	public Baz[] getBazs() {

		return bazs;
	}

	public Set getBazSet() {

		return bazSet;
	}

	public Map getBazMap() {

		return bazMap;
	}
}
