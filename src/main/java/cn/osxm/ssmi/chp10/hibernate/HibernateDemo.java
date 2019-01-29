/**
 * @Title: HibernateDemo.java
 * @Package cn.osxm.ssmi.chp10.hibernate
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月7日 下午10:36:40
 * @version V1.0
 */

package cn.osxm.ssmi.chp10.hibernate;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cn.osxm.ssmi.chp02.User;

/**
  * @ClassName: HibernateDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class HibernateDemo {
    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */

    public static void main(String[] args) {
        String classPath = HibernateDemo.class.getResource("/").getPath();
        Configuration configuration = new Configuration().configure(new File(classPath+"cn/osxm/ssmi/chp10/hibernate.cfg.xml"));
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        User user = session.get(User.class, "001");
        System.out.println(user.getName());
        session.close();
    }
}
