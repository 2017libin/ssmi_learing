/**
 * @Title: Employee.java
 * @Package cn.osxm.ssmi.chp12.entity
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:39:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp12.entity;
/**
  * @ClassName: Employee
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class Employee  extends GenUser {

    private String empId;

    private String dept;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        String objStr = "{";
        objStr += "id:" + this.getId();
        objStr += ",userType:" + this.getUserType();
        objStr += ",empId:" + this.getEmpId();
        objStr += ",dept:" + this.getDept();
        objStr += "}";
        return objStr;
    }
}
