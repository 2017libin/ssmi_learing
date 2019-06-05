/**
 * @Title: JsonUserController.java
 * @Package cn.osxm.ssmi.chp09.json
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月5日 下午10:29:08
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

import cn.osxm.ssmi.chp09.User;

/**
 * @ClassName: JsonUserController
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@Controller
public class JsonUserController {

	@GetMapping("/json/getUserByWrite")
	public void getJsonUserByResponseWriter(HttpServletResponse response, HttpServletRequest request) throws Exception {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		PrintWriter out;
		User user = new User(1, "Zhang San");
		// ObjectMapper mapper = new ObjectMapper();
		// String userJsonStr = mapper.writeValueAsString(user);
		out = response.getWriter();
		// out.write(userJsonStr);
		out.flush();
	}

	@GetMapping("/json/getUserByOutputStream")
	public void getJsonUserByResponseOutputStream(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		User user = new User(1, "Zhang San");
		// ObjectMapper mapper = new ObjectMapper();
		// String userJsonStr = mapper.writeValueAsString(user);
		// response.getOutputStream().print(userJsonStr);
		response.getOutputStream().flush();
	}

	@ResponseBody
	@GetMapping("/json/getJsonUserResponseBodyAnno")
	public User getJsonUserResponseBodyAnno() {
		User user = new User(1, "Zhang San");
		return user;
	}

}