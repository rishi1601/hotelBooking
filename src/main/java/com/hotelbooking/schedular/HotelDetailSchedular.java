package com.hotelbooking.schedular;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class HotelDetailSchedular {

	@Scheduled(cron = "10 * * * * *")
	public void hotelNameCron() {

	}

}
