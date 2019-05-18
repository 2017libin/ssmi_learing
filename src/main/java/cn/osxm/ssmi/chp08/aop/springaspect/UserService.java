/**
 * @Title: UserService.java
 * @Package cn.osxm.ssmi.chp08.aop.springaspect
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:41:42
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.aop.springaspect;
import org.springframework.stereotype.Service;
/**
  * @ClassName: UserService
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Service
public class UserService {
    public void add() {
        System.out.println("Add User");
    }
}
