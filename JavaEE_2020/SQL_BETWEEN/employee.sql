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
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `AGE` int(10) NOT NULL,
  `SALARY` int(10) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `Created_date` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

LOCK TABLES `employee` WRITE;

insert  into `employee`(`ID`,`NAME`,`AGE`,`SALARY`,`city`,`country`,`Created_date`) values (1,'Peter',32,20000,'Tokyo','Japan','2019-09-02'),(2,'John',39,30000,'Chennai','India','2019-09-11'),(3,'Dave',40,6000,'Austin','USA','2019-09-08'),(4,'Arun',56,6000,'Chicago','USA','2019-09-25'),(5,'Raj',45,6000,'Las Vegas','USA','2019-08-07'),(6,'Julia',46,6000,'Atlanta','USA','2019-09-17'),(7,'Jack',65,70000,'Bangalore','India','2019-07-15'),(8,'Rocky',55,80000,'Kerala','India','2019-09-11'),(9,'Raj',67,NULL,NULL,'India','2019-08-20');

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
