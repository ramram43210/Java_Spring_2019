/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.5.5-10.1.24-MariaDB : Database - org_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`org_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `org_db`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `ADDRESS_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `EMPLOYEE_ID` int(10) unsigned NOT NULL,
  `STREET_NAME` varchar(100) NOT NULL,
  `CITY` varchar(100) NOT NULL,
  `COUNTRY` varchar(100) NOT NULL,
  `ZIPCODE` varchar(100) NOT NULL,
  `CREATED_DATE` date DEFAULT NULL,
  PRIMARY KEY (`ADDRESS_ID`),
  KEY `EMPLOYEE_ADDRESS_LINK` (`EMPLOYEE_ID`),
  CONSTRAINT `EMPLOYEE_ADDRESS_LINK` FOREIGN KEY (`EMPLOYEE_ID`) REFERENCES `employee` (`EMPLOYEE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `address` */

LOCK TABLES `address` WRITE;

insert  into `address`(`ADDRESS_ID`,`EMPLOYEE_ID`,`STREET_NAME`,`CITY`,`COUNTRY`,`ZIPCODE`,`CREATED_DATE`) values (1,1,'18,Dark Street','Chennai','India','680009','2019-09-10'),(2,1,'90,West Street','Bangalore','India','655556','2019-09-18'),(3,2,'898,East Street','Bangalore','India','565565','2019-09-14'),(4,2,'676,North Street','Chennai','India','767676','2019-09-18'),(5,2,'434,Good Street','Kerala','India','656565','2019-09-16');

UNLOCK TABLES;

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `EMPLOYEE_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `EMPLOYEE_NAME` varchar(100) NOT NULL,
  `AGE` int(10) NOT NULL,
  `SALARY` int(10) DEFAULT NULL,
  `CREATED_DATE` date DEFAULT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

LOCK TABLES `employee` WRITE;

insert  into `employee`(`EMPLOYEE_ID`,`EMPLOYEE_NAME`,`AGE`,`SALARY`,`CREATED_DATE`) values (1,'Peter',32,7000,'2019-09-03'),(2,'Dave',34,8000,'2019-09-04'),(3,'John',45,10000,'2019-09-24');

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
