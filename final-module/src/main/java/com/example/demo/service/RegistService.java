package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Registration;
import com.example.demo.repository.RegistRepository;

@Component("registService")
public class RegistService implements IRegistService {
	
	@Autowired
	private RegistRepository  registRepository;

	@Override
	public Registration create(Registration registration)
	{
		//return 
		return registRepository.save(registration);
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
	
//	@Override
//	public List<Registration> findRegistrationByEmailid(String emailid,String password)
//	{
//		List<Registration> regiList=registRepository.findRegistrationByEmailid(emailid,password);
//		if(regiList.equals(null))
//		{
//			return null;
//		}
//		else
//		{
//			return regiList;
//		}
//	}
	
	@Override
	public Registration login(String emailid,String password)
	{
		return registRepository.login(emailid,password);
	}
	
	@Override
	public Registration forgotPs(String emailid)
	{
		return registRepository.forgotPw(emailid);
	}
	
//	@Override
//	@Transactional
//	public void updatePs(String password,String confirmpassword,String emailid)
//	{
//		 registRepository.updatePw(password, confirmpassword, emailid);
//	}
	
	@Override
	@Transactional
	public void updatePs(Integer id,String password,String confirmpassword)
	{
//		Registration reg = registRepository.findById(id).get();
//		reg.setPassword(password);
//		reg.setConfirmpassword(confirmpassword);
		registRepository.updatePw(password, confirmpassword, id);
	}
}