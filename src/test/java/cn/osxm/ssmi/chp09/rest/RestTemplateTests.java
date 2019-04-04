/**
 * @Title: RestTemplateTests.java
 * @Package cn.osxm.ssmi.chp09.rest
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��4��4�� ����10:58:48
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.rest;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import cn.osxm.ssmi.com.User;
/**
  * @ClassName: RestTemplateTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class RestTemplateTests {

	   @Test
	    public void getForObject() {
	        // String url = "http://localhost:8080/users/{id}";
	        String url = "http://localhost:8080/ssmi/rest/users/{id}";
	        RestTemplate restTemplate = new RestTemplate();
	        Object obj = restTemplate.getForObject(url, User.class, 1);
	        System.out.println("user3 = " + obj);
	        //
	        /*Map<String, String> urlParams = new HashMap<>(1);
	        urlParams.put("id", String.valueOf(1));
	        User user2 = restTemplate.getForObject(url, User.class, urlParams);

	        // ����URL����Ҫ��url�Ͻ����ַ���ƴ�ӣ����Ƽ�ʹ��
	        int id = 1;
	        url = "http://localhost:9000/user/" + id;
	        User user3 = restTemplate.getForObject(URI.create(url), User.class);
	        System.out.println("user3 = " + user3);*/

	    }
	}
