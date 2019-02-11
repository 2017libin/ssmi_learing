/**
 * @Title: TwoService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��18�� ����10:30:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

/**
 * @ClassName: TwoService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class TwoService {

	private ThirdService thirdService;
	
	private FourService fourService;
	public TwoService() {
		
	}
	

	//����������ע���������󣬿���ʹ��XML����Java���뷽ʽ��������
	public TwoService(ThirdService thirdService, FourService fourService) {
		this.thirdService = thirdService;
		this.fourService = fourService;
	}
	
	public void doMethod() {
		fourService.doMethod();
	}
	
	
	public ThirdService getThirdService() {
		
		return thirdService;
	}

	public void setThirdService(ThirdService thirdService) {
		this.thirdService = thirdService;
	}

	public FourService getFourService() {
	
		return fourService;
	}

	public void setFourService(FourService fourService) {
		this.fourService = fourService;
	}
}
