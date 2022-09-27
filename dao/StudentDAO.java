package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Student;

public class StudentDAO {
	public Student saveStudent(Student s) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
		return s;
	}
public Student findStudent(int id) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	
	EntityManager em = emf.createEntityManager();
	
	Student stu = em.find(Student.class,3);
	if (stu != null) {
	System.out.println("Roll number : " +stu.getRol());
	System.out.println("Name : " +stu.getName());
	System.out.println("Precentage is : " +stu.getPercentage());
	}
	else {
		System.out.println("Student deosn't exist");
	}
	return stu;
}
public boolean deleteStudent(int id) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	Student stu = em.find(Student.class, 1);
	if (stu != null) {
		et.begin();
		em.remove(stu);
		et.commit();
	}
	else {
		System.out.println("Rool number not found");
	}
	return false;
}
public Student updateStudent(Student student) {
	EntityManagerFactory emp = Persistence.createEntityManagerFactory("vikas");
	EntityManager em = emp.createEntityManager();
	EntityTransaction et = em.getTransaction();
	et.begin();
	em.merge(student);
	et.commit();
	return student;
}

}
