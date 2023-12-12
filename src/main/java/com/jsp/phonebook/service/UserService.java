package com.jsp.phonebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.phonebook.entity.User;
import com.jsp.phonebook.repository.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public ModelAndView saveUserRequest() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("add-user.jsp");
		mav.addObject("user",new User());
		return mav;
	}
	
	public ModelAndView saveUser(User user) {
		userDao.saveUser(user);
		System.out.println(user.getEmail()+" "+user.getPassword()+" "+user.getUsername());
		return new ModelAndView("home.jsp");
	}

	public ModelAndView updateUserRequest(int id) {
		User user= userDao.getById(id);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("update-user.jsp");
		mav.addObject("user",user);
		return mav;
	}

	public ModelAndView updateUser() {
		return null;
	}
}
