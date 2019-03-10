/**
 * @Title: UserDao.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��3��10�� ����2:36:41
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: UserDao
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserDao extends SqlSessionDaoSupport {
    public User getUser(String id) {
        return (User) getSqlSession().selectOne("cn.osxm.ssmi.chp14.UserMapper.getUser", id);
    }
}

