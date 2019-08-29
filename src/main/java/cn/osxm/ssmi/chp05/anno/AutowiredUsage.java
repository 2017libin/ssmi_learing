/**
 * @Title: AutowiredUsage.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月13日 上午8:49:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.anno;

import java.util.Map;
import java.util.Set;

//import javax.annotation.Nullable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import cn.osxm.ssmi.com.Bar;
import cn.osxm.ssmi.com.Baz;
import cn.osxm.ssmi.com.Foo;

/**
 * @ClassName: AutowiredUsage
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Component
public class AutowiredUsage {

	private Foo foo;

	private Bar bar;

	//@Autowired
	private Baz baz;

	//@Autowired
	private Baz[] bazs;

	//@Autowired
	private Set<Baz> bazSet;

	//@Autowired
	private Map<String,Baz> bazMap;

	// 多个构造器需要加@Autowired，单个不需要加。参数名可以不一样，通过类型查找
	@Autowired
	public AutowiredUsage(@Nullable  Foo foo2) {
		this.foo = foo2;
	}

	public AutowiredUsage() {

	}

	// @Autowired
	public void setBar(Bar bar) {
		this.bar = bar;
	}
    //注解在一般方法
	//@Autowired
	public void myInitBar(Bar bar2) {
		this.bar = bar2;
	}

	// get方法用于测试， 不必要
	public Foo getFoo() {
		return foo;
	}

	// get方法用于测试， 不必要
	public Bar getBar() {
		return bar;
	}

	// get方法用于测试， 不必要
	public Baz getBaz() {
		return baz;
	}

	// get方法用于测试， 不必要
	public Baz[] getBazs() {

		return bazs;
	}

	@SuppressWarnings("rawtypes")
	public Set getBazSet() {

		return bazSet;
	}

	@SuppressWarnings("rawtypes")
	public Map getBazMap() {

		return bazMap;
	}
}
