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




