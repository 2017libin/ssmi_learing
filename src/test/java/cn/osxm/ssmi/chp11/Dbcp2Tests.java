/**
 * @Title: Dbcp2Tests.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月27日 上午6:04:38
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;
import java.sql.Connection;

import org.apache.commons.dbcp2.BasicDataSource;
/**
  * @ClassName: Dbcp2Tests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class Dbcp2Tests {
    public void test() throws Exception{
        String dirver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ssmi?serverTimezone=UTC";
        String username = "root";
        String password = "123456";

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(dirver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxTotal(30); // 连接最大数量
        dataSource.setInitialSize(10); // 初始连接数量
        dataSource.setMinIdle(8);// 最小空闲连接
        dataSource.setMaxIdle(16); // 最大空闲连接       
        dataSource.setMaxWaitMillis(6 * 10000);// 超时等待时间毫秒        
        Connection conn = dataSource.getConnection();
        
        
        // 只会发现当前连接失效，再创建一个连接供当前查询使用
        /*dataSource.setTestOnBorrow(true);
        dataSource.setRemoveAbandonedTimeout(180);  //超过时间限制，回收没有用(废弃)的连接（默认为 300秒，调整为180）
        // removeAbandoned ：超过removeAbandonedTimeout时间后，是否进
        // 行没用连接（废弃）的回收（默认为false，调整为true)
        // DATA_SOURCE.setRemoveAbandonedOnMaintenance(removeAbandonedOnMaintenance);
        dataSource.setRemoveAbandonedOnBorrow(true);
        // testWhileIdle
        dataSource.setTestWhileIdle(true);
        // testOnReturn
        dataSource.setTestOnReturn(true);
        // setRemoveAbandonedOnMaintenance
        dataSource.setRemoveAbandonedOnMaintenance(true);
        // 记录日志
        dataSource.setLogAbandoned(true);
        // 设置自动提交
        dataSource.setDefaultAutoCommit(true);*/

    }
}
