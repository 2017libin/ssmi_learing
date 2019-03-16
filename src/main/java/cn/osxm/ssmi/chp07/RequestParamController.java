/**
 * @Title: RequestParamController.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��3��16�� ����3:42:35
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
/**
  * @ClassName: RequestParamController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Controller
public class RequestParamController {

    
    @PostMapping(value="/requestBodyObj")
    public ModelAndView requestBodyObj(@RequestBody User user) {
        System.out.println("�Զ�װ�䣺"+user.getName());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
