/**
 * @Title: UserService.java
 * @Package cn.osxm.ssmi.chp17.anno
 * @Description: TODO
 * @author oscarchen
 * @date 2019年8月7日
 * @version V1.0
 */
package cn.osxm.ssmi.chp17.anno;

import org.springframework.stereotype.Component;

/**
  * @ClassName: UserService
  * @Description: TODO
  * @author oscarchen
  */
@Component
public class UserService {

    public void add() throws Exception {
        System.out.println("添加用户");
       // throw new Exception("s");
    }
}
