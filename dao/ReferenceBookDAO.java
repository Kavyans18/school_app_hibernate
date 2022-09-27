package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.ReferenceBook;

public class ReferenceBookDAO {
	
	public ReferenceBook saveReferenceBook(ReferenceBook referenceBook) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(referenceBook);
		entityTransaction.commit();
		
		return referenceBook;
	}
	
	public ReferenceBook updateReferenceBook(ReferenceBook referenceBook) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(referenceBook);
		entityTransaction.commit();
		return referenceBook;
	}
	
	public boolean deleteReferenceBook(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		ReferenceBook referenceBook= entityManager.find(ReferenceBook.class, 3);
		if(referenceBook!=null) {
		entityTransaction.begin();
		entityManager.remove(referenceBook);
		entityTransaction.commit();
		}else {
			System.out.println("not found id");
		}
		return false;
	}
	
	public ReferenceBook findReferenceBookById(int id) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		ReferenceBook referenceBook = entityManager.find(ReferenceBook.class, 4);
		if(referenceBook!=null) {
			System.out.println(referenceBook.getId());
			System.out.println(referenceBook.getName());
			System.out.println(referenceBook.getAuthor());
			System.out.println(referenceBook.getName());
		}else {
			System.out.println("not found searching id");
		}
		return null;
	}
}
