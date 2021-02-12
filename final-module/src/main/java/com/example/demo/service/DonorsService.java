package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Donors;

public interface DonorsService {

	Donors create(Donors donor);

	List<Donors> read();

	Donors read(int id);

	void update(Donors donor);

	void delete(Donors donor);

}