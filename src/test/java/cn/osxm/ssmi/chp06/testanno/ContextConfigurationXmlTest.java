/**
 * @Title: ContextConfigurationXmlTest.java
 * @Package cn.osxm.ssmi.chp6.testanno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月30日 上午4:55:47
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.com.anno.Foo;

/**
  * @ClassName: ContextConfigurationXmlTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:cn/osxm/ssmi/chp6/applicationContext.xml" })
public class ContextConfigurationXmlTest {

    @Autowired
    private Foo foo;
    
    @Test
    public void testFoo() {
        System.out.println(foo);
        assertNotNull(foo);
    }
}
