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
@Table(name = "hotel_admin")
public class HotelAdmin {

	@Id
	@Column(name = "admin_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelAdminId;

	@Column(name = "admin_unique_id")
	private String adminUniqueId;

	@Column(name = "admin_username")
	private String adminUsername;

	@Column(name = "admin_email", unique = true)
	private String adminEmail;

	@Column(name = "admin_password")
	private String adminPassword;

	@Column(name = "admin_name")
	private String adminName;

	@Column(name = "admin_contact_no_1")
	private String adminContact1;

	@Column(name = "admin_contact_no_2")
	private String adminContact2;

	@Column(name = "admin_contact_no_3")
	private String adminContact3;

	@Column(name = "admin_is_verified")
	private int isVerified;

	@Column(name = "admin_secret_question")
	private String adminSecretQuestion;

	@Column(name = "admin_secret_answer")
	private String adminSecretAnswer;

	@Column(name = "admin_secondary_email")
	private String adminSecondaryEmail;

	@Column(name = "admin_website_url")
	private String adminWebsiteUrl;

	@Transient
	public String createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_update_date")
	public Calendar updatedOn;

	/**
	 * @return the hotelAdminId
	 */
	public int getHotelAdminId() {
		return hotelAdminId;
	}

	/**
	 * @param hotelAdminId
	 *            the hotelAdminId to set
	 */
	public void setHotelAdminId(int hotelAdminId) {
		this.hotelAdminId = hotelAdminId;
	}

	/**
	 * @return the adminUniqueId
	 */
	public String getAdminUniqueId() {
		return adminUniqueId;
	}

	/**
	 * @param adminUniqueId
	 *            the adminUniqueId to set
	 */
	public void setAdminUniqueId(String adminUniqueId) {
		this.adminUniqueId = adminUniqueId;
	}

	/**
	 * @return the adminUsername
	 */
	public String getAdminUsername() {
		return adminUsername;
	}

	/**
	 * @param adminUsername
	 *            the adminUsername to set
	 */
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	/**
	 * @return the adminEmail
	 */
	public String getAdminEmail() {
		return adminEmail;
	}

	/**
	 * @param adminEmail
	 *            the adminEmail to set
	 */
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	/**
	 * @return the adminPassword
	 */
	public String getAdminPassword() {
		return adminPassword;
	}

	/**
	 * @param adminPassword
	 *            the adminPassword to set
	 */
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * @param adminName
	 *            the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * @return the adminContact1
	 */
	public String getAdminContact1() {
		return adminContact1;
	}

	/**
	 * @param adminContact1
	 *            the adminContact1 to set
	 */
	public void setAdminContact1(String adminContact1) {
		this.adminContact1 = adminContact1;
	}

	/**
	 * @return the adminContact2
	 */
	public String getAdminContact2() {
		return adminContact2;
	}

	/**
	 * @param adminContact2
	 *            the adminContact2 to set
	 */
	public void setAdminContact2(String adminContact2) {
		this.adminContact2 = adminContact2;
	}

	/**
	 * @return the adminContact3
	 */
	public String getAdminContact3() {
		return adminContact3;
	}

	/**
	 * @param adminContact3
	 *            the adminContact3 to set
	 */
	public void setAdminContact3(String adminContact3) {
		this.adminContact3 = adminContact3;
	}

	/**
	 * @return the isVerified
	 */
	public int getIsVerified() {
		return isVerified;
	}

	/**
	 * @param isVerified
	 *            the isVerified to set
	 */
	public void setIsVerified(int isVerified) {
		this.isVerified = isVerified;
	}

	/**
	 * @return the adminSecretQuestion
	 */
	public String getAdminSecretQuestion() {
		return adminSecretQuestion;
	}

	/**
	 * @param adminSecretQuestion
	 *            the adminSecretQuestion to set
	 */
	public void setAdminSecretQuestion(String adminSecretQuestion) {
		this.adminSecretQuestion = adminSecretQuestion;
	}

	/**
	 * @return the adminSecretAnswer
	 */
	public String getAdminSecretAnswer() {
		return adminSecretAnswer;
	}

	/**
	 * @param adminSecretAnswer
	 *            the adminSecretAnswer to set
	 */
	public void setAdminSecretAnswer(String adminSecretAnswer) {
		this.adminSecretAnswer = adminSecretAnswer;
	}

	/**
	 * @return the adminSecondaryEmail
	 */
	public String getAdminSecondaryEmail() {
		return adminSecondaryEmail;
	}

	/**
	 * @param adminSecondaryEmail
	 *            the adminSecondaryEmail to set
	 */
	public void setAdminSecondaryEmail(String adminSecondaryEmail) {
		this.adminSecondaryEmail = adminSecondaryEmail;
	}

	/**
	 * @return the adminWebsiteUrl
	 */
	public String getAdminWebsiteUrl() {
		return adminWebsiteUrl;
	}

	/**
	 * @param adminWebsiteUrl
	 *            the adminWebsiteUrl to set
	 */
	public void setAdminWebsiteUrl(String adminWebsiteUrl) {
		this.adminWebsiteUrl = adminWebsiteUrl;
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
		return "HotelAdmin [hotelAdminId=" + hotelAdminId + ", adminUniqueId=" + adminUniqueId + ", adminUsername="
				+ adminUsername + ", adminEmail=" + adminEmail + ", adminPassword=" + adminPassword + ", adminName="
				+ adminName + ", adminContact1=" + adminContact1 + ", adminContact2=" + adminContact2
				+ ", adminContact3=" + adminContact3 + ", isVerified=" + isVerified + ", adminSecretQuestion="
				+ adminSecretQuestion + ", adminSecretAnswer=" + adminSecretAnswer + ", adminSecondaryEmail="
				+ adminSecondaryEmail + ", adminWebsiteUrl=" + adminWebsiteUrl + ", createdOn=" + createdOn
				+ ", updatedOn=" + updatedOn + "]";
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
		result = prime * result + ((adminUniqueId == null) ? 0 : adminUniqueId.hashCode());
		result = prime * result + hotelAdminId;
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
		HotelAdmin other = (HotelAdmin) obj;
		if (adminUniqueId == null) {
			if (other.adminUniqueId != null)
				return false;
		} else if (!adminUniqueId.equals(other.adminUniqueId))
			return false;
		if (hotelAdminId != other.hotelAdminId)
			return false;
		return true;
	}

}
