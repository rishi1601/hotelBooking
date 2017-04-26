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
@Table(name="hotel_tag")
public class HotelTags {
	
	
	@Id
	@Column(name="hotel_tag_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hotelTagId;
	
	@Column(name="hotel_id")
	private int hotelId;
	
	@Column(name="tag_id")
	private int tagId;
	
	@Transient
	public String createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_update_date")
	public Calendar updatedOn;

	/**
	 * @return the hotelTagId
	 */
	public int getHotelTagId() {
		return hotelTagId;
	}

	/**
	 * @param hotelTagId the hotelTagId to set
	 */
	public void setHotelTagId(int hotelTagId) {
		this.hotelTagId = hotelTagId;
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
	 * @return the tagId
	 */
	public int getTagId() {
		return tagId;
	}

	/**
	 * @param tagId the tagId to set
	 */
	public void setTagId(int tagId) {
		this.tagId = tagId;
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
		return "HotelTags [hotelTagId=" + hotelTagId + ", hotelId=" + hotelId + ", tagId=" + tagId + ", createdOn="
				+ createdOn + ", updatedOn=" + updatedOn + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hotelId;
		result = prime * result + hotelTagId;
		result = prime * result + tagId;
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
		HotelTags other = (HotelTags) obj;
		if (hotelId != other.hotelId)
			return false;
		if (hotelTagId != other.hotelTagId)
			return false;
		if (tagId != other.tagId)
			return false;
		return true;
	}

	
	
	
	
	

}
