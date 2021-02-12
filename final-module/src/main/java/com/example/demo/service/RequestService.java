package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserRequest;
import com.example.demo.repository.RequestRepository;

@Component("requestService")
public class RequestService implements IRequestService {

	@Autowired
	RequestRepository requestRepository;

	@Override
	public UserRequest create(UserRequest request)
	{
		return requestRepository.save(request);
	}
	@Override
	public List<UserRequest> readAll()
	{
		return requestRepository.findAll();

	}
	@Override
	public UserRequest readById(int id)
	{
		return requestRepository.findById(id).get();
	}

	@Override
	public void update(UserRequest request)
	{
		requestRepository.save(request);
	}

	@Override
	public void delete(UserRequest request)
	{
		requestRepository.delete(request);

	}


}
