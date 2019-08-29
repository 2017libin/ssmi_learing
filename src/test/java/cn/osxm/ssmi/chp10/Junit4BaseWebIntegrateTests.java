/**
 * @Title: Junit4BaseWebIntegrateTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年4月4日 下午10:55:25
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;
import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

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
  * @ClassName: Junit4BaseWebIntegrateTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

//@SpringJUnitWebConfig(locations = { "classpath:applicationContext.xml" }) //JUnit4不能用
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:cn/osxm/ssmi/chp08/applicationContext.xml")
@WebAppConfiguration
public class Junit4BaseWebIntegrateTests {
	  private MockMvc mockMvc;

	  @Autowired
	  private WebApplicationContext wac;

	  @Before
	  public void setup() {
	      mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	  }

	  @Test
	  public void getUserName() throws Exception {
	      MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/1")).andExpect(MockMvcResultMatchers.status().is(200))
	              .andDo(MockMvcResultHandlers.print()).andReturn();
	      String result = mvcResult.getResponse().getContentAsString();
	      System.out.println("返回结果：" + result);

	      this.mockMvc.perform(get("/user/1").accept(MediaType.parseMediaType("application/json;charset=UTF-8"))).andExpect(MockMvcResultMatchers.status().isOk())
	              .andExpect(MockMvcResultMatchers.content().string("user1"));
	  }
}

