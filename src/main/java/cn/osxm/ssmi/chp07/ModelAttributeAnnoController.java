/**
 * @Title: ModelAttributeAnnoController.java
 * @Package cn.osxm.ssmi.chp7
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月20日 上午7:12:09
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;
/**
  * @ClassName: ModelAttributeAnnoController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: ModelAttributeAnnoController
 * @Description: TODO
 * @author oscarchen
 */
@Controller
@RequestMapping("/modelattribute")
public class ModelAttributeAnnoController {

	@ModelAttribute
	public void modelAttrMethod(@RequestParam(required = false) String name, Model model) {
		model.addAttribute("name", "Oscar");
		System.out.println("设置Model的值。。。。");
	}

	@GetMapping("/get")
	// @ResponseBody
	// public Map get() {
	public String get() {
		return "modelattribute";
		// Map<String, String> map = new HashMap<String, String>();
		// map.put("name", "Oscar");
		// return map;
	}
}
