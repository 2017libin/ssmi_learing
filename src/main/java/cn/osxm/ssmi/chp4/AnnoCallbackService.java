/**
 * @Title: AnnoCallbackService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��24�� ����5:37:57
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName: AnnoCallbackService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class AnnoCallbackService {
	
	private String sBar;
	

	public String getsBar() {
	
		return sBar;
	}

	public void setsBar(String sBar) {
		this.sBar = sBar;
	}

	@PostConstruct
	public void init11() {
		System.out.println("[ע��@PostConstruct]��ʼ�������ص�������");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("[ע��@PreDestroy]���ٷ����ص���������");
	}
}
