/**
 * @Title: User.java
 * @Package cn.osxm.ssmi.chp12.entity
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:41:44
 * @version V1.0
 */

package cn.osxm.ssmi.chp12.entity;
/**
  * @ClassName: User
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class User {
	   private String userId;

	    private String userName;

	    private int age;

	    public String getUserId() {
	        return userId;
	    }

	    public void setUserId(String userId) {
	        this.userId = userId;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
}
