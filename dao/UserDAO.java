package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.User;


public class UserDAO {
	
	public User saveUser(User user) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(user);
		et.commit();
		return user;
	}
	
	public User findUserById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager em = emf.createEntityManager();
		User user = em.find(User.class,1);
		if (user != null) {
		System.out.println("ID :"+user.getId());
		System.out.println("Name : " +user.getName());
		System.out.println("Email : "+user.getEmail());
		System.out.println("Password : "+user.getPassword());
		System.out.println("Phone : "+ user.getPhone());
		System.out.println("Gender : "+user.getGender());
		}
		else {
			System.out.println("ID doesn't exist");
		}
		return user;
		
	}
	public boolean deleteUser(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		User user = em.find(User.class,1);
		if (user != null) {
			et.begin();
			em.remove(user);
			et.commit();
		}
		else {
			System.out.println("The ID doesn't exist");
		}
		return false;
		
	}
	public User updateUser(User user) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(user);
		et.commit();
		return user;
	}
	
	
}

