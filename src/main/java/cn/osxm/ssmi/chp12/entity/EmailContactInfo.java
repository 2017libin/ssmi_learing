/**
 * @Title: EmailContactInfo.java
 * @Package cn.osxm.ssmi.chp12.entity
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��3��1�� ����9:38:28
 * @version V1.0
 */

package cn.osxm.ssmi.chp12.entity;
/**
  * @ClassName: EmailContactInfo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class EmailContactInfo extends ContactInfo {

    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
