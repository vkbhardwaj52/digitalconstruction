package com.vivek.digitalconstruction.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.digitalconstruction.model.UserProfile;
import com.vivek.digitalconstruction.repository.UserProfileRepository;

@Service
public class UserProfileDAO {
	
	@Autowired
	UserProfileRepository userProfileRepository;
	
	
	//Save an categories	
	public UserProfile save(UserProfile shop)
	{
		return userProfileRepository.save(shop);
	}
	
	
	//Search all categories
	public List<UserProfile> findAll()
	{
		return userProfileRepository.findAll();
	}
	
	
	//Get an categories
	public UserProfile findOne(Long shopId)
	{
		return userProfileRepository.findOne(shopId);
	}
	
	
	//delete an categories
	public void delete(UserProfile shop)
	{
		userProfileRepository.delete(shop);
	}

}
