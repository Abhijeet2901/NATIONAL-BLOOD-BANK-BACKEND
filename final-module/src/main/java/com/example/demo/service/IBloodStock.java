package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.BloodStock;

public interface IBloodStock {

	void create(BloodStock bloodStock);

	List<BloodStock> read();

	BloodStock read(Integer id);
	

	void update(BloodStock bloodStock);

	void delete(BloodStock bloodStock);

}