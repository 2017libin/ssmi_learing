/**
 * @Title: RequestParamTest.java
 * @Package cn.osxm.ssmi.chp07
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月15日 下午10:32:37
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
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
 * @ClassName: RequestParamTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:springmvc.xml" })
public class RequestParamTest {
	@Autowired
	public WebApplicationContext wac;

	private MockMvc mockMvc;

	@SuppressWarnings("unused")
	private MockHttpSession session;

	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		this.session = new MockHttpSession();
	}

	// @Test
	@SuppressWarnings("unused")
	public void requestParam() {
		try {
			String url = "/anno-demo/helloWithParam";
			String getParam = "?userName=Oscar";
			getParam = "";

			// Get
//            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(url+getParam)).andExpect(MockMvcResultMatchers.status().is(200))
//                    .andDo(MockMvcResultHandlers.print()).andReturn();           
			MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post(url).param("userName", "Oscar"))
					.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();

			int status = mvcResult.getResponse().getStatus();
			System.out.println("请求状态码：" + status);
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("返回结果：" + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Test
	public void requestParamObject() {
		try {
			String url = "/anno-demo/helloWithParamObject";
			String getParam = "?name=Oscar";

			// Get
			MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(url + getParam))
					.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();

			int status = mvcResult.getResponse().getStatus();
			System.out.println("请求状态码：" + status);
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("返回结果：" + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Test
	public void pathVariable() {
		try {
			String url = "/anno-demo/helloPathVariable/oscar";

			// Get
			MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(url))
					.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();

			int status = mvcResult.getResponse().getStatus();
			System.out.println("请求状态码：" + status);
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("返回结果：" + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Test
	public void martrixVariable() {
		try {
			String url = "/anno-demo/helloMartrixVariable/oscar;id=1";

			// Get
			MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(url))
					.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
			int status = mvcResult.getResponse().getStatus();
			System.out.println("请求状态码：" + status);
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("返回结果：" + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Test
	public void helloMultiMartrixVariable() {
		try {
			String url = "/anno-demo/dept/dept001;att1=value1/user/user001;att1=value11;att2=value2";
			// Get
			MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(url))
					.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
			int status = mvcResult.getResponse().getStatus();
			System.out.println("请求状态码：" + status);
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("返回结果：" + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void requestBodyObj() {
		try {
			String url = "/requestBodyObj";
			String jsonStr = "{\"name\":\"oscar\",\"id\":\"001\"}";
			MvcResult mvcResult = mockMvc
					.perform(MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_UTF8)
							.content(jsonStr))
					.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
			int status = mvcResult.getResponse().getStatus();
			System.out.println("请求状态码：" + status);
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("返回结果：" + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
