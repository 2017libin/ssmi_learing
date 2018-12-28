package cn.osxm.ssmi.chp10.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDao {
	
	public List<UserEntity> findAll() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OSXM");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserEntity> result = entityManager.createQuery("select u " + "from user u ").getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		return result;
	}
}
