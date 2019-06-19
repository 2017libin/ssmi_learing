/**
 * @Title: ChildUserDao.java
 * @Package cn.osxm.ssmi.chp5.parentchild.child
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午5:03:35
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.parentchild.child;
import org.springframework.stereotype.Repository;

import cn.osxm.ssmi.chp09.parentchild.parent.UserDao;
/**
  * @ClassName: ChildUserDao
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Repository
public class ChildUserDao implements UserDao {

    /**
      * Title: getUserName
      * Description:
      * @param id
      * @return
      * @see cn.osxm.ssmi.chp05.UserDAO.parent.UserDao#getUserName(java.lang.String)
      */

    @Override
    public String getUserName(String id) {
        // TODO Auto-generated method stub
        return "Child User Name";
    }

}
