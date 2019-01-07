/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.chp10.hibernate
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:37:49
 * @version V1.0
 */

package cn.osxm.ssmi.chp10.hibernate;
/**
  * @ClassName: User
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class User {
	private String id;

	private String name;


	public String getId() {

		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
