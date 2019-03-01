/**
 * @Title: PhoneContactInfo.java
 * @Package cn.osxm.ssmi.chp12.entity
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:41:00
 * @version V1.0
 */

package cn.osxm.ssmi.chp12.entity;
/**
  * @ClassName: PhoneContactInfo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class PhoneContactInfo  extends ContactInfo {

    private String phoneNo;

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}