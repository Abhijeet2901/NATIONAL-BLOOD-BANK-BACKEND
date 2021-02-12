package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.BloodStock;
import com.example.demo.repository.BloodStockRepository;



@Component("bloodStockService")
public class BloodStockService implements IBloodStock {
	@Autowired
	private BloodStockRepository bloodStockRepository;
	
	@Override
	public void create(BloodStock bloodStock)
	{
		bloodStockRepository.save(bloodStock);
	}
	
	@Override
	public List<BloodStock> read()
	{
		return bloodStockRepository.findAll();
	}
	
	@Override
	public BloodStock read(Integer id)
	{
		return bloodStockRepository.findById(id).get();
	}
	
	
	@Override
	public void update(BloodStock bloodStock)
	{
		bloodStockRepository.save(bloodStock);
	}
	
	@Override
	public void delete(BloodStock bloodStock)
	{
		bloodStockRepository.delete(bloodStock);
	}
	
	public List<BloodStock> findBloodStockByBloodGroup(String bloodGroup)
	{
	return bloodStockRepository.findBloodStockByBloodGroup(bloodGroup);
	}


}
