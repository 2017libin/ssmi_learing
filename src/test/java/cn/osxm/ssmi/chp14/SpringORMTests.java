/**
 * @Title: SpringORMTests.java
 * @Package cn.osxm.ssmi.chp14
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月6日 下午10:51:10
 * @version V1.0
 */

package cn.osxm.ssmi.chp14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.osxm.ssmi.com.User;

/**
  * @ClassName: SpringORMTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:cn/osxm/ssmi/chp14/spring-dbaccess.xml")
public class SpringORMTests {
	@Autowired
    private SessionFactory hibernateSessionFactory;
    
    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    //@Test
    public void hibernate() {
        Session session = hibernateSessionFactory.openSession();
        User user = session.get(User.class, 1);
        System.out.println(user.getName());
    }
    @Test
    public void hibernateTemplate() {
        User user = hibernateTemplate.get(User.class, 1);
        System.out.println(user.getName());
    }
}
