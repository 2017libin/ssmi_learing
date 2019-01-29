/**
 * @Title: AnnoDemo.java
 * @Package cn.osxm.ssmi.chp4.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月15日 上午5:44:24
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.anno;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: AnnoDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class AnnoDemo {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoApplicationContext.xml",
				AnnoDemo.class);
		// 1.根据@Component注解实例化
		// Foo foo = (Foo) context.getBean(Foo.class);
		// System.out.println(foo);
		
		//2.Primary
		PrimaryAnno primaryAnno = (PrimaryAnno) context.getBean(PrimaryAnno.class);
		List<User> userList = primaryAnno.getUserList();
		for(User user:userList) {
			System.out.println(user.getName());
		}

		System.out.println(primaryAnno.getUser().getName());
		
		//3.Qualifier
		QualifierAnno qualifierAnno = (QualifierAnno) context.getBean(QualifierAnno.class);
		System.out.println("Qualifier测试："+qualifierAnno.getUser().getName());
		

		context.close();
	}

}
