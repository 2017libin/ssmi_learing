/**
 * @Title: WebStandaloneTest.java
 * @Package cn.osxm.ssmi.chp8
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月23日 下午9:44:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;
/**
  * @ClassName: WebStandaloneTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.easymock.EasyMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cn.osxm.ssmi.com.anno.UserController;
import cn.osxm.ssmi.com.anno.UserServiceImpl;

public class WebStandaloneTest {
	 private MockMvc mockMvc;

	    @BeforeEach
	    void setup() {
	        UserController userController = new UserController();
	        UserServiceImpl userServiceImpl = EasyMock.createMock(UserServiceImpl.class);
	        EasyMock.expect(userServiceImpl.getUserNameById("1")).andReturn("Chen Oscar");
	        EasyMock.replay(userServiceImpl);

	        ReflectionTestUtils.setField(userController, "userServiceImpl", userServiceImpl);
	        this.mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	        // this.mockMvc =
	        // MockMvcBuilders.standaloneSetup(userController).apply(SharedHttpSessionConfigurer.sharedHttpSession()).build();
	        MockMvcBuilders.standaloneSetup(userController).defaultRequest(get("/").accept(MediaType.APPLICATION_JSON))
	                .alwaysExpect(status().isOk()).alwaysExpect(content().contentType("application/json;charset=UTF-8")).build();
	    }

	    @Test
	    public void getUserName() throws Exception {
	        this.mockMvc.perform(get("/user/1").accept(MediaType.parseMediaType("application/json;charset=UTF-8"))).andDo(print()).andExpect(MockMvcResultMatchers.status().isOk())
	                .andExpect(MockMvcResultMatchers.content().string("Chen Oscar"));
	    }
}
