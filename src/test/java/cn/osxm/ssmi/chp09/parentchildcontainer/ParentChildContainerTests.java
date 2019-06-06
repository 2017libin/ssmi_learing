/**
 * @Title: ParentChildContainerTests.java
 * @Package cn.osxm.ssmi.chp08.parentchildcontainer
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年5月18日 下午5:33:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp09.parentchildcontainer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.chp09.parentchild.child.ChildUserDao;
import cn.osxm.ssmi.chp09.parentchild.parent.ParentUsrDao;
import cn.osxm.ssmi.chp09.parentchild.parent.UserService;
/**
  * @ClassName: ParentChildContainerTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class ParentChildContainerTests {

    //@Test
    public void twoContainer() {
        ApplicationContext  applicationContext1= new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp08/parent.xml");    
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext(new String[] {"cn/osxm/ssmi/chp08/child.xml"});  
        org.junit.Assert.assertNotNull(applicationContext1.getBean(UserService.class));
        org.junit.Assert.assertNotNull(applicationContext1.getBean(ParentUsrDao.class));
        org.junit.Assert.assertNotNull(applicationContext2.getBean(ChildUserDao.class));
    }
    
    @Test
    public void importAllInOne() {
        ApplicationContext  applicationContext= new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp08/import.xml");    
        org.junit.Assert.assertNotNull(applicationContext.getBean(UserService.class));

    }
    
   //@Test
    public void parentChild() {
        ApplicationContext  parentContext= new ClassPathXmlApplicationContext("cn/osxm/ssmi/chp08/parent.xml");     
        ApplicationContext childContext = new ClassPathXmlApplicationContext(new String[] {"cn/osxm/ssmi/chp08/child.xml"},parentContext);  
        UserService userService = childContext.getBean(UserService.class); //子容器获取父容器对象
        userService.setUserDao(childContext.getBean(ChildUserDao.class));
        String userName = userService.get();
        org.junit.Assert.assertSame("Child User Name", userName);
    }
}
