/**
 * @Title: JpaDemo.java
 * @Package cn.osxm.ssmi.chp10.jpa
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月29日 上午6:37:25
 * @version V1.0
 */

package cn.osxm.ssmi.chp10.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cn.osxm.ssmi.chp2.User;

/**
  * @ClassName: JpaDemo
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class JpaDemo {

	/**
	  * @Title: main
	  * @Description: TODO
	  * @param args
	  */

	public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ssmi");
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        entityManager.getTransaction().begin();

	        List<User> result = entityManager.createQuery("select u " + "from User u ").getResultList();
	        //List<User> result = entityManager.createNamedQuery("User.findAll").getResultList();
	        for (User user : result) {
	            System.out.println(user.getName());
	        }
	        
	        //注解方式
	      /* List<UserAnnoEntity> result2 = entityManager.createQuery("select u " + "from user u ").getResultList();
	        for (UserAnnoEntity user : result2) {
	            System.out.println(user.getName());
	        }*/
	        
	        
	        entityManager.getTransaction().commit();
	        entityManager.close();

	    }
	

}
