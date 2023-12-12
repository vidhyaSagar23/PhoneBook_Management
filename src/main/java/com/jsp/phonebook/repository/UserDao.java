package com.jsp.phonebook.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.phonebook.entity.User;

@Repository
public class UserDao {
	@Autowired
	private EntityManagerFactory managerFactory;
	
	public void saveUser(User user) {
		EntityManager entityManager=managerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
		entityManager.close();
	}
	public User getById(int id) {
		EntityManager entityManager=managerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		User user=entityManager.find(User.class, id);
		entityTransaction.commit();
		entityManager.close();
		
		return user;
	}
}
