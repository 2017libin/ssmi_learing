/**
 * @Title: MyDataSource.java
 * @Package cn.osxm.ssmi.chp5.profile
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午5:08:03
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.profile;
import org.springframework.stereotype.Component;
/**
  * @ClassName: MyDataSource
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Component
public class MyDataSource {

    private String driverClassName;
    private String url;
    private String username;
    private String password;
    public String getDriverClassName() {
        return driverClassName;
    }
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}