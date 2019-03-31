/**
 * @Title: UserDaoImpl.java
 * @Package cn.osxm.ssmi.com.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月23日 下午9:49:42
 * @version V1.0
 */

package cn.osxm.ssmi.com.anno;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cn.osxm.ssmi.com.User;
import cn.osxm.ssmi.com.UserDao;

/**
  * @ClassName: UserDaoImpl
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Repository
public class UserDaoImpl implements UserDao {

	   @Autowired
	    private JdbcTemplate jdbcTemplate;

	    @Override
	    public User getUserById(String id) {
	        String sql = "select * from user where id=?";
	        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
	    }

	    @Override
	    public String getUserNameById(String id) {
	        return getUserById(id).getName();
	    }

	    @Override
	    public void add(User user) {
	        String sql = "insert into user(name) values('"+user.getName()+"')";
	        jdbcTemplate.execute(sql);
	       
	    }
	    
	    @Override
	    public User getUserByName(String name) {
	        String sql = "select * from user where name=?";
	        List list = jdbcTemplate.queryForList(sql,name);
	        Map map = (Map) list.get(0);
	        User user = new User("");
	        user.setName(map.get("name")!=null?(String)map.get("name"):null);
	        return user;
	    }

	    class UserRowMapper implements RowMapper<User> {
	        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	            User user = new User("");
	            user.setName(rs.getString("name"));
	            return user;
	        }

	    }


}
