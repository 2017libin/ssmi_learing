/**
 * @Title: UserDaoImpl.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月6日 下午1:24:07
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

	// @Autowired
	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User get(int id) {
		User user = null;
		List<User> list = jdbcTemplate.query("select * from user", new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User("");
				user.setName(rs.getString("name"));
				return user;
			}
		});
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}
		return user;
	}

}