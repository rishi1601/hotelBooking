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
@Table(name = "admin_social_networks")
public class AdminSocialNetwork {

	@Id
	@Column(name = "admin_social_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminSocialId;

	@Column(name = "admin_id")
	private int adminId;

	@Column(name = "hotel_id")
	private int hotel_id;

	@Column(name = "social_network_name")
	private String adminNetworkName;

	@Column(name = "social_network_url")
	private String socialNetworkUrl;

	@Column(name = "is_active")
	private int isActive;

	@Transient
	public String createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_update_date")
	public Calendar updatedOn;

	/**
	 * @return the adminSocialId
	 */
	public int getAdminSocialId() {
		return adminSocialId;
	}

	/**
	 * @param adminSocialId
	 *            the adminSocialId to set
	 */
	public void setAdminSocialId(int adminSocialId) {
		this.adminSocialId = adminSocialId;
	}

	/**
	 * @return the adminId
	 */
	public int getAdminId() {
		return adminId;
	}

	/**
	 * @param adminId
	 *            the adminId to set
	 */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	/**
	 * @return the hotel_id
	 */
	public int getHotel_id() {
		return hotel_id;
	}

	/**
	 * @param hotel_id
	 *            the hotel_id to set
	 */
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	/**
	 * @return the adminNetworkName
	 */
	public String getAdminNetworkName() {
		return adminNetworkName;
	}

	/**
	 * @param adminNetworkName
	 *            the adminNetworkName to set
	 */
	public void setAdminNetworkName(String adminNetworkName) {
		this.adminNetworkName = adminNetworkName;
	}

	/**
	 * @return the socialNetworkUrl
	 */
	public String getSocialNetworkUrl() {
		return socialNetworkUrl;
	}

	/**
	 * @param socialNetworkUrl
	 *            the socialNetworkUrl to set
	 */
	public void setSocialNetworkUrl(String socialNetworkUrl) {
		this.socialNetworkUrl = socialNetworkUrl;
	}

	/**
	 * @return the isActive
	 */
	public int getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setIsActive(int isActive) {
		this.isActive = isActive;
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
		return "AdminSocialNetwork [adminSocialId=" + adminSocialId + ", adminId=" + adminId + ", hotel_id=" + hotel_id
				+ ", adminNetworkName=" + adminNetworkName + ", socialNetworkUrl=" + socialNetworkUrl + ", isActive="
				+ isActive + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
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
		result = prime * result + adminId;
		result = prime * result + adminSocialId;
		result = prime * result + hotel_id;
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
		AdminSocialNetwork other = (AdminSocialNetwork) obj;
		if (adminId != other.adminId)
			return false;
		if (adminSocialId != other.adminSocialId)
			return false;
		if (hotel_id != other.hotel_id)
			return false;
		return true;
	}

}
