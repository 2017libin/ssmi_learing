/**
 * @Title: ParentUsrDao.java
 * @Package cn.osxm.ssmi.chp08.parentchild.parent
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午10:20:31
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.parentchild.parent;
import org.springframework.stereotype.Repository;
/**
  * @ClassName: ParentUsrDao
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Repository
public class ParentUsrDao implements UserDao {

    @Override
    public String getUserName(String id) {
        // TODO Auto-generated method stub
        return "Parent User Name";
    }

}

