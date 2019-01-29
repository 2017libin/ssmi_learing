/**
 * @Title: ResoureAnno.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月20日 上午8:28:25
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;

import cn.osxm.ssmi.com.Bar;

/**
 * @ClassName: ResoureAnno
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ResoureAnno {

	@Resource(name = "foo")
	private cn.osxm.ssmi.com.Foo foo;

	@Resource
	private ApplicationContext context;

	private Bar bar;

	@Resource
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public cn.osxm.ssmi.com.Foo getFoo() {

		return foo;
	}

	public ApplicationContext getContext() {

		return context;
	}

	public Bar getBar() {

		return bar;
	}
}
