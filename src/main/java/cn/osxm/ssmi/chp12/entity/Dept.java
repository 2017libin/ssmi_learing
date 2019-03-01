/**
 * @Title: Dept.java
 * @Package cn.osxm.ssmi.chp12.entity
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:37:19
 * @version V1.0
 */

package cn.osxm.ssmi.chp12.entity;
import java.util.List;

/**
  * @ClassName: Dept
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class Dept {
	  private String deptId;

	    private String deptName;

	    private String deptLeaderId;

	    // 通过deptLeaderId获取， 可以不需要Setter方法
	    private User deptLeader;

	    private List<User> deptUsers;

	    public String getDeptId() {
	        return deptId;
	    }

	    public void setDeptId(String deptId) {
	        this.deptId = deptId;
	    }

	    public String getDeptName() {
	        return deptName;
	    }

	    public void setDeptName(String deptName) {
	        this.deptName = deptName;
	    }

	    public String getDeptLeaderId() {
	        return deptLeaderId;
	    }

	    public void setDeptLeaderId(String deptLeaderId) {
	        this.deptLeaderId = deptLeaderId;
	    }

	    public User getDeptLeader() {
	        return deptLeader;
	    }

	    public List<User> getDeptUsers() {
	        return deptUsers;
	    }
}
