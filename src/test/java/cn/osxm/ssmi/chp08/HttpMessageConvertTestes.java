/**
 * @Title: HttpMessageConvertTestes.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月27日 上午6:07:14
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
  * @ClassName: HttpMessageConvertTestes
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp08/http-message-convert.xml")
@WebAppConfiguration
public class HttpMessageConvertTestes {
	private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac; 
	 @Before
	 public void setup() {
		 mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	//@Test
	public void addUser() throws Exception {
	//MvcResult mvcResult = 
	mockMvc.perform(MockMvcRequestBuilders.get("/user/add").param("name", "Zhang San").param("birthDay", "2019?06-10"))
				.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();

	}
	//@Test
	public void staticMethodResponseEntity() throws Exception {
	//MvcResult mvcResult = 
		//HttpInputMessage
	mockMvc.perform(MockMvcRequestBuilders.get("/staticMethodResponseEntity"))
				.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();

	}
	//@Test
	public void requestEntity() throws Exception { 
		mockMvc.perform(MockMvcRequestBuilders.get("/requestEntityStr").content("This is Old String"))
		.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
	}
    //@Test
	public void requestEntityUser() throws Exception { 
    	String userJson = "{\"name\":\"Zhang San\",\"birthDay\":\"2019-06-10\"}";
		mockMvc.perform(MockMvcRequestBuilders.get("/requestEntityUser").content(userJson).contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
	}
	
	@Test
	public void requestResponseBody() throws Exception { 
		String userJson = "{\"name\":\"Zhang San\",\"birthDay\":\"2019-06-10\"}";
		mockMvc.perform(MockMvcRequestBuilders.get("/requestResponseBody").content(userJson).contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
	}
}
