package cn.osxm.ssmi.chp06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @author oscarchen
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

	@SuppressWarnings("rawtypes")
	@GetMapping("/say")
	@ResponseBody
	public Map say() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Oscar");
		return map;

	}
}