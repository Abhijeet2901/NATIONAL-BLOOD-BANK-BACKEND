package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserRequest;

public interface IRequestService {

	UserRequest create(UserRequest request);

	List<UserRequest> readAll();

	UserRequest readById(int id);

	void update(UserRequest request);

	void delete(UserRequest request);

}