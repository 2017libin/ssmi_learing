/**
 * @Title: RestTemplateTests.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月7日 上午5:40:06
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;

import java.net.URI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: RestTemplateTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp09/rest-template.xml")
public class RestTemplateTests {

	@Autowired
	private RestTemplate simpleRestTemplate;

	// @Test
	public void simpleRestTemplateStr() {
		String url = "http://localhost:8080/ssmi/users/1";
		String string = simpleRestTemplate.getForObject(url, String.class);
		System.out.println(string);
	}

	// @Test
	public void simpleRestTemplate() {
		String url = "http://localhost:8080/ssmi/users/1";
		User user = simpleRestTemplate.getForObject(url, User.class);
		System.out.println(user);
		ResponseEntity responseEndtity = simpleRestTemplate.getForEntity(url, User.class);
		user = (User) responseEndtity.getBody();
		System.out.println(user);
	}

	// @Test
	public void simpleRestTemplateHeader() {
		String url = "http://localhost:8080/ssmi/users/1";
		HttpHeaders header = simpleRestTemplate.headForHeaders(url);
		MediaType contentType = header.getContentType();
		System.out.println(contentType.getType());
	}

	// @Test
	public void simpleRestTemplatePost() {
		String url = "http://localhost:8080/ssmi/users";
		HttpEntity<User> request = new HttpEntity<User>(new User(4, "User 4"));
		URI location = simpleRestTemplate.postForLocation(url, request);
		ResponseEntity responseEndtity = simpleRestTemplate.postForEntity(url, request, User.class);
		User user = simpleRestTemplate.postForObject(url, request, User.class);
		System.out.println(user);
		System.out.println(location);
	}

	// @Test
	public void simpleRestTemplatePut() {
		String url = "http://localhost:8080/ssmi/users/1";
		HttpEntity<User> request = new HttpEntity<User>(new User(1, "User 11"));
		simpleRestTemplate.put(url, request);
	}

	@Test
	public void simpleRestTemplateExange() {
		String url = "http://localhost:8080/ssmi/users/{id}";
		ResponseEntity<User> userEntity = simpleRestTemplate.exchange(url, HttpMethod.GET, null, User.class, 1);
		User user = userEntity.getBody();
		System.out.println(user);
	}

	@Test
	public void simpleRestTemplateExecute() {
		String url = "http://localhost:8080/ssmi/users/{id}";
		ResponseEntity<User> userEntity = simpleRestTemplate.exchange(url, HttpMethod.GET, null, User.class, 1);
		User user = userEntity.getBody();
		System.out.println(user);
	}

}
