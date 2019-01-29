/**
 * @Title: ContextHierarchyTest.java
 * @Package cn.osxm.ssmi.chp6
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月13日 下午8:33:09
 * @version V1.0
 */

package cn.osxm.ssmi.chp06;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;

/**
  * @ClassName: ContextHierarchyTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@ContextHierarchy({
    @ContextConfiguration("/parent-config.xml"),
    @ContextConfiguration("/child-config.xml")
})
public class ContextHierarchyTest {

}
