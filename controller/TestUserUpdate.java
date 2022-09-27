package com.ty.school.controller;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class TestUserUpdate {
public static void main(String[] args) {
	User user = new User();
	user.setName("Gopa Sandeep");
	user.setEmail("sandeep@123");
	user.setPassword("Gopa123");
	user.setPhone(98098798l);
	user.setGender("Male");
	UserDAO dao = new UserDAO();
	dao.updateUser(user);
}
}
