package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Registration;

public interface IRegistService {

	Registration create(Registration registration);

	List<Registration> read();

	Registration read(Integer id);

	void update(Registration registration);

	void delete(Registration registration);

//	List<Registration> findRegistrationByEmailid(String emailid,String password);

	Registration login(String email,String password);

	Registration forgotPs(String emailid);

//	void updatePs(String password, String confirmpassword,String emailid);
	
	 void updatePs(Integer id,String password,String confirmpassword);

}