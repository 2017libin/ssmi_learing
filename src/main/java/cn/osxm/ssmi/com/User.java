/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午9:53:42
 * @version V1.0
 */

package cn.osxm.ssmi.com;

/**
 * @ClassName: User
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class User {
	private String name;


	public void setName(String name) {
		this.name = name;
	}


	public User(String name) {
		this.name = name;
	}
	

	public String getName() {
	
		return name;
	}
}
