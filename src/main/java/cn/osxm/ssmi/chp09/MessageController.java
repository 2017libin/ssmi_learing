/**
 * @Title: MessageController.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月7日 上午10:31:52
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
  * @ClassName: MessageController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Controller
public class MessageController {

    @GetMapping("/message/login")
    public String login() {
        return "login";
    }
}
