/**
 * @Title: UserController.java
 * @Package cn.osxm.ssmi.chp7
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月18日 下午9:50:25
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonView;

import cn.osxm.ssmi.chp02.User;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@GetMapping(path = "/get/{id}", produces = "application/json;")
	@ResponseBody
	public User getUser(@PathVariable String id) {
		User user = new User();
		if (id.equals( "1")) {
			user.setId(id);
			user.setName("User 1");
		}
		return user;
	}

	@GetMapping(path = "/getJson/{id}")
	@ResponseBody
	//@JsonView(WithoutNameView.class)
	public User getUserJson() {
		User user = new User("001", "Oscar");
		return user;
	}

	@GetMapping(path = "/getView/{id}")
	public String getUserView(Model model) {
		model.addAttribute("user", new User("001", "Oscar"));
		//model.addAttribute(JsonView.class.getName(), User.WithoutNameView.class);
		return "userView";
	}
}
