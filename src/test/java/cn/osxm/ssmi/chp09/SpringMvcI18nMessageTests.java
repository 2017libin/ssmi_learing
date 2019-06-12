/**
 * @Title: SpringMvcI18nMessageTests.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月11日 上午7:01:58
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;

import java.util.Locale;

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
  * @ClassName: SpringMvcI18nMessageTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp09/i18n-messages-mvc.xml")
@WebAppConfiguration
public class SpringMvcI18nMessageTests {
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		// 'LocalValidatorFactoryBean
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		//WebApplicationContextUtils
	}

	@Test
     public void getLocalFromRequest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/getLocalFromRequest").locale(Locale.CHINA))
				//.header("Accept-Language", Locale.CHINA)
		.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
     }

	
}
