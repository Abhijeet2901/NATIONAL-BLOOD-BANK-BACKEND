package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value="*")
//@ResponseStatus(HttpStatus.OK)
@RequestMapping("/login")
public class LoginController {

	@GetMapping("/{email}/{password}")
	public int login(@PathVariable("email") String email,@PathVariable("password") String password,HttpSession session)
	{
		if(email.equals("admin@admin.com")&&password.equals("admin"))
		{
			session.setAttribute("user", "admin");
			return 1;
		}
		else
		{
			return 0;
		}
	
	}
	
	@PostMapping("/logout")
	public void logout(HttpSession session)
	{
		session.invalidate();
	}
	
}
