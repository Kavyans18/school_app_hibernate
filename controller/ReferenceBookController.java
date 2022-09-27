package com.ty.school.controller;

import com.ty.school.dao.ReferenceBookDAO;
import com.ty.school.dto.ReferenceBook;

public class ReferenceBookController {
	public static void main(String[] args) {
		 ReferenceBookDAO referenceBookDAO = new ReferenceBookDAO();
			ReferenceBook referenceBook = new ReferenceBook();

			referenceBook.setName("theory");
			referenceBook.setAuthor("kalyan");
			referenceBook.setSubject("chemistry");
			referenceBookDAO.saveReferenceBook(referenceBook); 
			System.out.println("inserted");
			
			//delete Book
			referenceBookDAO.deleteReferenceBook(3);  
			System.out.println("deleted");
			
			//Update
			referenceBookDAO.findReferenceBookById(4);
			System.out.println("book is searching");
			referenceBook.setName("java");
			referenceBook.setSubject("advance java");
			referenceBook.setAuthor("sun");
			referenceBookDAO.updateReferenceBook(referenceBook);
			System.out.println("updated suceessfully");
	}
	
	}
	
