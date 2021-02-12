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
@CrossOrigin(origins="http://localhost:4200")
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
	
	@GetMapping("/emailid/{emailid}")
	public List<Registration> findRegistrationByEmailid(@PathVariable("emailid") String emailid)
	{
		return registService.findRegistrationByEmailid(emailid);
	}
	
	@PostMapping("/")
	public void addRegistration(@RequestBody Registration registration)
	{
		registService.create(registration);
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

}
