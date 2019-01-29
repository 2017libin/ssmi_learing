/**
 * @Title: WebStandaloneTest.java
 * @Package cn.osxm.ssmi.chp6
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月20日 上午7:06:43
 * @version V1.0
 */

package cn.osxm.ssmi.chp06;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cn.osxm.ssmi.chp06.HelloController;
/**
 * @ClassName: WebStandaloneTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class WebStandaloneTest {
	private MockMvc mockMvc;

	@BeforeEach
	public void setUp() {
		HelloController helloController = new HelloController();
		mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
	}

	@Test
	public void getUser() {
		try {
			MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello/say"))
					.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();

			int status = mvcResult.getResponse().getStatus();
			System.out.println("请求状态码：" + status);
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("返回结果：" + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
	}
}
