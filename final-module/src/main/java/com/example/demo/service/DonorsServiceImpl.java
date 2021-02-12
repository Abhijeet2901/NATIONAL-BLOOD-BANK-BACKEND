package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Donors;
import com.example.demo.repository.DonorsRepository;

@Component("donorService")
public class DonorsServiceImpl implements DonorsService {

	@Autowired
	private DonorsRepository donorRepository;
	
	@Override
	public Donors create(Donors donor)
	{
		return donorRepository.save(donor);
	}
	
	@Override
	public List<Donors> read()
	{
		return donorRepository.findAll();
	}
	
	@Override
	public Donors read(int id)
	{
		return donorRepository.findById(id).get();
	}
	
	@Override
	public void update(Donors donor)
	{
		donorRepository.save(donor);
	}
	
	@Override
	public void delete(Donors donor)
	{
		donorRepository.delete(donor);
	}
	
}
