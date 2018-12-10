/**
 * @Title: ServiceLocator.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��10�� ����9:20:56
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

/**
 * @ClassName: ServiceLocator
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class ServiceLocator {

	public static ThirdService thirdService = new ThirdService();

	public static FourService fourService = new FourService();

	public ThirdService createThirdServiceInstance() {
		return thirdService;
	}

	public FourService createFourServiceInstance() {
		return fourService;
	}
}
