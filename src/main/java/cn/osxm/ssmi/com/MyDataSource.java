/**
 * @Title: MyDataSource.java
 * @Package cn.osxm.ssmi.com
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月31日 上午5:50:49
 * @version V1.0
 */

package cn.osxm.ssmi.com;

import org.springframework.beans.factory.annotation.Value;

/**
  * @ClassName: MyDataSource
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class MyDataSource {
	@Value("${jdbc.driver.className}")
    private String jdbcClass;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    public String getJdbcClass() {
        return jdbcClass;
    }

    public void setJdbcClass(String jdbcClass) {
        this.jdbcClass = jdbcClass;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
