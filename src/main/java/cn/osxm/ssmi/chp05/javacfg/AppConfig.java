/**
 * @Title: AppConfig.java
 * @Package cn.osxm.ssmi.chp4.javacfg
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月27日 下午3:29:49
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.javacfg;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import cn.osxm.ssmi.com.Foo;

/**
  * @ClassName: AppConfig
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Configuration
@ComponentScan(basePackages = "cn.osxm.ssmi.com.anno")
public class AppConfig {

	@Bean
	protected Foo foo() {
		return new Foo();
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource ();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); 
		ds.setUrl("jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC");
		ds.setUsername("root");
		ds.setPassword("123456");
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
