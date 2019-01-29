/**
 * @Title: MyAppConfig.java
 * @Package cn.osxm.ssmi.chp6.mock
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月23日 下午9:38:04
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: MyAppConfig
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@Configuration
public class MyAppConfig {
	@Bean(name = "user")
	public User userBean() {
		return new User("");
	}

	@Bean
	public PropertySourcesPlaceholderConfigurer placeHolderBean() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
