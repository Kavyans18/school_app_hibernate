package com.ty.school.controller;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class TestUserDao {
	
public static void main(String[] args) {
	User user = new User();
	user.setName("Sandeep");
	user.setEmail("sandeep@123");
	user.setPassword("sandeep");
	user.setPhone(98098798l);
	user.setGender("Male");
	
	User u2 = new User();
	u2.setName("kalyan");
	u2.setEmail("Kalyan@134");
	u2.setPassword("134");
	u2.setPhone(8745692l);
	u2.setGender("male");
	
	UserDAO dao = new UserDAO();
	dao.saveUser(user);
	dao.saveUser(u2);
	
}
}
