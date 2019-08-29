/**
 * @Title: ResponseAnnoController.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月16日 下午3:43:17
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;

/**
 * @ClassName: ResponseAnnoController
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ResponseAnnoController {
	@RequestMapping("/getResponseBody")
	@ResponseBody
	public User getResponseBody() {
		User user = new User();
		user.setName("oscar");
		user.setId("001");
		return user;
	}

	@RequestMapping("/getResponseBodyStr")
	@ResponseBody
	public String getResponseBodyStr() {
		return "oscar中文";
	}

	@RequestMapping("/requestBodyUsage")
	@ResponseBody
	public User requestBodyUsage(@RequestBody User user) {
		return user;
	}

	@RequestMapping("/responseJSONObj")
	public JSONPObject responseJSONObj() {
		return null;
	}

	@RequestMapping("/rsponseEntity")
	public ResponseEntity<String> resEntity() {
		// String body = "ResponseEntity 返回的内容";
		// String eTag = "";
		// return ResponseEntity.ok().eTag(eTag).body(body);

		HttpHeaders headers = new HttpHeaders();
		headers.add("headerAttr", "headerAttrValue");

		ResponseEntity<String> responseEntity = new ResponseEntity<String>("ResponseEntity 返回", headers, HttpStatus.OK);
		return responseEntity;
	}

	@RequestMapping("/responseByHttpServlet")
	public void responseByHttpServlet(HttpServletResponse response, HttpServletRequest request) {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out;
		try {
			out = response.getWriter();
			out.write("Oscar");
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
