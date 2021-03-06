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

import com.example.demo.entity.BloodStock;
import com.example.demo.service.BloodStockService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/bloodStock")
public class BloodStockController {
	@Autowired
	BloodStockService bloodStockService;
	@GetMapping("/")
	public List<BloodStock> getAllBloodStock()
	{
		return bloodStockService.read();
	}
	
	@GetMapping("/{id}")
	public BloodStock findVehicleById(@PathVariable("id") Integer id)
	{
		BloodStock bloodStock=null;
		try {
		bloodStock = bloodStockService.read(id);
		}catch(Exception ex)
		{
			return null;
		}
		return bloodStock;
	}
	

	
	@PostMapping("/")
	public void addVehicle(@RequestBody BloodStock bloodStock)
	{
		bloodStockService.create(bloodStock);
	}
	
	@PutMapping("/")
	public void updateVehicle(@RequestBody BloodStock bloodStock)
	{
		bloodStockService.update(bloodStock);
	}
	
	@DeleteMapping("/{id}")
	public void deleteVehicle(@PathVariable("id") Integer id)
	{
		BloodStock bloodStock=findVehicleById(id);
		bloodStockService.delete(bloodStock);
	}

	@GetMapping("/bloodGroup/{bloodGroup}")
	public List<BloodStock> findBloodGroupsByBloodGroup(@PathVariable("bloodGroup") String bloodGroup)
	{
		return bloodStockService.findBloodStockByBloodGroup(bloodGroup);
	}

}
