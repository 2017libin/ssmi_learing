/**
 * @Title: SpringJDBCTests.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月5日 下午6:03:38
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: SpringJDBCTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SpringJDBCTests {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// @Test
	public void jdbcTemplate() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<User> list = jdbcTemplate.query("select * from user", new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User("");
				user.setName(rs.getString("name"));
				return user;
			}

		});
		System.out.println(list.get(0).getName());
	}

	@Test
	public void jdbcTemplateBean() {
		List<User> list = jdbcTemplate.query("select * from user", new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User("");
				user.setName(rs.getString("name"));
				return user;
			}

		});
		System.out.println(list.get(0).getName());
	}
}
