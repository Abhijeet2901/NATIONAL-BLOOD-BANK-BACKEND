package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Registration;

@Repository
public interface RegistRepository extends JpaRepository<Registration,Integer> {

    @Query("SELECT r FROM Registration r WHERE r.emailid=:emailid")
    List<Registration> findRegistrationByEmailid(@Param("emailid") String emailid);


}
