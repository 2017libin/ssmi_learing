/**
 * @Title: UseLazyService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��6�� ����9:21:29
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

/**
 * @ClassName: UseLazyService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class UseLazyService {
	private CfgCallbackService lazyInitService;

	public CfgCallbackService getLazyInitService() {

		return lazyInitService;
	}

	public void setLazyInitService(CfgCallbackService lazyInitService) {
		this.lazyInitService = lazyInitService;
	}
}
