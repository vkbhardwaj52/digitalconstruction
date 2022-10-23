package com.vivek.digitalconstruction.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.digitalconstruction.dao.UserProfileDAO;
import com.vivek.digitalconstruction.model.UserProfile;

@RestController
@RequestMapping("/userProfile")
public class UserProfileController {
	
	@Autowired
	UserProfileDAO userProfileDAO;	
	
	//To get all shop
	@GetMapping("/getAllUsers")
	public List<UserProfile> getAllShop()
	{
		return userProfileDAO.findAll();
	}	
	
	//Get categories by id
	@GetMapping("/getUserProfileByMobileNo/mobileNo/{mobileNo}")
	public ResponseEntity<UserProfile> getUserProfileByMobileNo(@PathVariable(value="mobileNo") String mobileNo){
		
		Long longMobileNo = Long.parseLong(mobileNo);
		UserProfile userProfile=userProfileDAO.findOne(longMobileNo);
		
		if(userProfile==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(userProfile);		
	}
	
	//Save an shop
	@PostMapping("/saveUserProfile")
	public UserProfile saveUserProfile(@Valid @RequestBody UserProfile emp)
	{
		return userProfileDAO.save(emp);
	}
	
	/*Update an categories by id*/
	@PutMapping("/updateUserProfileByMobileNo/mobileNo/{mobileNo}")
	public ResponseEntity<UserProfile> updateEmployee(@PathVariable(value="mobileNo") String mobileNo,@Valid @RequestBody UserProfile userProfile){
		
		Long longmobileNo = Long.parseLong(mobileNo);
		UserProfile up=userProfileDAO.findOne(longmobileNo);
		if(up==null) {
			return ResponseEntity.notFound().build();
		}		
		up.setUserName(userProfile.getUserName());
		up.setUserEmail(userProfile.getUserEmail());	
		UserProfile updateEmployee=userProfileDAO.save(up);
		return ResponseEntity.ok().body(updateEmployee);		
	}
}