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
@Table(name = "user_booking")
public class UserBooking {

	@Id
	@Column(name = "booking_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;

	@Column(name = "booking_unique_id")
	private String bookingUniqueId;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "hotel_id")
	private int hotelId;

	@Column(name = "room_id")
	private int roomId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "booking_date")
	private Calendar bookingDate;

	@Column(name = "booking_custom_message")
	private String bookingCustomMessage;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "checkout_date")
	private String checkoutDate;

	@Column(name = "checkout_custom_message")
	private String checkoutCustomMessage;

	@Column(name = "booking_room_rate")
	private String bookingRoomRate;

	@Column(name = "booking_room_quantity")
	private String bookingRoomQuantity;

	@Column(name = "booking_room_discount")
	private String bookingRoomDiscount;

	@Column(name = "booking_final_price")
	private String bookingFinalPrice;

	@Column(name = "booking_is_paid")
	private String bookingIsPaid;

	@Transient
	public String createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_update_date")
	public Calendar updatedOn;

	/**
	 * @return the bookingId
	 */
	public int getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId
	 *            the bookingId to set
	 */
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @return the bookingUniqueId
	 */
	public String getBookingUniqueId() {
		return bookingUniqueId;
	}

	/**
	 * @param bookingUniqueId
	 *            the bookingUniqueId to set
	 */
	public void setBookingUniqueId(String bookingUniqueId) {
		this.bookingUniqueId = bookingUniqueId;
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
	 * @return the bookingDate
	 */
	public Calendar getBookingDate() {
		return bookingDate;
	}

	/**
	 * @param bookingDate
	 *            the bookingDate to set
	 */
	public void setBookingDate(Calendar bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * @return the bookingCustomMessage
	 */
	public String getBookingCustomMessage() {
		return bookingCustomMessage;
	}

	/**
	 * @param bookingCustomMessage
	 *            the bookingCustomMessage to set
	 */
	public void setBookingCustomMessage(String bookingCustomMessage) {
		this.bookingCustomMessage = bookingCustomMessage;
	}

	/**
	 * @return the checkoutDate
	 */
	public String getCheckoutDate() {
		return checkoutDate;
	}

	/**
	 * @param checkoutDate
	 *            the checkoutDate to set
	 */
	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	/**
	 * @return the checkoutCustomMessage
	 */
	public String getCheckoutCustomMessage() {
		return checkoutCustomMessage;
	}

	/**
	 * @param checkoutCustomMessage
	 *            the checkoutCustomMessage to set
	 */
	public void setCheckoutCustomMessage(String checkoutCustomMessage) {
		this.checkoutCustomMessage = checkoutCustomMessage;
	}

	/**
	 * @return the bookingRoomRate
	 */
	public String getBookingRoomRate() {
		return bookingRoomRate;
	}

	/**
	 * @param bookingRoomRate
	 *            the bookingRoomRate to set
	 */
	public void setBookingRoomRate(String bookingRoomRate) {
		this.bookingRoomRate = bookingRoomRate;
	}

	/**
	 * @return the bookingRoomQuantity
	 */
	public String getBookingRoomQuantity() {
		return bookingRoomQuantity;
	}

	/**
	 * @param bookingRoomQuantity
	 *            the bookingRoomQuantity to set
	 */
	public void setBookingRoomQuantity(String bookingRoomQuantity) {
		this.bookingRoomQuantity = bookingRoomQuantity;
	}

	/**
	 * @return the bookingRoomDiscount
	 */
	public String getBookingRoomDiscount() {
		return bookingRoomDiscount;
	}

	/**
	 * @param bookingRoomDiscount
	 *            the bookingRoomDiscount to set
	 */
	public void setBookingRoomDiscount(String bookingRoomDiscount) {
		this.bookingRoomDiscount = bookingRoomDiscount;
	}

	/**
	 * @return the bookingFinalPrice
	 */
	public String getBookingFinalPrice() {
		return bookingFinalPrice;
	}

	/**
	 * @param bookingFinalPrice
	 *            the bookingFinalPrice to set
	 */
	public void setBookingFinalPrice(String bookingFinalPrice) {
		this.bookingFinalPrice = bookingFinalPrice;
	}

	/**
	 * @return the bookingIsPaid
	 */
	public String getBookingIsPaid() {
		return bookingIsPaid;
	}

	/**
	 * @param bookingIsPaid
	 *            the bookingIsPaid to set
	 */
	public void setBookingIsPaid(String bookingIsPaid) {
		this.bookingIsPaid = bookingIsPaid;
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
		return "UserBooking [bookingId=" + bookingId + ", bookingUniqueId=" + bookingUniqueId + ", userId=" + userId
				+ ", hotelId=" + hotelId + ", roomId=" + roomId + ", bookingDate=" + bookingDate
				+ ", bookingCustomMessage=" + bookingCustomMessage + ", checkoutDate=" + checkoutDate
				+ ", checkoutCustomMessage=" + checkoutCustomMessage + ", bookingRoomRate=" + bookingRoomRate
				+ ", bookingRoomQuantity=" + bookingRoomQuantity + ", bookingRoomDiscount=" + bookingRoomDiscount
				+ ", bookingFinalPrice=" + bookingFinalPrice + ", bookingIsPaid=" + bookingIsPaid + ", createdOn="
				+ createdOn + ", updatedOn=" + updatedOn + "]";
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
		result = prime * result + bookingId;
		result = prime * result + ((bookingUniqueId == null) ? 0 : bookingUniqueId.hashCode());
		result = prime * result + hotelId;
		result = prime * result + roomId;
		result = prime * result + userId;
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
		UserBooking other = (UserBooking) obj;
		if (bookingId != other.bookingId)
			return false;
		if (bookingUniqueId == null) {
			if (other.bookingUniqueId != null)
				return false;
		} else if (!bookingUniqueId.equals(other.bookingUniqueId))
			return false;
		if (hotelId != other.hotelId)
			return false;
		if (roomId != other.roomId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

}
