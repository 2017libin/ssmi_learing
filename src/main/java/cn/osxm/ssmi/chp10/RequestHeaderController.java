/**
 * @Title: RequestHeaderController.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��22�� ����4:48:52
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: RequestHeaderController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Controller
@RequestMapping("/requestheader")
public class RequestHeaderController {
    
	@RequestMapping("/save")
	public ModelAndView saveUser(User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userView");
		modelAndView.addObject("user", new User("Oscar"));
		return modelAndView;
	}
	
	@RequestMapping("/jsonSave")
	public ModelAndView jsonSaveUser(@RequestBody User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userView");
		modelAndView.addObject("user",user);
		System.out.println(user.getName());
		return modelAndView;
	}
    
}
