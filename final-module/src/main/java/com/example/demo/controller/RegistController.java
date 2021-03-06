package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Registration;
import com.example.demo.service.RegistService;

@RestController
@CrossOrigin(value="*")
@RequestMapping("/registration")
public class RegistController {

	@Autowired
	RegistService registService;
	
	@GetMapping("/")
	public List<Registration> getAllRegistration()
	{
		return registService.read();
	}
	
	@GetMapping("/{id}")
	public Registration findRegistrationById(@PathVariable("id")Integer id)
	{
		Registration registration=null;
		try
		{
			registration=registService.read(id);
			
		}catch(Exception ex)
		{
			return null;
		}
		return registration;
	}
	
//	@GetMapping("/emailid/{emailid}/{password}")
//	public List<Registration> findRegistrationByEmailid(@PathVariable("emailid") String emailid,@PathVariable("password") String password)
//	{
//		return registService.findRegistrationByEmailid(emailid,password);
//	}
	
	@GetMapping("/login/{emailid}/{password}")
	public int userLogin(@PathVariable("emailid") String emailid,@PathVariable("password") String password)
	{
		Registration User = registService.login(emailid,password);
		if(User==null)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	@GetMapping("/reset/{emailid}")
	public int forgotPw(@PathVariable("emailid") String emailid)
	{
		Registration User = registService.forgotPs(emailid);
		if(User==null)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	@PostMapping("/")
	public Registration addRegistration(@RequestBody Registration registration)
	{
		Registration result = registService.create(registration);
		System.out.println(result);
		return result;
	}
	
	@PutMapping("/")
	public void updateRegistration(@RequestBody Registration registration)
	{
		registService.update(registration);
	}
	
	@DeleteMapping("/{id}")
	public void deleteRegistration(@PathVariable("id") Integer id)
	{
		Registration registration=findRegistrationById(id);
		registService.delete(registration);
	}
	
	@PutMapping("/update/{id}/{password}/{confirmpassword}")
	public void updatePw(@PathVariable("id") Integer id,@PathVariable("password") String password,@PathVariable("confirmpassword") String confirmpassword)
	{
		System.out.printf("Updating %d, %s, %s",id, password, confirmpassword);
		registService.updatePs(id, password, confirmpassword);
		
	}
	
	

}
