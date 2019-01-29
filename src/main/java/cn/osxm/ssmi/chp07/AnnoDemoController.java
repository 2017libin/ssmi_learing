/**
 * @Title: AnnoDemoController.java
 * @Package cn.osxm.ssmi.chp7
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��20�� ����7:08:33
 * @version V1.0
 */

package cn.osxm.ssmi.chp07;

import javax.annotation.PostConstruct;

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

	@PostConstruct
	public void init() {
		System.out.println("[ע��@PostConstruct��AnnoDemoController]��ʼ�������ص�������");
	}

	
	@GetMapping("/res-entity")
	public ResponseEntity<String> resEntity() {
		String body = "ResponseEntity ���ص�����";
		String eTag = "";
		return ResponseEntity.ok().eTag(eTag).body(body);
	}
}
