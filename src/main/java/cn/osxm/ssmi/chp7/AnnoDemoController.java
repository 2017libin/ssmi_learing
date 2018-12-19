/**
 * @Title: AnnoDemoController.java
 * @Package cn.osxm.ssmi.chp7
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月20日 上午7:08:33
 * @version V1.0
 */

package cn.osxm.ssmi.chp7;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: AnnoDemoController
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@Controller
@RequestMapping("/anno-demo")
public class AnnoDemoController {

	@GetMapping("/res-entity")
	public ResponseEntity<String> resEntity() {
		String body = "ResponseEntity 返回的内容";
		String eTag = "";
		return ResponseEntity.ok().eTag(eTag).body(body);
	}
}
