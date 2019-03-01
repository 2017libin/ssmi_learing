/**
 * @Title: GenUser.java
 * @Package cn.osxm.ssmi.chp12.entity
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:39:39
 * @version V1.0
 */

package cn.osxm.ssmi.chp12.entity;
/**
  * @ClassName: GenUser
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public abstract class GenUser {
	private int id;

    private String userType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
