/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 8.0.14 : Database - org_db
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
  `EMPLOYEE_ID` int(10) DEFAULT NULL,
  `EMPLOYEE_NAME` varchar(300) DEFAULT NULL,
  `AGE` int(10) DEFAULT NULL,
  `SALARY` int(10) DEFAULT NULL,
  `CITY` varchar(300) DEFAULT NULL,
  `COUNTRY` varchar(300) DEFAULT NULL,
  `CREATED_DATE` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`EMPLOYEE_ID`,`EMPLOYEE_NAME`,`AGE`,`SALARY`,`CITY`,`COUNTRY`,`CREATED_DATE`) values (1,'Peter',32,7000,'Chennai','India','2019-09-03'),(2,'Dave',34,8000,'Bangalore','India','2019-09-04'),(3,'John',45,10000,'Chennai','India','2019-09-24'),(4,'Ajay',32,7000,'Kerala','India','2019-09-18'),(5,'Vijay',40,8888,'Tokyo','Japan','2019-09-30'),(6,'Arun',56,7777,'Kyoto ','Japan','2019-09-16');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
