-- MySQL Script generated by MySQL Workbench
-- Sunday 16 April 2017 12:12:36 AM IST
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema hotelBooking
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hotelBooking
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hotelBooking` DEFAULT CHARACTER SET latin1 ;
USE `hotelBooking` ;

-- -----------------------------------------------------
-- Table `hotelBooking`.`facilties`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelBooking`.`facilties` (
  `facility_id` BIGINT(11) NOT NULL AUTO_INCREMENT,
  `facility_name` VARCHAR(255) NOT NULL,
  `short_description` TEXT NULL DEFAULT NULL,
  `db_add_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `db_update_date` DATETIME NOT NULL,
  PRIMARY KEY (`facility_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `hotelBooking`.`hotel_info`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelBooking`.`hotel_info` (
  `hotel_id` BIGINT(11) NOT NULL AUTO_INCREMENT,
  `admin_id` BIGINT(11) NOT NULL,
  `hotel_name` VARCHAR(255) NOT NULL,
  `location` TEXT NULL DEFAULT NULL,
  `group_id` BIGINT(11) NULL DEFAULT NULL,
  `contact_no_1` VARCHAR(100) NOT NULL,
  `contact_no_2` VARCHAR(100) NULL DEFAULT NULL,
  `contact_no_3` VARCHAR(100) NULL DEFAULT NULL,
  `email_id_1` VARCHAR(100) NOT NULL,
  `email_id_2` VARCHAR(100) NULL DEFAULT NULL,
  `website_url` VARCHAR(100) NOT NULL,
  `short_description` TEXT NULL DEFAULT NULL,
  `latitude` VARCHAR(255) NOT NULL,
  `longitude` VARCHAR(255) NOT NULL,
  `no_of_rooms` INT(11) NOT NULL,
  `db_add_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `db_update_date` DATETIME NOT NULL,
  PRIMARY KEY (`hotel_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `hotelBooking`.`hotel_facility`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelBooking`.`hotel_facility` (
  `hotel_facility_id` BIGINT(11) NOT NULL AUTO_INCREMENT,
  `hotel_id` BIGINT(11) NOT NULL,
  `facility_id` BIGINT(11) NOT NULL,
  `is_active` INT(3) NOT NULL DEFAULT '1' COMMENT '1=> Active 0=>Not Active',
  `db_add_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `db_update_date` DATETIME NOT NULL,
  PRIMARY KEY (`hotel_facility_id`),
  INDEX `fk_hotel_facilty_id` (`hotel_id` ASC),
  CONSTRAINT `fk_hotel_facilty_id`
    FOREIGN KEY (`hotel_id`)
    REFERENCES `hotelBooking`.`hotel_info` (`hotel_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `hotelBooking`.`tags`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelBooking`.`tags` (
  `tag_id` BIGINT(11) NOT NULL AUTO_INCREMENT,
  `tag_name` VARCHAR(255) NOT NULL,
  `tag_description` TEXT NULL DEFAULT NULL,
  `hashtag` VARCHAR(255) NULL DEFAULT NULL,
  `db_add_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `db_update_date` DATETIME NOT NULL,
  `room_tags_room_tag_id` BIGINT(11) NOT NULL,
  PRIMARY KEY (`tag_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `hotelBooking`.`hotel_tags`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelBooking`.`hotel_tags` (
  `hotel_tag_id` BIGINT(11) NOT NULL AUTO_INCREMENT,
  `hotel_id` BIGINT(11) NOT NULL,
  `tag_id` BIGINT(11) NOT NULL,
  `db_add_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `db_update_date` DATETIME NOT NULL,
  `tags_tag_id` BIGINT(11) NOT NULL,
  `hotel_info_hotel_id` BIGINT(11) NOT NULL,
  PRIMARY KEY (`hotel_tag_id`, `tags_tag_id`, `hotel_info_hotel_id`),
  INDEX `fk_hotel_tags_tags1_idx` (`tags_tag_id` ASC),
  INDEX `fk_hotel_tags_hotel_info1_idx` (`hotel_info_hotel_id` ASC),
  CONSTRAINT `fk_hotel_tags_tags1`
    FOREIGN KEY (`tags_tag_id`)
    REFERENCES `hotelBooking`.`tags` (`tag_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hotel_tags_hotel_info1`
    FOREIGN KEY (`hotel_info_hotel_id`)
    REFERENCES `hotelBooking`.`hotel_info` (`hotel_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `hotelBooking`.`room_facility`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelBooking`.`room_facility` (
  `room_facility_id` BIGINT(11) NOT NULL AUTO_INCREMENT,
  `room_id` BIGINT(11) NOT NULL,
  `hotel_id` BIGINT(11) NOT NULL,
  `facility_id` BIGINT(11) NOT NULL,
  `is_active` INT(3) NOT NULL DEFAULT '1' COMMENT '1=> Active 0=>Not Active',
  `db_add_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `db_update_date` DATETIME NOT NULL,
  PRIMARY KEY (`room_facility_id`),
  INDEX `fk_facilty_id` (`facility_id` ASC),
  CONSTRAINT `fk_facilty_id`
    FOREIGN KEY (`facility_id`)
    REFERENCES `hotelBooking`.`facilties` (`facility_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `hotelBooking`.`room_info`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelBooking`.`room_info` (
  `room_id` BIGINT(11) NOT NULL AUTO_INCREMENT,
  `hotel_id` BIGINT(11) NOT NULL,
  `room_name` VARCHAR(255) NOT NULL,
  `room_description` TEXT NULL DEFAULT NULL,
  `no_of_rooms` INT(11) NOT NULL,
  `price_min` FLOAT(14,2) NOT NULL DEFAULT '0.00',
  `price_max` FLOAT(14,2) NOT NULL DEFAULT '0.00',
  `is_available` INT(3) NOT NULL DEFAULT '1' COMMENT '0=> Not Available , 1=> Available',
  `db_add_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `db_update_date` DATETIME NOT NULL,
  PRIMARY KEY (`room_id`),
  INDEX `fk_hotel_id` (`hotel_id` ASC),
  CONSTRAINT `fk_hotel_id`
    FOREIGN KEY (`hotel_id`)
    REFERENCES `hotelBooking`.`hotel_info` (`hotel_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `hotelBooking`.`room_tags`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotelBooking`.`room_tags` (
  `room_tag_id` BIGINT(11) NOT NULL AUTO_INCREMENT,
  `room_id` BIGINT(11) NOT NULL,
  `hotel_id` BIGINT(11) NOT NULL,
  `tag_id` BIGINT(11) NOT NULL,
  `db_add_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `db_update_date` DATETIME NOT NULL,
  `tags_tag_id` BIGINT(11) NOT NULL,
  `room_info_room_id` BIGINT(11) NOT NULL,
  `hotel_info_hotel_id` BIGINT(11) NOT NULL,
  PRIMARY KEY (`room_tag_id`, `tags_tag_id`, `room_info_room_id`, `hotel_info_hotel_id`),
  INDEX `fk_room_tags_tags1_idx` (`tags_tag_id` ASC),
  INDEX `fk_room_tags_room_info1_idx` (`room_info_room_id` ASC),
  INDEX `fk_room_tags_hotel_info1_idx` (`hotel_info_hotel_id` ASC),
  CONSTRAINT `fk_room_tags_tags1`
    FOREIGN KEY (`tags_tag_id`)
    REFERENCES `hotelBooking`.`tags` (`tag_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_room_tags_room_info1`
    FOREIGN KEY (`room_info_room_id`)
    REFERENCES `hotelBooking`.`room_info` (`room_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_room_tags_hotel_info1`
    FOREIGN KEY (`hotel_info_hotel_id`)
    REFERENCES `hotelBooking`.`hotel_info` (`hotel_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
