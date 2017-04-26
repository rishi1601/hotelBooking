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
@Table(name="admin_hotels")
public class AdminHotel {

	
	@Id
	@Column(name="admin_hotel_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adminHotelId;
	
	@Column(name="admin_id")
	private int adminId;
	
	@Column(name="hotel_id")
	private int hotelId;
	
	@Column(name="is_active")
	private int isActive;
	
	@Transient
	public String createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_update_date")
	public Calendar updatedOn;

	/**
	 * @return the adminHotelId
	 */
	public int getAdminHotelId() {
		return adminHotelId;
	}

	/**
	 * @param adminHotelId the adminHotelId to set
	 */
	public void setAdminHotelId(int adminHotelId) {
		this.adminHotelId = adminHotelId;
	}

	/**
	 * @return the adminId
	 */
	public int getAdminId() {
		return adminId;
	}

	/**
	 * @param adminId the adminId to set
	 */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	/**
	 * @return the hotelId
	 */
	public int getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId the hotelId to set
	 */
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the isActive
	 */
	public int getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
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
		return "AdminHotel [adminHotelId=" + adminHotelId + ", adminId=" + adminId + ", hotelId=" + hotelId
				+ ", isActive=" + isActive + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adminHotelId;
		result = prime * result + adminId;
		result = prime * result + hotelId;
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
		AdminHotel other = (AdminHotel) obj;
		if (adminHotelId != other.adminHotelId)
			return false;
		if (adminId != other.adminId)
			return false;
		if (hotelId != other.hotelId)
			return false;
		return true;
	}
	
	
	
	
}
