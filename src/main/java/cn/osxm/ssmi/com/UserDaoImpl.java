/**
 * @Title: UserDaoImpl.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月23日 下午9:51:21
 * @version V1.0
 */

package cn.osxm.ssmi.com;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UserDaoImpl implements UserDao {

	public JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User getUserById(String id) {
		String sql = "select * from user where id=?";
		return jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
	}

	@Override
	public String getUserNameById(String id) {
		return getUserById(id).getName();
	}

	class UserRowMapper implements RowMapper<User> {
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User("");
			user.setName(rs.getString("name"));
			return user;
		}

	}

}
