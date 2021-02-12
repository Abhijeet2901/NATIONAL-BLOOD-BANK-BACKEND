package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserRequest;

@Repository
public interface RequestRepository extends JpaRepository<UserRequest, Integer> {
	
//	 @Query("SELECT v FROM Vehicle v WHERE v.type=:type")
//	    List<Vehicle> findVehicleByType(@Param("type") String type);

}
