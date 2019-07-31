/**
 * @Title: ServiceResponse.java
 * @Package cn.osxm.ssmi.chp15.exception
 * @Description: TODO
 * @author oscarchen
 * @date 2019Äê7ÔÂ28ÈÕ
 * @version V1.0
 */
package cn.osxm.ssmi.chp15.exception;

/**
 * @ClassName: ServiceResponse
 * @Description: TODO
 * @author oscarchen
 */
public class ServiceResponse {

	public String status;

	public String msg;

	public ServiceResponse(String status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public static ServiceResponse fail(String msg) {
		return new ServiceResponse("fail", msg);
	}
}
