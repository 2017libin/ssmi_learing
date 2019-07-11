/**
 * @Title: UserDaoImpl.java
 * @Package cn.osxm.ssmi.chp14.transaction
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:11:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp14.transaction;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

//@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

  // @Autowired
  private JdbcTemplate jdbcTemplate;

  public UserDaoImpl(JdbcTemplate jdbcTemplate) {
      this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public void add(User user) {
      String sql = "insert into user(name) values(?)";
      jdbcTemplate.update(sql, user.getName());
  }
  
  @Override
  public void addNoCommit(User user) {
      String sql = "insert into user(name) values(?)";
      try {
          Connection connection = jdbcTemplate.getDataSource().getConnection();
          connection.setAutoCommit(false);
          PreparedStatement pstmt =  connection.prepareStatement(sql);
          pstmt.setString(1, user.getName());
          pstmt.execute();
          pstmt.close();
          connection.close();
      } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }        
      //jdbcTemplate.update(sql, user.getName());
  }

}