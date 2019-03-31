/**
 * @Title: ContextHierarchyTest.java
 * @Package cn.osxm.ssmi.chp6
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月13日 下午8:33:09
 * @version V1.0
 */

package cn.osxm.ssmi.chp06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringRunner;

/**
  * @ClassName: ContextHierarchyTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */
@RunWith(SpringRunner.class)
@ContextHierarchy({	
	@ContextConfiguration(name = "parent",locations ="classpath:cn/osxm/ssmi/chp06/parent-config.xml"),
	@ContextConfiguration(name = "child",locations ="classpath:cn/osxm/ssmi/chp06/child-config.xml"), 
	
    //@ContextConfiguration("classpath:cn/osxm/ssmi/chp06/parent-config.xml"),
    //@ContextConfiguration("classpath:cn/osxm/ssmi/chp06/child-config.xml")
})
public class ContextHierarchyTest {

	@Autowired
	//@Qualifier("parent") //no use
	private ApplicationContext parent;
	
	@Autowired
	//@Qualifier("child") //no use
	private ApplicationContext child;
	
	@Test
	public void test() {
		System.out.println("parent="+parent.toString());
		System.out.println("child="+child.toString());
		//System.out.println(applicationContext.getBean("parentUser"));
		System.out.println(child);
		System.out.println(child.getParent());
		System.out.println(parent.getParent());
		System.out.println(parent.getBean("childUser"));
		
	}
	
}
