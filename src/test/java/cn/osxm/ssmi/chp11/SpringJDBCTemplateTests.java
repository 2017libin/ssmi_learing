/**
 * @Title: SpringJDBCTemplateTests.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月19日 下午11:14:51
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
  * @ClassName: SpringJDBCTemplateTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp11/spring-dao.xml")
public class SpringJDBCTemplateTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserDAO userDAO;

    // @Test
    public void methodJdbcTemplate() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        List<User> list = jdbcTemplate.query("select * from user", new UserRowMapper());
        System.out.println(list.get(0).getName());
    }

    // @Test
    public void configJdbcTemplate() {
        List<User> list = jdbcTemplate.query("select * from user", new UserRowMapper());
        System.out.println(list.get(0).getName());
    }

    @Test
    public void configDAO() {
        User user = userDAO.get(1);
        System.out.println(user.getName());
    }

    class UserRowMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            return user;
        }

    }
}
