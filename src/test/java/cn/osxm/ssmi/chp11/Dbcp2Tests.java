/**
 * @Title: Dbcp2Tests.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��6��27�� ����6:04:38
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
        dataSource.setMaxTotal(30); // �����������
        dataSource.setInitialSize(10); // ��ʼ��������
        dataSource.setMinIdle(8);// ��С��������
        dataSource.setMaxIdle(16); // ����������       
        dataSource.setMaxWaitMillis(6 * 10000);// ��ʱ�ȴ�ʱ�����        
        Connection conn = dataSource.getConnection();
        
        
        // ֻ�ᷢ�ֵ�ǰ����ʧЧ���ٴ���һ�����ӹ���ǰ��ѯʹ��
        /*dataSource.setTestOnBorrow(true);
        dataSource.setRemoveAbandonedTimeout(180);  //����ʱ�����ƣ�����û����(����)�����ӣ�Ĭ��Ϊ 300�룬����Ϊ180��
        // removeAbandoned ������removeAbandonedTimeoutʱ����Ƿ��
        // ��û�����ӣ��������Ļ��գ�Ĭ��Ϊfalse������Ϊtrue)
        // DATA_SOURCE.setRemoveAbandonedOnMaintenance(removeAbandonedOnMaintenance);
        dataSource.setRemoveAbandonedOnBorrow(true);
        // testWhileIdle
        dataSource.setTestWhileIdle(true);
        // testOnReturn
        dataSource.setTestOnReturn(true);
        // setRemoveAbandonedOnMaintenance
        dataSource.setRemoveAbandonedOnMaintenance(true);
        // ��¼��־
        dataSource.setLogAbandoned(true);
        // �����Զ��ύ
        dataSource.setDefaultAutoCommit(true);*/

    }
}
