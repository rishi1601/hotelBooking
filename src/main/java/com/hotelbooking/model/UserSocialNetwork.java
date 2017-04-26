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
@Table(name = "user_social_network")
public class UserSocialNetwork {

	@Id
	@Column(name = "user_social_network_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userSocialNetworkId;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "social_network_name")
	private String socialNetworkName;

	@Column(name = "social_network_identity")
	private String socialNetworkIdentity;

	@Transient
	public String createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_update_date")
	public Calendar updatedOn;

	/**
	 * @return the userSocialNetworkId
	 */
	public int getUserSocialNetworkId() {
		return userSocialNetworkId;
	}

	/**
	 * @param userSocialNetworkId
	 *            the userSocialNetworkId to set
	 */
	public void setUserSocialNetworkId(int userSocialNetworkId) {
		this.userSocialNetworkId = userSocialNetworkId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the socialNetworkName
	 */
	public String getSocialNetworkName() {
		return socialNetworkName;
	}

	/**
	 * @param socialNetworkName
	 *            the socialNetworkName to set
	 */
	public void setSocialNetworkName(String socialNetworkName) {
		this.socialNetworkName = socialNetworkName;
	}

	/**
	 * @return the socialNetworkIdentity
	 */
	public String getSocialNetworkIdentity() {
		return socialNetworkIdentity;
	}

	/**
	 * @param socialNetworkIdentity
	 *            the socialNetworkIdentity to set
	 */
	public void setSocialNetworkIdentity(String socialNetworkIdentity) {
		this.socialNetworkIdentity = socialNetworkIdentity;
	}

	/**
	 * @return the createdOn
	 */
	public String getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn
	 *            the createdOn to set
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
	 * @param updatedOn
	 *            the updatedOn to set
	 */
	public void setUpdatedOn(Calendar updatedOn) {
		this.updatedOn = updatedOn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserSocialNetwork [userSocialNetworkId=" + userSocialNetworkId + ", userId=" + userId
				+ ", socialNetworkName=" + socialNetworkName + ", socialNetworkIdentity=" + socialNetworkIdentity
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((socialNetworkName == null) ? 0 : socialNetworkName.hashCode());
		result = prime * result + userId;
		result = prime * result + userSocialNetworkId;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		UserSocialNetwork other = (UserSocialNetwork) obj;
		if (socialNetworkName == null) {
			if (other.socialNetworkName != null)
				return false;
		} else if (!socialNetworkName.equals(other.socialNetworkName))
			return false;
		if (userId != other.userId)
			return false;
		if (userSocialNetworkId != other.userSocialNetworkId)
			return false;
		return true;
	}

}
