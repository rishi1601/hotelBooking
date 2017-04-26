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
@Table(name = "user_review")
public class UserReview {

	@Id
	@Column(name = "user_reviw_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userReviewId;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "hotel_id")
	private int hotelId;

	@Column(name = "room_id")
	private int roomId;

	@Column(name = "booking_id")
	private int bookingId;

	@Column(name = "rating")
	private int rating;

	@Column(name = "user_comment_title")
	private String userCommentTitle;

	@Column(name = "user_comment")
	private String userComment;

	@Column(name = "admin_reply_title")
	private String adminReplyTitle;

	@Column(name = "admin_reply")
	private String adminReply;

	@Transient
	private String userCommentAddDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "user_comment_update_date")
	private Calendar userCommentUpdateDate;

	@Transient
	private String adminReplyAddDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "admin_reply_update_date")
	private Calendar adminReplyUpdateDate;

	@Transient
	public String createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_update_date")
	public Calendar updatedOn;

	/**
	 * @return the userReviewId
	 */
	public int getUserReviewId() {
		return userReviewId;
	}

	/**
	 * @param userReviewId
	 *            the userReviewId to set
	 */
	public void setUserReviewId(int userReviewId) {
		this.userReviewId = userReviewId;
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
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the userCommentTitle
	 */
	public String getUserCommentTitle() {
		return userCommentTitle;
	}

	/**
	 * @param userCommentTitle
	 *            the userCommentTitle to set
	 */
	public void setUserCommentTitle(String userCommentTitle) {
		this.userCommentTitle = userCommentTitle;
	}

	/**
	 * @return the userComment
	 */
	public String getUserComment() {
		return userComment;
	}

	/**
	 * @param userComment
	 *            the userComment to set
	 */
	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}

	/**
	 * @return the adminReplyTitle
	 */
	public String getAdminReplyTitle() {
		return adminReplyTitle;
	}

	/**
	 * @param adminReplyTitle
	 *            the adminReplyTitle to set
	 */
	public void setAdminReplyTitle(String adminReplyTitle) {
		this.adminReplyTitle = adminReplyTitle;
	}

	/**
	 * @return the adminReply
	 */
	public String getAdminReply() {
		return adminReply;
	}

	/**
	 * @param adminReply
	 *            the adminReply to set
	 */
	public void setAdminReply(String adminReply) {
		this.adminReply = adminReply;
	}

	/**
	 * @return the userCommentAddDate
	 */
	public String getUserCommentAddDate() {
		return userCommentAddDate;
	}

	/**
	 * @param userCommentAddDate
	 *            the userCommentAddDate to set
	 */
	public void setUserCommentAddDate(String userCommentAddDate) {
		this.userCommentAddDate = userCommentAddDate;
	}

	/**
	 * @return the userCommentUpdateDate
	 */
	public Calendar getUserCommentUpdateDate() {
		return userCommentUpdateDate;
	}

	/**
	 * @param userCommentUpdateDate
	 *            the userCommentUpdateDate to set
	 */
	public void setUserCommentUpdateDate(Calendar userCommentUpdateDate) {
		this.userCommentUpdateDate = userCommentUpdateDate;
	}

	/**
	 * @return the adminReplyAddDate
	 */
	public String getAdminReplyAddDate() {
		return adminReplyAddDate;
	}

	/**
	 * @param adminReplyAddDate
	 *            the adminReplyAddDate to set
	 */
	public void setAdminReplyAddDate(String adminReplyAddDate) {
		this.adminReplyAddDate = adminReplyAddDate;
	}

	/**
	 * @return the adminReplyUpdateDate
	 */
	public Calendar getAdminReplyUpdateDate() {
		return adminReplyUpdateDate;
	}

	/**
	 * @param adminReplyUpdateDate
	 *            the adminReplyUpdateDate to set
	 */
	public void setAdminReplyUpdateDate(Calendar adminReplyUpdateDate) {
		this.adminReplyUpdateDate = adminReplyUpdateDate;
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
		return "UserReview [userReviewId=" + userReviewId + ", userId=" + userId + ", hotelId=" + hotelId + ", roomId="
				+ roomId + ", bookingId=" + bookingId + ", rating=" + rating + ", userCommentTitle=" + userCommentTitle
				+ ", userComment=" + userComment + ", adminReplyTitle=" + adminReplyTitle + ", adminReply=" + adminReply
				+ ", userCommentAddDate=" + userCommentAddDate + ", userCommentUpdateDate=" + userCommentUpdateDate
				+ ", adminReplyAddDate=" + adminReplyAddDate + ", adminReplyUpdateDate=" + adminReplyUpdateDate
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
		result = prime * result + bookingId;
		result = prime * result + hotelId;
		result = prime * result + roomId;
		result = prime * result + userId;
		result = prime * result + userReviewId;
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
		UserReview other = (UserReview) obj;
		if (bookingId != other.bookingId)
			return false;
		if (hotelId != other.hotelId)
			return false;
		if (roomId != other.roomId)
			return false;
		if (userId != other.userId)
			return false;
		if (userReviewId != other.userReviewId)
			return false;
		return true;
	}

}
