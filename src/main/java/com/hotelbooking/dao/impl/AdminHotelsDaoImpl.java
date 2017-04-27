package com.hotelbooking.dao.impl;

import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Query;
import com.hotelbooking.dao.AdminHotelsDao;
import com.hotelbooking.model.AdminHotel;

public class AdminHotelsDaoImpl implements AdminHotelsDao {
	
     private static final Logger logger = Logger.getLogger(AdminHotelsDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int assignAdminHotel(AdminHotel adminHotel) {
		Serializable adminHotelId = 0;
		try{
			 adminHotelId = this.sessionFactory.getCurrentSession().save(adminHotel);
		}catch(Exception e){
			logger.log(Level.ERROR,"Error Occured While Storing Admin Hotel with credentials ("+adminHotel.toString()+") , Error : ("+e.getMessage()+")");
		}
		return Integer.parseInt(adminHotelId.toString());
	}

	@Override
	public void updateAdminHotel(AdminHotel adminHotel) {
		try{
			this.sessionFactory.getCurrentSession().update(adminHotel);
		}catch(Exception e){
			logger.log(Level.ERROR, "Error Occured while updating Admin Hotel ("+adminHotel.toString()+") with Exception :("+e.getMessage()+")");
		}
	}

	@Override
	public void deleteAdminHotel(AdminHotel adminHotel) {
		try{
			this.sessionFactory.getCurrentSession().delete(adminHotel);
		}catch(Exception e){
			logger.log(Level.ERROR, "Error Occured while deleting Admin Hotel ("+adminHotel.toString()+") with Exception :("+e.getMessage()+")");
		}
		
	}

	@Override
	public List<AdminHotel> getAllAdminHotel() {
		return this.sessionFactory.getCurrentSession().createQuery("from admin_hotels").list();
	}

	@Override
	public List<AdminHotel> getAllHotelOfAdmin(int adminId) {
		String hql="FROM AdminHotel AH WHERE AH.admin_id=:adminId";
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("adminId",adminId);
		return query.list();
	}

	@Override
	public List<AdminHotel> getAllAdminOfHotel(int hotelId) {
		String hql="FROM AdminHotel AH WHERE AH.hotel_id=:hotelId";
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("hotelId",hotelId);
		return query.list();
	}

	@Override
	public List<AdminHotel> getAllActiveHotel() {
		String hql="FROM AdminHotel AH WHERE AH.is_active=:isActive";
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("isActive",1);
		return query.list();
	}

	@Override
	public List<AdminHotel> getActiveAdminHotel(int adminId) {
		String hql="FROM AdminHotel AH WHERE AH.is_active=:isActive and AH.admin_id=:adminId";
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("isActive",1);
		query.setParameter("adminId", adminId);
		return query.list();
	}

	@Override
	public List<AdminHotel> getActiveHotelAdmin(int hotelId) {
		String hql="FROM AdminHotel AH WHERE AH.is_active=:isActive and AH.hotel_id=:hotelId";
		Query query=this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("isActive",1);
		query.setParameter("hotelId", hotelId);
		return query.list();
	}

}
