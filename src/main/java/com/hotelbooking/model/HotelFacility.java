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
@Table(name = "hotel_facility")
public class HotelFacility {

	@Id
	@Column(name = "hotel_facilty_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelFacilityId;

	@Column(name = "hotel_id")
	private int hotelId;

	@Column(name = "facility_id")
	private int facilityId;

	@Column(name = "is_active")
	private int isActive;

	@Transient
	public String createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_update_date")
	public Calendar updatedOn;

	/**
	 * @return the hotelFacilityId
	 */
	public int getHotelFacilityId() {
		return hotelFacilityId;
	}

	/**
	 * @param hotelFacilityId the hotelFacilityId to set
	 */
	public void setHotelFacilityId(int hotelFacilityId) {
		this.hotelFacilityId = hotelFacilityId;
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
	 * @return the facilityId
	 */
	public int getFacilityId() {
		return facilityId;
	}

	/**
	 * @param facilityId the facilityId to set
	 */
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
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
		return "HotelFacility [hotelFacilityId=" + hotelFacilityId + ", hotelId=" + hotelId + ", facilityId="
				+ facilityId + ", isActive=" + isActive + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + facilityId;
		result = prime * result + hotelFacilityId;
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
		HotelFacility other = (HotelFacility) obj;
		if (facilityId != other.facilityId)
			return false;
		if (hotelFacilityId != other.hotelFacilityId)
			return false;
		if (hotelId != other.hotelId)
			return false;
		return true;
	}

}
