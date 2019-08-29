/**
 * @Title: Junit5BaseWebIntegrateTests.java
 * @Package cn.osxm.ssmi.chp08
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年4月4日 下午10:56:41
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
/**
  * @ClassName: Junit5BaseWebIntegrateTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

//@SpringJUnitWebConfig(locations = { "classpath:cn/osxm/ssmi/chp08/applicationContext.xml" })
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:cn/osxm/ssmi/chp08/applicationContext.xml")
@WebAppConfiguration
public class Junit5BaseWebIntegrateTests {
  private static MockMvc mockMvc;

  @BeforeAll
  static void setup(WebApplicationContext wac) {
      mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
  }

  @SuppressWarnings("static-access")
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
