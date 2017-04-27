package com.hotelbooking.dao;

import java.util.List;

import com.hotelbooking.model.AdminHotel;

public interface AdminHotelsDao {

	public int assignAdminHotel(AdminHotel adminHotel);

	public void updateAdminHotel(AdminHotel adminHotel);

	public void deleteAdminHotel(AdminHotel adminHotel);

	public List<AdminHotel> getAllAdminHotel();

	public List<AdminHotel> getAllHotelOfAdmin(int adminId);

	public List<AdminHotel> getAllAdminOfHotel(int hotelId);

	public List<AdminHotel> getAllActiveHotel();

	public List<AdminHotel> getActiveAdminHotel(int adminId);

	public List<AdminHotel> getActiveHotelAdmin(int hotelId);

}
