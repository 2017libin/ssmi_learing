/**
 * @Title: TwoService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月18日 下午10:30:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

/**
 * @ClassName: TwoService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class TwoService {

	private ThirdService thirdService;
	
	private FourService fourService;

	//构造器参数注入依赖对象，可以使用XML或是Java代码方式进行配置
	public TwoService(ThirdService thirdService, FourService fourService) {
		this.thirdService = thirdService;
		this.fourService = fourService;
	}
	
	public void doMethod() {
		fourService.doMethod();
	}
}
