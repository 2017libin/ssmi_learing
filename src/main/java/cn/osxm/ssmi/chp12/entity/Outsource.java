/**
 * @Title: Outsource.java
 * @Package cn.osxm.ssmi.chp12.entity
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:40:35
 * @version V1.0
 */

package cn.osxm.ssmi.chp12.entity;
/**
  * @ClassName: Outsource
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class Outsource extends GenUser {

    private String company;

    private String vendorAccount;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getVendorAccount() {
        return vendorAccount;
    }

    public void setVendorAccount(String vendorAccount) {
        this.vendorAccount = vendorAccount;
    }
}
