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
@Table(name = "room_info")
public class RoomInfo {

	@Id
	@Column(name = "room_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomId;

	@Column(name = "hotel_id")
	private int hotelId;

	@Column(name = "room_name")
	private String roomName;

	@Column(name = "room_description")
	private String roomDescription;

	@Column(name = "no_of_rooms")
	private int noOfRooms;

	@Column(name = "price_min")
	private double priceMin;

	@Column(name = "price_max")
	private double priceMax;

	@Column(name = "is_available")
	private int isAvailable;

	@Transient
	public String createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_update_date")
	public Calendar updatedOn;

	/**
	 * @return the roomId
	 */
	public int getRoomId() {
		return roomId;
	}

	/**
	 * @param roomId
	 *            the roomId to set
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	/**
	 * @return the hotelId
	 */
	public int getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId
	 *            the hotelId to set
	 */
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * @param roomName
	 *            the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	/**
	 * @return the roomDescription
	 */
	public String getRoomDescription() {
		return roomDescription;
	}

	/**
	 * @param roomDescription
	 *            the roomDescription to set
	 */
	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	/**
	 * @return the noOfRooms
	 */
	public int getNoOfRooms() {
		return noOfRooms;
	}

	/**
	 * @param noOfRooms
	 *            the noOfRooms to set
	 */
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	/**
	 * @return the priceMin
	 */
	public double getPriceMin() {
		return priceMin;
	}

	/**
	 * @param priceMin
	 *            the priceMin to set
	 */
	public void setPriceMin(double priceMin) {
		this.priceMin = priceMin;
	}

	/**
	 * @return the priceMax
	 */
	public double getPriceMax() {
		return priceMax;
	}

	/**
	 * @param priceMax
	 *            the priceMax to set
	 */
	public void setPriceMax(double priceMax) {
		this.priceMax = priceMax;
	}

	/**
	 * @return the isAvailable
	 */
	public int getIsAvailable() {
		return isAvailable;
	}

	/**
	 * @param isAvailable
	 *            the isAvailable to set
	 */
	public void setIsAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
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
		return "RoomInfo [roomId=" + roomId + ", hotelId=" + hotelId + ", roomName=" + roomName + ", roomDescription="
				+ roomDescription + ", noOfRooms=" + noOfRooms + ", priceMin=" + priceMin + ", priceMax=" + priceMax
				+ ", isAvailable=" + isAvailable + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
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
		result = prime * result + hotelId;
		result = prime * result + roomId;
		result = prime * result + ((roomName == null) ? 0 : roomName.hashCode());
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
		RoomInfo other = (RoomInfo) obj;
		if (hotelId != other.hotelId)
			return false;
		if (roomId != other.roomId)
			return false;
		if (roomName == null) {
			if (other.roomName != null)
				return false;
		} else if (!roomName.equals(other.roomName))
			return false;
		return true;
	}

}
