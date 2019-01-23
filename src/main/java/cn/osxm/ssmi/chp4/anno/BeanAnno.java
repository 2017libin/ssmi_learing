/**
 * @Title: BeanAnno.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月21日 下午10:23:24
 * @version V1.0
 */

package cn.osxm.ssmi.chp4.anno;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: BeanAnno
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Component
public class BeanAnno {

	@Bean
	@Qualifier("user")
	public User userInstance() {
		return new User("Oscar");
	}
}
