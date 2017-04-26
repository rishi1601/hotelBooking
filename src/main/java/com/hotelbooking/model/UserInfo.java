package com.hotelbooking.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "user_info")
public class UserInfo {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "user_unique_id")
	private String userUniqueId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_email",unique=true)
	private String userEmail;

	@Column(name = "user_address_1")
	private String userAddress1;

	@Column(name = "user_address_2")
	private String userAddress2;

	@Column(name = "user_contact_no_1")
	private String userContactNo1;

	@Column(name = "user_contact_no_2")
	private String userContactNo2;

	@Column(name = "user_city")
	private String userCity;

	@Column(name = "user_state")
	private String userState;

	@Column(name = "user_country")
	private String userCountry;

	@Column(name = "user_secondary_email")
	private String userSEcondaryEmail;

	@Column(name = "is_verified")
	private String isVerified;

	@Column(name = "is_active")
	private String isActive;

	@Column(name = "is_blocked")
	private String isBlocked;

	@Transient
	public String createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_update_date")
	public Calendar updatedOn;

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userUniqueId
	 */
	public String getUserUniqueId() {
		return userUniqueId;
	}

	/**
	 * @param userUniqueId the userUniqueId to set
	 */
	public void setUserUniqueId(String userUniqueId) {
		this.userUniqueId = userUniqueId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userAddress1
	 */
	public String getUserAddress1() {
		return userAddress1;
	}

	/**
	 * @param userAddress1 the userAddress1 to set
	 */
	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}

	/**
	 * @return the userAddress2
	 */
	public String getUserAddress2() {
		return userAddress2;
	}

	/**
	 * @param userAddress2 the userAddress2 to set
	 */
	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}

	/**
	 * @return the userContactNo1
	 */
	public String getUserContactNo1() {
		return userContactNo1;
	}

	/**
	 * @param userContactNo1 the userContactNo1 to set
	 */
	public void setUserContactNo1(String userContactNo1) {
		this.userContactNo1 = userContactNo1;
	}

	/**
	 * @return the userContactNo2
	 */
	public String getUserContactNo2() {
		return userContactNo2;
	}

	/**
	 * @param userContactNo2 the userContactNo2 to set
	 */
	public void setUserContactNo2(String userContactNo2) {
		this.userContactNo2 = userContactNo2;
	}

	/**
	 * @return the userCity
	 */
	public String getUserCity() {
		return userCity;
	}

	/**
	 * @param userCity the userCity to set
	 */
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	/**
	 * @return the userState
	 */
	public String getUserState() {
		return userState;
	}

	/**
	 * @param userState the userState to set
	 */
	public void setUserState(String userState) {
		this.userState = userState;
	}

	/**
	 * @return the userCountry
	 */
	public String getUserCountry() {
		return userCountry;
	}

	/**
	 * @param userCountry the userCountry to set
	 */
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	/**
	 * @return the userSEcondaryEmail
	 */
	public String getUserSEcondaryEmail() {
		return userSEcondaryEmail;
	}

	/**
	 * @param userSEcondaryEmail the userSEcondaryEmail to set
	 */
	public void setUserSEcondaryEmail(String userSEcondaryEmail) {
		this.userSEcondaryEmail = userSEcondaryEmail;
	}

	/**
	 * @return the isVerified
	 */
	public String getIsVerified() {
		return isVerified;
	}

	/**
	 * @param isVerified the isVerified to set
	 */
	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}

	/**
	 * @return the isActive
	 */
	public String getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the isBlocked
	 */
	public String getIsBlocked() {
		return isBlocked;
	}

	/**
	 * @param isBlocked the isBlocked to set
	 */
	public void setIsBlocked(String isBlocked) {
		this.isBlocked = isBlocked;
	}

	/**
	 * @return the createdOn
	 */
	public String getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the updatedOn
	 */
	public Calendar getUpdatedOn() {
		return updatedOn;
	}

	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Calendar updatedOn) {
		this.updatedOn = updatedOn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userUniqueId=" + userUniqueId + ", userName=" + userName
				+ ", userEmail=" + userEmail + ", userAddress1=" + userAddress1 + ", userAddress2=" + userAddress2
				+ ", userContactNo1=" + userContactNo1 + ", userContactNo2=" + userContactNo2 + ", userCity=" + userCity
				+ ", userState=" + userState + ", userCountry=" + userCountry + ", userSEcondaryEmail="
				+ userSEcondaryEmail + ", isVerified=" + isVerified + ", isActive=" + isActive + ", isBlocked="
				+ isBlocked + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userUniqueId == null) ? 0 : userUniqueId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId != other.userId)
			return false;
		if (userUniqueId == null) {
			if (other.userUniqueId != null)
				return false;
		} else if (!userUniqueId.equals(other.userUniqueId))
			return false;
		return true;
	}
	
	
	

}
