/**
 * @Title: SpringMvcExceptionTests.java
 * @Package cn.osxm.ssmi.chp15
 * @Description: TODO
 * @author oscarchen
 * @date 2019Äê7ÔÂ26ÈÕ
 * @version V1.0
 */
package cn.osxm.ssmi.chp15;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @ClassName: SpringMvcExceptionTests
 * @Description: TODO
 * @author oscarchen
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp15/springmvc-exception.xml" })
public class SpringMvcExceptionTests {
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

	@SuppressWarnings("unused")
	@Test
	public void exceptionHandlerAnno() throws Exception {
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/exception/exceptionHandler"))
				.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
	}

	// @Test
	@SuppressWarnings("unused")
	public void responseStatus() throws Exception {
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/exception/responseStatus"))
				.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
	}
}
