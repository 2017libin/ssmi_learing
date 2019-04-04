/**
 * @Title: SpringJUnitConfigAnnoTests.java
 * @Package cn.osxm.ssmi.chp06.testanno.junit5
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月2日 上午6:00:22
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.testanno.junit5;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import cn.osxm.ssmi.chp04.anno.MyAppConfig;
import cn.osxm.ssmi.chp05.javacfg.AppConfig;

import cn.osxm.ssmi.com.Foo;
/**
  * @ClassName: SpringJUnitConfigAnnoTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

//@SpringJUnitConfig(locations = "classpath:cn/osxm/ssmi/chp06/testAnno.xml")
//@SpringJUnitConfig(classes = AppConfig.class)
//@SpringJUnitConfig(AppConfig.class)
@SpringJUnitConfig(value=AppConfig.class)
public class SpringJUnitConfigAnnoTests {

  @Autowired
  private Foo foo;

  @Test
  public void testFoo() {
      System.out.println(foo);
      assertNotNull(foo);
  }
}
