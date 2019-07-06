/**
 * @Title: JPATests.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月19日 下午11:14:08
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

/**
  * @ClassName: JPATests
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class JPATests {
	//@Test
    public void createTable() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ssmi");
        factory.close();
    }
    
    //@Test
    public void add() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ssmi");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Dept dept = new Dept();
        dept.setName("Dept 1");
        em.persist(dept);
        em.getTransaction().commit();
        em.close();
        factory.close();
    }
    
    
    @Test
    public void query() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ssmi");
        EntityManager em = factory.createEntityManager();
        User user = em.find(User.class, 1);
        System.out.println(user.getName());
        em.close();
        factory.close(); 
    }
    
    
    //@Test
    public void update() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ssmi");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, 1);
        user.setName("test");
        em.getTransaction().commit();
        em.close();
        factory.close();
    }
}
