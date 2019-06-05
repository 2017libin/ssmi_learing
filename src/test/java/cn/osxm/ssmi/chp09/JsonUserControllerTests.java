/**
 * @Title: JsonUserControllerTests.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月5日 下午10:28:12
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName: JsonUserControllerTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp09/springmvc-json.xml")
@WebAppConfiguration
public class JsonUserControllerTests {
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		// 'LocalValidatorFactoryBean
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	// @Test
	public void getJsonUserByResponseWriter() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/json/getUserByWrite"))
				.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
	}

	// @Test
	public void getJsonUserByResponseOutputStream() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/json/getUserByOutputStream"))
				.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
	}

	@Test
	public void getJsonUserResponseBodyAnno() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/json/getJsonUserResponseBodyAnno"))
				.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
	}
}
