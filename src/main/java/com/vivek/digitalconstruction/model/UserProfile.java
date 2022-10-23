package com.vivek.digitalconstruction.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="User_Profile")
@EntityListeners(AuditingEntityListener.class)

public class UserProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userMobileNo;
	
	private String UserName;
	
	private String UserEmail;
	
	private String UserType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	public Date createdTstamp;

	public long getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public String getUserType() {
		return UserType;
	}

	public void setUserType(String userType) {
		UserType = userType;
	}

	public Date getCreatedTstamp() {
		return createdTstamp;
	}

	public void setCreatedTstamp(Date createdTstamp) {
		this.createdTstamp = createdTstamp;
	}
	
}
