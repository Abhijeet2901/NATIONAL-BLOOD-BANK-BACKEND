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

import com.example.demo.entity.UserRequest;
import com.example.demo.service.IRequestService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/request")
public class RequestController {

	@Autowired
	IRequestService requestService;

	//	@GetMapping("/")
	//	public String hello()
	//	{
	//		return "hello";
	//	}
	@GetMapping("/")
	public List<UserRequest> getAllRequests()
	{
		return requestService.readAll();
	}

	@GetMapping("/{id}")
	public UserRequest findRequestById(@PathVariable("id") Integer id)
	{
//		UserRequest request=null;
//		try {
//			request = requestService.readById(id);
//		}catch(Exception ex)
//		{
//			return null;
//		}
//		return request;
		return requestService.readById(id);
	}

	@PostMapping("/")
	public UserRequest addRequest(@RequestBody UserRequest request)
	{
		//	UserRequest request1=requestService.create(request);
		//	System.out.println("new2ly created request:"+request1);
		//		return request1;
		return requestService.create(request);
	}

	@PutMapping("/")
	public void updateRequest(@RequestBody UserRequest request)
	{
		requestService.update(request);
	}

	@DeleteMapping("/{id}")
	public void deleteRequest(@PathVariable("id") Integer id)
	{
		UserRequest request = requestService.readById(id);
		requestService.delete(request);

	}

}
