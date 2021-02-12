package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Registration;
import com.example.demo.repository.RegistRepository;

@Component("registService")
public class RegistService implements IRegistService {
	
	@Autowired
	private RegistRepository  registRepository;

	@Override
	public void create(Registration registration)
	{
		//return 
		registRepository.save(registration);
	}
	@Override
	public List<Registration> read()
	{
		return registRepository.findAll();
	}
	@Override
	public Registration read(Integer id)
	{
		return registRepository.findById(id).get();
	}
	@Override
	public void update(Registration registration)
	{
		registRepository.save(registration);
	}
	@Override
	public void delete(Registration registration)
	{
		registRepository.delete(registration);
	}
	@Override
	public List<Registration> findRegistrationByEmailid(String emailid)
	{
		return registRepository.findRegistrationByEmailid(emailid);
	}
}