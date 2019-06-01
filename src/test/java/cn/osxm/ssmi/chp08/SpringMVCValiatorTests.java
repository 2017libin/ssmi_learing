/**
 * @Title: SpringMVCValiatorTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月1日 上午10:28:30
 * @version V1.0
 */

package cn.osxm.ssmi.chp08;

import javax.validation.ValidatorFactory;

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

import cn.osxm.ssmi.chp08.validator.UserService;

/**
 * @ClassName: SpringMVCValiatorTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp08/springmvc-validator.xml")
@WebAppConfiguration
public class SpringMVCValiatorTests {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		// 'LocalValidatorFactoryBean
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Autowired
	private UserService userService;

	// @Test
	public void get() {
		userService.get("Zhang San");
	}

	// @Test
	public void addInvalidUser() {
		User user = new User();
		user.setAge(180);
		userService.add(user);
	}

	@Test
	public void mvcGet() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/getUser").param("name", ""))
				.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
	}

	// @Test
	public void mvcSave() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/saveUser").param("age", "180"))
				.andExpect(MockMvcResultMatchers.status().is(200)).andDo(MockMvcResultHandlers.print()).andReturn();
	}
}
