/**
 * @Title: Foo.java
 * @Package cn.osxm.ssmi.com.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��21�� ����9:45:16
 * @version V1.0
 */

package cn.osxm.ssmi.com.anno;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  * @ClassName: Foo
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Component
public class Foo {
	@Bean(name="barBean",value="barBean")
	@Scope("prototype")
	public Bar myInifBar() {
		return new Bar();
	}	
}
