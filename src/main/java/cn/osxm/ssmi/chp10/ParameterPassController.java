/**
 * @Title: ParameterPassController.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月22日 上午11:22:28
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.osxm.ssmi.com.User;

/**
  * @ClassName: ParameterPassController
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@Controller
@RequestMapping("/parametepass")
public class ParameterPassController {

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
		modelAndView.addObject("user", new User("Oscar"));
		return modelAndView;
	}
}
