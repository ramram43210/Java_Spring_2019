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

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `EMPLOYEE_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `EMPLOYEE_NAME` varchar(100) NOT NULL,
  `AGE` int(10) NOT NULL,
  `SALARY` int(10) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `CREATED_DATE` date DEFAULT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

LOCK TABLES `employee` WRITE;

insert  into `employee`(`EMPLOYEE_ID`,`EMPLOYEE_NAME`,`AGE`,`SALARY`,`city`,`CREATED_DATE`) values (1,'Peter',32,7000,'Chennai','2019-09-03'),(2,'Dave',34,8000,'Bangalore','2019-09-04'),(3,'John',45,10000,'Chennai','2019-09-24'),(4,'Ajay',32,7000,'Kerala','2019-09-18'),(5,'Vijay',45,8888,'Chennai','2019-09-30');

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
