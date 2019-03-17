/**
 * @Title: ComponentAnno.java
 * @Package cn.osxm.ssmi.chp4.javacfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月27日 下午6:34:18
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.javacfg;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import cn.osxm.ssmi.com.Bar;
import cn.osxm.ssmi.com.Foo;

/**
  * @ClassName: ComponentAnno
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Component
public class ComponentAnno {

//	@Bean
//	public Bar bar() {
//		//System.out.println(foo);
//		return new Bar(foo());
//	}
	
	@Bean
	public Bar bar(Foo foo) {
		return new Bar(foo);
	}
	@Bean
	public Foo foo() {
		return new Foo();
	}
}
