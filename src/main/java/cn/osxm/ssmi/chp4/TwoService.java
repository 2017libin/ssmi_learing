/**
 * @Title: TwoService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��18�� ����10:30:46
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

	//����������ע���������󣬿���ʹ��XML����Java���뷽ʽ��������
	public TwoService(ThirdService thirdService, FourService fourService) {
		this.thirdService = thirdService;
		this.fourService = fourService;
	}
	
	public void doMethod() {
		fourService.doMethod();
	}
}
