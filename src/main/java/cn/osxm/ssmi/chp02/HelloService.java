/**
 * @Title: HelloService.java
 * @Package cn.osxm.ssmi.chp02
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月4日 上午6:54:00
 * @version V1.0
 */

package cn.osxm.ssmi.chp02;

/**
 * @ClassName: HelloService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class HelloService {

	private String name;

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello," + this.name);
	}

	public String getHello() {
		String str = "Hello";
		if (name != null) {
			str += ",";
			str += name;
		}
		return str;
	}
}
