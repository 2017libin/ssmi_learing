/**
 * @Title: TestPropertySourceAnnoTests.java
 * @Package cn.osxm.ssmi.chp06.testanno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月31日 上午5:55:14
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.com.anno.MyDataSource;


/**
  * @ClassName: TestPropertySourceAnnoTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp06/testAnno.xml" })
//@TestPropertySource("classpath:cn/osxm/ssmi/chp05/placeholder.properties")
@TestPropertySource(properties = { "jdbc.driver.className = com.mysql.jdbc.Driver","jdbc.url : jdbc:mysql://qa:3306/mydb" })
public class TestPropertySourceAnnoTests {

    @Autowired
    private MyDataSource myDataSource;
    
    @Test
    public void testPropertySource() {
        System.out.println(myDataSource.getJdbcClass());
        System.out.println(myDataSource.getJdbcUrl());
    }
    
}