package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BloodStock;
import com.example.demo.entity.Registration;

@Repository
public interface RegistRepository extends JpaRepository<Registration,Integer> {

//    @Query("SELECT r.email,r.password FROM Registration  r WHERE r.emailid=:emailid AND r.password=:password")
//    List<Registration> findRegistrationByEmailid(@Param("emailid") String emailid,@Param("password") String password);
	
	@Query("SELECT r FROM Registration r WHERE r.emailid=:emailid AND r.password=:password")
	public Registration login(@Param("emailid") String emailid,@Param("password") String password);
	
	@Query("SELECT r FROM Registration r WHERE r.emailid=:emailid")
	public Registration forgotPw(@Param("emailid") String emailid);
	
	@Modifying
	@Query("update Registration r set r.password=:password,r.confirmpassword=:confirmpassword where r.id=:id")
	public void updatePw(@Param("password") String password,@Param("confirmpassword") String confirmpassword,@Param("id") Integer id);
	

//    @Query("SELECT v FROM BloodStock v WHERE v.bloodGroup=:bloodGroup")
//    List<BloodStock> findBloodStockByBloodGroup(@Param("bloodGroup") String bloodGroup);

}


//@Query("UPDATE Company c SET c.address = :address WHERE c.id = :companyId")
//int updateAddress(@Param("companyId") int companyId, @Param("address") String address);
//}


//@Modifying
//@Query("update User u set u.firstname = ?1, u.lastname = ?2 where u.id = ?3")
//void setUserInfoById(String firstname, String lastname, Integer userId);