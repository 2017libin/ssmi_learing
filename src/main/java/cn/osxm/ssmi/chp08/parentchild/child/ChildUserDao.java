/**
 * @Title: ChildUserDao.java
 * @Package cn.osxm.ssmi.chp08.parentchild.child
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午10:19:39
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.parentchild.child;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import cn.osxm.ssmi.chp08.parentchild.parent.UserDao;
/**
  * @ClassName: ChildUserDao
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ChildUserDao implements UserDao {

    /**
      * Title: getUserName
      * Description:
      * @param id
      * @return
      * @see cn.osxm.ssmi.chp05.parentchild.parent.UserDao#getUserName(java.lang.String)
      */

    @Override
    public String getUserName(String id) {
        return "Child User Name";
    }

}

