package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.BloodStock;

public interface BloodStockRepository extends JpaRepository<BloodStock,Integer> {

	@Query("SELECT v FROM BloodStock v WHERE v.bloodGroup=:bloodGroup")
 List<BloodStock> findBloodStockByBloodGroup(@Param("bloodGroup") String bloodGroup);
}
