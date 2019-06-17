/**
 * @Title: HibernateDemo.java
 * @Package cn.osxm.ssmi.chp10
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月30日 上午7:02:23
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

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
		Configuration configuration = new Configuration()
				.configure(new File(classPath + "cn/osxm/ssmi/chp10/hibernate.cfg.xml"));
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		User user = session.get(User.class, "001");
		System.out.println(user.getName());
		session.close();
	}
}
