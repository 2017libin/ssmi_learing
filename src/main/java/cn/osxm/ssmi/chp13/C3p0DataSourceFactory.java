/**
 * @Title: C3p0DataSourceFactory.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月5日 下午6:05:06
 * @version V1.0
 */

package cn.osxm.ssmi.chp13;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
  * @ClassName: C3p0DataSourceFactory
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class C3p0DataSourceFactory extends UnpooledDataSourceFactory {
    public C3p0DataSourceFactory() {
        this.dataSource = new ComboPooledDataSource();
    }
}
