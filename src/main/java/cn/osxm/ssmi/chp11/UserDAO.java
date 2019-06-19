/**
 * @Title: UserDAO.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月19日 下午11:17:44
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
/**
  * @ClassName: UserDAO
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserDAO extends JdbcDaoSupport implements IUserDAO {

    @Override
    public User get(int id) {
        String sql = "select * from user where id = ?";
        User user = this.getJdbcTemplate().queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                return user;
            }
        }, id);
        return user;
    }

    @Override
    public void add(User user) {
        // TODO Auto-generated method stub

    }

}
