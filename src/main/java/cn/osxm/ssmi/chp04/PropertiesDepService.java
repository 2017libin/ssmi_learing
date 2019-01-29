/**
 * @Title: PropertiesDepService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月20日 上午6:41:17
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

/**
 * @ClassName: PropertiesDepService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class PropertiesDepService {
	private String jdbcClass;

	private String jdbcUrl;

	public void setJdbcClass(String jdbcClass) {
		this.jdbcClass = jdbcClass;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public void fooBar() {
		System.out.println("jdbcClass=" + jdbcClass);
		System.out.println("jdbcUrl=" + jdbcUrl);
	}
}
