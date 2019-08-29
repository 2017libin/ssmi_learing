/**
 * @Title: ParameterPassIntegrateController.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月22日 上午11:28:18
 * @version V1.0
 */

package cn.osxm.ssmi.chp10;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName: ParameterPassIntegrateController
 * @Description: TODO
 * @author osxm:oscarxueming
 */
@SpringJUnitWebConfig(locations = { "classpath:cn/osxm/ssmi/chp10/springmvc.xml" })
public class ParameterPassIntegrateController {
	@SuppressWarnings("unused")
	private MockMvc mockMvc;

	@BeforeEach
	void setup(WebApplicationContext wac) {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
}
