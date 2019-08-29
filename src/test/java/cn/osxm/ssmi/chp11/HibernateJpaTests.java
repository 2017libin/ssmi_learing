/**
 * @Title: HibernateJpaTests.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月3日 下午8:50:00
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;
/**
  * @ClassName: HibernateJpaTests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class HibernateJpaTests {

    @SuppressWarnings("unchecked")
	@Test
    public void jpaConfigProps() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ssmi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<User> result = entityManager.createQuery("select u " + "from User u ").getResultList();
        // List<User> result =
        // entityManager.createNamedQuery("User.findAll").getResultList();
        for (User user : result) {
            System.out.println(user.getName());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
