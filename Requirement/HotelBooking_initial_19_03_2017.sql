CREATE TABLE IF NOT EXISTS hotel_info(
hotel_id BIGINT(11) NOT NULL AUTO_INCREMENT,
admin_id BIGINT(11) NOT NULL,
hotel_name VARCHAR(255) NOT NULL,
location TEXT , 
group_id BIGINT(11) NULL DEFAULT NULL,
contact_no_1 VARCHAR(100) NOT NULL,
contact_no_2 VARCHAR(100) NULL,
contact_no_3 VARCHAR(100) NULL,
email_id_1 VARCHAR(100) NOT NULL,
email_id_2 VARCHAR(100) NULL,
website_url VARCHAR(100) NOT NULL, 
short_description TEXT,
latitude VARCHAR(255) NOT NULL,
longitude VARCHAR(255) NOT NULL,
no_of_rooms INT(11) NOT NULL,
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL,
PRIMARY KEY (hotel_id)
);



CREATE TABLE IF NOT EXISTS room_info(
room_id BIGINT(11) NOT NULL AUTO_INCREMENT,
hotel_id BIGINT(11) NOT NULL,
room_name VARCHAR(255) NOT NULL,
room_description TEXT,
no_of_rooms INT(11) NOT NULL,
price_min FLOAT(14,2) NOT NULL DEFAULT 0.00,
price_max FLOAT(14,2) NOT NULL DEFAULT 0.00,
is_available INT(3) NOT NULL DEFAULT 1 COMMENT '0=> Not Available , 1=> Available',
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL,
PRIMARY KEY (room_id)
)


CREATE TABLE IF NOT EXISTS room_facility(
room_facility_id BIGINT(11) NOT NULL AUTO_INCREMENT,
room_id BIGINT(11) NOT NULL,
hotel_id BIGINT(11) NOT NULL,
facility_id BIGINT(11) NOT NULL,
is_active INT(3) NOT NULL DEFAULT 1 COMMENT '1=> Active 0=>Not Active',
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL,
PRIMARY KEY (room_facility_id) 
)


CREATE TABLE IF NOT EXISTS hotel_facility(
hotel_facility_id BIGINT(11) NOT NULL AUTO_INCREMENT,
hotel_id BIGINT(11) NOT NULL,
facility_id BIGINT(11) NOT NULL,
is_active INT(3) NOT NULL DEFAULT 1 COMMENT '1=> Active 0=>Not Active',
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL,
PRIMARY KEY (hotel_facility_id) 
)


CREATE TABLE IF NOT EXISTS facilties(
facility_id BIGINT(11) NOT NULL AUTO_INCREMENT,
facility_name VARCHAR(255)  NOT NULL , 
short_description TEXT,
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL,
PRIMARY KEY (facility_id)
)

CREATE TABLE IF NOT EXISTS tags(
tag_id BIGINT(11) NOT NULL AUTO_INCREMENT,
tag_name VARCHAR(255) NOT NULL,
tag_description TEXT,
hashtag VARCHAR(255),
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL,
PRIMARY KEY (tag_id)
)


CREATE TABLE IF NOT EXISTS room_tags(
room_tag_id BIGINT(11) NOT NULL AUTO_INCREMENT,
room_id BIGINT(11) NOT NULL,
hotel_id BIGINT(11) NOT NULL,
tag_id BIGINT(11) NOT NULL,
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL,
PRIMARY KEY (room_tag_id)
)

CREATE TABLE IF NOT EXISTS hotel_tags(
hotel_tag_id BIGINT(11) NOT NULL AUTO_INCREMENT,
hotel_id BIGINT(11) NOT NULL,
tag_id BIGINT(11) NOT NULL,
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL,
PRIMARY KEY (hotel_tag_id)
)



ALTER TABLE room_info ADD CONSTRAINT fk_hotel_id FOREIGN KEY (hotel_id) REFERENCES hotel_info(hotel_id);


ALTER TABLE room_facility ADD CONSTRAINT fk_room_facilty_id FOREIGN KEY (room_id) REFERENCES room_info(room_id);
ALTER TABLE room_facility ADD CONSTRAINT fk_hotel_facilty_id FOREIGN KEY (hotel_id) REFERENCES hotel_info(hotel_id);
ALTER TABLE room_facility ADD CONSTRAINT fk_facilty_id FOREIGN KEY (facility_id) REFERENCES facilties(facility_id);



ALTER TABLE hotel_facility ADD CONSTRAINT fk_hotel_facilty_id FOREIGN KEY (hotel_id) REFERENCES hotel_info(hotel_id);
ALTER TABLE hotel_facility ADD CONSTRAINT fk_facilty_id FOREIGN KEY (facility_id) REFERENCES facilties(facility_id);


// 15-04-2017


CREATE TABLE IF NOT EXISTS hotel_admin(
admin_id BIGINT(11) NOT NULL AUTO_INCREMENT,
admin_unique_id VARCHAR(255) NOT NULL,
admin_username VARCHAR(255) NOT NULL,
admin_email VARCHAR(255) NOT NULL,
admin_password VARCHAR(255) NOT NULL,
admin_name VARCHAR(255) NOT NULL,
admin_contact_no_1 VARCHAR(255) NOT NULL,
admin_contact_no_2 VARCHAR(255) NOT NULL,
admin_contact_no_3 VARCHAR(255) NOT NULL,
admin_is_verified TINYINT(3) NOT NULL,
admin_secret_question TEXT,
admin_secret_answer TEXT,
admin_secondary_email VARCHAR(255) NOT NULL,
admin_website_url VARCHAR(255) NOT NULL,
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL,
PRIMARY KEY (admin_id)
)

CREATE TABLE IF NOT EXISTS admin_hotels(
admin_hotel_id BIGINT(11) NOT NULL AUTO_INCREMENT,
admin_id BIGINT(11) NOT NULL,
hotel_id BIGINT(11) NOT NULL,
is_active INT(3) NOT NULL DEFAULT 0 COMMENT '0=> Active , 1=>In-Active',
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL, 
PRIMARY KEY (admin_hotel_id)
)

CREATE TABLE IF NOT EXISTS admin_social_networks(
admin_social_id BIGINT(11) NOT NULL AUTO_INCREMENT,
admin_id BIGINT(11) NOT NULL,
hotel_id BIGINT(11) NOT NULL,
social_network_name VARCHAR(255) NOT NULL,
social_network_url VARCHAR(255) NOT NULL,
is_active INT(3) NOT NULL DEFAULT 0 COMMENT '0=> Active , 1=>In-Active',
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL, 
PRIMARY KEY (admin_social_id)
)




ALTER TABLE admin_hotels ADD CONSTRAINT fk_admin_id FOREIGN KEY (admin_id) REFERENCES hotel_admin(admin_id);
ALTER TABLE admin_hotels ADD CONSTRAINT fk_admin_hotel_id FOREIGN KEY (hotel_id) REFERENCES hotel_info(hotel_id);


ALTER TABLE admin_social_networks ADD CONSTRAINT fk_social_admin_id FOREIGN KEY (admin_id) REFERENCES hotel_admin(admin_id);
ALTER TABLE admin_social_networks ADD CONSTRAINT fk_social_hotel_id FOREIGN KEY (hotel_id) REFERENCES hotel_info(hotel_id);



//16-04-2017


CREATE TABLE IF NOT EXISTS user_info(
user_id BIGINT(11) NOT NULL AUTO_INCREMENT,
user_unique_id VARCHAR(255) UNIQUE NOT NULL,
user_name VARCHAR(255) NOT NULL,
user_email VARCHAR(255) UNIQUE NOT NULL,
user_address_1 VARCHAR(255) NOT NULL,
user_address_2 VARCHAR(255) NOT NULL,
user_contact_no_1 VARCHAR(100) NOT NULL,
user_contact_no_2 VARCHAR(100) NOT NULL,
user_city VARCHAR(100) NOT NULL,
user_state VARCHAR(100) NOT NULL,
user_country VARCHAR(100) NOT NULL,
user_secondary_email VARCHAR(255) NOT NULL,
is_verified INT(3) NOT NULL DEFAULT 0 COMMENT '0=> Not Verified , 1=>Verified , 2 => Pending Verification',
is_active INT(3) NOT NULL DEFAULT 0 COMMENT '0=> Active , 1=>In-Active',
is_blocked INT(3) NOT NULL DEFAULT 0 COMMENT '0=> Not Blocked , 1=>Blocked',
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL, 
PRIMARY KEY (user_id)
)




CREATE TABLE IF NOT EXISTS user_social_network(
user_social_network_id BIGINT(11) NOT NULL AUTO_INCREMENT,
user_id BIGINT(11) NOT NULL,
social_network_name VARCHAR(100) NOT NULL,
social_network_identity VARCHAR(100) NOT NULL,
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL, 
PRIMARY KEY (user_social_network_id)
)




CREATE TABLE IF NOT EXISTS user_review(
user_reviw_id BIGINT(11) NOT NULL AUTO_INCREMENT,
user_id BIGINT(11) NOT NULL,
hotel_id BIGINT(11) NOT NULL,
room_id BIGINT(11) NOT NULL,
booking_id BIGINT(11) NOT NULL,
rating INT(11) NOT NULL,
user_comment_title VARCHAR(255) ,
user_comment TEXT,
admin_reply_title VARCHAR(255),
admin_reply TEXT,
user_comment_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
user_comment_update_date DATETIME NOT NULL,
admin_reply_add_date DATETIME NOT NULL,
admin_reply_update_date DATETIME NOT NULL,
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL, 
PRIMARY KEY (user_reviw_id)
)


CREATE TABLE IF NOT EXISTS user_booking(
booking_id BIGINT(11) NOT NULL AUTO_INCREMENT,
booking_unique_id VARCHAR(255) NOT NULL,
user_id BIGINT(11) NOT NULL,
hotel_id BIGINT(11) NOT NULL,
room_id BIGINT(11) NOT NULL,
booking_date DATETIME NOT NULL,
booking_custom_message TEXT,
checkout_date DATETIME NOT NULL,
checkout_custom_message TEXT , 
booking_room_rate VARCHAR(100) NOT NULL,
booking_room_quantity VARCHAR(100) NOT NULL,
booking_room_discount VARCHAR(100) NOT NULL,
booking_final_price VARCHAR(100) NOT NULL,
booking_is_paid VARCHAR(100) NOT NULL,
db_add_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
db_update_date DATETIME NOT NULL, 
PRIMARY KEY (booking_id)
)


ALTER TABLE user_social_network ADD CONSTRAINT fk_user_social_user_id FOREIGN KEY (user_id) REFERENCES user_info(user_id);


ALTER TABLE user_review ADD CONSTRAINT fk_user_review_user_id FOREIGN KEY (user_id) REFERENCES user_info(user_id);
ALTER TABLE user_review ADD CONSTRAINT fk_user_review_hotel_id FOREIGN KEY (hotel_id) REFERENCES hotel_info(hotel_id);
ALTER TABLE user_review ADD CONSTRAINT fk_user_social_room_id FOREIGN KEY (room_id) REFERENCES room_info(room_id);
ALTER TABLE user_review ADD CONSTRAINT fk_user_social_booking_id FOREIGN KEY (booking_id) REFERENCES user_booking(booking_id);


ALTER TABLE user_booking ADD CONSTRAINT fk_user_booking_user_id FOREIGN KEY (user_id) REFERENCES user_info(user_id);
ALTER TABLE user_booking ADD CONSTRAINT fk_user_booking_hotel_id FOREIGN KEY (hotel_id) REFERENCES hotel_info(hotel_id);
ALTER TABLE user_booking ADD CONSTRAINT fk_user_booking_room_id FOREIGN KEY (room_id) REFERENCES room_info(room_id);














