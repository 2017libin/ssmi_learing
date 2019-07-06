/**
 * @Title: UserDaoSupportImpl.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月6日 下午1:25:06
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: UserDaoSupportImpl
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@Repository(value = "userDaoSupport") // Caused by: java.lang.IllegalArgumentException: 'dataSource' or 'jdbcTemplate'
										// is required
public class UserDaoSupportImpl extends JdbcDaoSupport implements UserDao {

	@Autowired
	private DataSource dataSource;

	@Override
	public User get(int id) {
		User user = null;
		List<User> list = this.getJdbcTemplate().query("select * from user", new RowMapper<User>() {
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

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}
}