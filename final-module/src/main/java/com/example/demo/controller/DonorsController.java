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

import com.example.demo.entity.Donors;
import com.example.demo.service.DonorsService;

@RestController
@CrossOrigin(value="*")
@RequestMapping("/donors")
public class DonorsController {

	@Autowired
	DonorsService donorService;
	
	@GetMapping("/")
	public List<Donors> getAllDonors()
	{
		return donorService.read();
	}
	
	@GetMapping("/{id}")
	public Donors getDonorById(@PathVariable("id") Integer id)
	{
		Donors donor=null;
		try {
			donor=donorService.read(id);
		}
		catch(Exception e)
		{
			return null;
		}
		return donor;
	}
	
	
	@PostMapping("/")
	public Donors addDonor(@RequestBody Donors donor)
	{
		System.out.println(donor);
		return donorService.create(donor);
	}
	
	
	
	@PutMapping("/")
	public void updateDonor(@RequestBody Donors donor)
	{
		donorService.update(donor);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteDonor(@PathVariable("id") Integer id)
	{
//		System.out.println("Deleting..."+id);
		Donors donor=getDonorById(id);
//		System.out.println(donor);
		donorService.delete(donor);
	}
	
	
	
}
