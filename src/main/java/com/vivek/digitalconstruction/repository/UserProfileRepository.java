package com.vivek.digitalconstruction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.digitalconstruction.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long>{

}
