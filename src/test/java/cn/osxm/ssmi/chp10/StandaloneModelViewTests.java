/**
 * @Title: StandaloneModelViewTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年4月4日 下午10:57:24
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import javax.servlet.http.Cookie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cn.osxm.ssmi.chp07.ResponseAnnoController;
import cn.osxm.ssmi.chp10.UserController;
import cn.osxm.ssmi.com.User;

//import com.jayway.jsonpath.JsonPath;
/**
 * @ClassName: StandaloneModelViewTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class StandaloneModelViewTests {

	private static MockMvc mockMvc;

	@BeforeAll
	static void setup() {
		UserController userController = new UserController();
		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}

	//@Test
	public void getUserModelView() throws Exception {
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user/getModelView"); // 构造请求
		ResultActions resultActions = this.mockMvc.perform(requestBuilder); // 执行请求，返回结果
		resultActions.andExpect(MockMvcResultMatchers.status().isOk()); // 响应状态断言
		resultActions.andExpect(MockMvcResultMatchers.view().name("userView")); // 视图返回断言
		resultActions.andExpect(MockMvcResultMatchers.model().attributeExists("user"));// 模型返回断言
		resultActions.andDo(MockMvcResultHandlers.print()); // 打印请求和响应的信息
		MvcResult result = resultActions.andReturn(); // 返回结果
		User user = (User) result.getModelAndView().getModel().get("user"); // 从结果得到模型数据
		ModelAndViewAssert.assertModelAttributeAvailable(result.getModelAndView(), "user");
		// 简写
		result = mockMvc.perform(MockMvcRequestBuilders.get("/user/getModelView"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.view().name("userView"))
				.andExpect(MockMvcResultMatchers.model().attributeExists("user")).andDo(MockMvcResultHandlers.print())
				.andReturn();

	
		// 静态引入后简写
		result = mockMvc.perform(get("/user/getModelView")).andExpect(status().isOk())
				.andExpect(view().name("userView")).andExpect(model().attributeExists("user")).andDo(print())
				.andReturn();
	}

	// @Test
	public void parametersTest() throws Exception {
		// mockMvc.perform(get("/user/getModelView").param("param1",
		// "001")).andExpect(status().isOk()).andDo(print()).andReturn();
		// mockMvc.perform(get("/user/getModelView").requestAttr("reqAttr1", "reqAttr1
		// Value")).andExpect(status().isOk()).andDo(print()).andReturn();
		// mockMvc.perform(get("/user/getModelView").sessionAttr("sessAttr1", "sessAttr1
		// Value")).andExpect(status().isOk()).andDo(print()).andReturn();

		String sBody = "bodyAttr1=value1&bodyAttr2=value2";
		mockMvc.perform(get("/user/get").characterEncoding("utf-8").
		// contentType(MediaType.APPLICATION_FORM_URLENCODED).
				content(sBody)).andExpect(status().isOk()).andDo(print());
	}

	//@Test
	public void getHttpParamsTest() throws Exception {
		// 1. url
		 //mockMvc.perform(get("/user/getModelView?param1=value1")).andExpect(status().isOk()).andDo(print());
		 //mockMvc.perform(post("/user/getModelView?param1=value1")).andExpect(status().isOk()).andDo(print());
		// 2. param()方法
		// mockMvc.perform(get("/user/getModelView").param("param1",
		// "value1")).andExpect(status().isOk()).andDo(print());
		// 3. content()
		 String sParamsStr = "param1=value1&param2=value2";
		 mockMvc.perform(get("/user/getModelView").contentType(MediaType.APPLICATION_FORM_URLENCODED).content(sParamsStr)).andExpect(status().isOk()).andDo(print());
		// 4. requestAttr方法
		// mockMvc.perform(get("/user/getModelView").requestAttr("reqAttr1",
		// "value1")).andExpect(status().isOk()).andDo(print());

		// 返回结果
		//MvcResult result = mockMvc.perform(get("/user/getModelView").requestAttr("reqAttr1", "value1"))
		//		.andExpect(status().isOk()).andDo(print()).andReturn();
	}

	@Test
	public void postHttpParamsTest() throws Exception {
		//mockMvc.perform(post("/user/postModelView?param1=value1"))
		//.andExpect(status().isOk()).andDo(print());
		
		//mockMvc.perform(post("/user/postModelView").param("param1", "value1").requestAttr("reqAttr1", "value1"))
		//		.andExpect(status().isOk()).andDo(print());
		// String sParamsStr = "param1=value1";
		// mockMvc.perform(get("/user/getModelView").contentType(MediaType.APPLICATION_FORM_URLENCODED).content(sParamsStr)).andExpect(status().isOk()).andDo(print());

		String sJsonStr = "{\"body1\":\"value1\"}";
		mockMvc.perform(post("/user/postModelView").characterEncoding("utf-8").contentType(MediaType.APPLICATION_JSON).content(sJsonStr)).andExpect(status().isOk()).andDo(print());
	}

	// @Test
	public void cookieTest() throws Exception {
		Cookie cookies = new Cookie("username", "oscar999");
		mockMvc.perform(get("/user/getModelView").contentType(MediaType.APPLICATION_FORM_URLENCODED).cookie(cookies))
				.andExpect(status().isOk()).andDo(print()).andReturn();
	}

	// @Test
	public void resultMatchersTest() throws Exception {
		mockMvc.perform(get("/user/getModelView").header("myheader", "my-header-value"))
				.andExpect(handler().methodName("getUserModelView")).andExpect(header().exists("Content-Language"))
				// .andExpect(content().contentType(MediaType.TEXT_HTML))
				.andExpect(header().string("Content-Language", "en"));
		// .andExpect(header().string("content-type", "text/html")) ;
	}

	// @Test
	public void jsonResultMatcherTest() throws Exception {
		ResponseAnnoController responseAnnoController = new ResponseAnnoController();
		mockMvc = MockMvcBuilders.standaloneSetup(responseAnnoController).build(); // {"id":"001","name":"oscar"}
		mockMvc.perform(get("/getResponseBody")).andExpect(jsonPath("$.name").value("oscar")).andDo(print());
	}

	// @Test
	public void forwardResultMatcherTest() throws Exception {
		mockMvc.perform(get("/user/getModelView")).andExpect(view().name("userView"))
				// .andExpect(forwardedUrl("/WEB-INF/view/userView.jsp"))
				.andDo(print());

		MvcResult result = mockMvc.perform(get("/user/getModelView")).andReturn();
	}
}
