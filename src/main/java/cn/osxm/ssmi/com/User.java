/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月14日 下午9:53:42
 * @version V1.0
 */

package cn.osxm.ssmi.com;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class User implements Serializable{

    private static final long serialVersionUID = 5041799435667583775L;

    private int id;

	private String name;

	private int deptId;

	public User() {

	}

	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
}
