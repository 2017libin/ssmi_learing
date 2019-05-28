/**
 * @Title: HttpMessageConvertController.java
 * @Package cn.osxm.ssmi.chp08.httpmsgconvert
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月28日 下午9:28:21
 * @version V1.0
 */

package cn.osxm.ssmi.chp08.httpmsgconvert;
/**
  * @ClassName: HttpMessageConvertController
  * @Description: TODO
  * @author osxm:oscarxueming
  */

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.osxm.ssmi.chp08.User;

@Controller
public class HttpMessageConvertController {

	public ResponseEntity<String> httpClassType(HttpEntity<User> httpEntity){
		return new ResponseEntity<>("Hello World!", HttpStatus.OK);		
		/*return ResponseEntity.ok()
			        .header("Custom-Header", "foo")
			        .body("Custom header set");*/
		
	}
	
	@GetMapping("/staticMethodResponseEntity")
	ResponseEntity<String> staticMethodResponseEntity() {
		//RequestResponseBodyMethodProcessor
	    return ResponseEntity.ok("Hello World!");
	}
	
	@GetMapping("/requestEntityStr")
	ResponseEntity<String> requestEntityStr(RequestEntity<String> requestEntity) {
		String str = requestEntity.getBody();
		str =  "This is New String";
	
		HttpHeaders responseHeaders = new HttpHeaders();
		ResponseEntity<String> responseEntity =new ResponseEntity<>(str, responseHeaders, HttpStatus.OK );
		
		//ResponseEntity.ok(str);
	    return responseEntity;
	}
	
	
	
	
	@GetMapping("/requestEntityUser")
	ResponseEntity<User> requestEntityUser(RequestEntity<User> requestEntity) {
		User user = requestEntity.getBody();	
		HttpHeaders responseHeaders = new HttpHeaders();
		user.setName("Li Si");
		ResponseEntity<User> responseEntity =new ResponseEntity<>(user, responseHeaders, HttpStatus.OK );
	    return responseEntity;
	}
	
	@ResponseBody
	@GetMapping("/requestResponseBody")
    public User requestResponseBody(@RequestBody User user) {
		user.setName("Li Si");
		return user;
	}
	
	/*
	public ResponseEntity<User> getEntity(RequestEntity<User> requestEntity) {
		String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
		HttpHeaders responseHeaders = new HttpHeaders();//创建响应头
		responseHeaders.set("MyResponseHeader", "MyValue");//自定义响应头
		ResponseEntity<Dept> responseEntity =new ResponseEntity<>(dept, responseHeaders, HttpStatus. OK );
		return responseEntity;
	}
	
	
	@RequestMapping("/something")
	public ResponseEntity<String> handle(HttpEntity<byte[]> requestEntity) 
	        throws UnsupportedEncodingException 
	{
	    String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
	    byte[] requestBody = requestEntity.getBody();

	    // do something with request header and body

	    HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("MyResponseHeader", "MyValue");
	    return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/age")
	ResponseEntity<String> age(
	  @RequestParam("yearOfBirth") int yearOfBirth) {

	    if (isInFuture(yearOfBirth)) {
	        return new ResponseEntity<>(
	          "Year of birth cannot be in the future", 
	          HttpStatus.BAD_REQUEST);
	    }

	    return new ResponseEntity<>(
	      "Your age is " + calculateAge(yearOfBirth), 
	      HttpStatus.OK);
	}
	
	@GetMapping("/hello")
	ResponseEntity<String> hello() {
	    return ResponseEntity.ok("Hello World!");
	}*/
}
