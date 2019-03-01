/**
 * @Title: Dept.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:49:04
 * @version V1.0
 */

package cn.osxm.ssmi.com;

/**
 * @ClassName: Dept
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class Dept {
	private int id;

	private String name;

	private int directorId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDirectorId() {
		return directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}

}
