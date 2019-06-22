/**
 * @Title: ParameterPassTests.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月22日 上午11:20:59
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName: ParameterPassTests
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ParameterStandalonePassTests {
	private static MockMvc mockMvc;

	@BeforeAll
	static void setup() {
		ParameterPassController controller = new ParameterPassController();
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		// mockMvc =
		// MockMvcBuilders.standaloneSetup(controller).setMessageConverters(messageConverters).build();
	}

	//@Test
	public void postHttpParamsTest() throws Exception {
		mockMvc.perform(post("/parametepass/save").param("id", "100").param("name", "Zhang San"))
				.andExpect(status().isOk()).andDo(print());
	}

	@Test
	public void postJsonHttpParamsTest() throws Exception {
		String sJsonStr = "{\"id\":\"100\",\"name\":\"Zhang San\"}";
		mockMvc.perform(post("/parametepass/jsonSave").contentType(MediaType.APPLICATION_JSON).content(sJsonStr))
				.andExpect(status().isOk()).andDo(print());
	}
}
