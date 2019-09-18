/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.5.5-10.1.24-MariaDB 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `employee` (
	`EMPLOYEE_ID` int (10),
	`EMPLOYEE_NAME` varchar (300),
	`AGE` int (10),
	`SALARY` int (10),
	`CITY` varchar (300),
	`COUNTRY` varchar (300),
	`CREATED_DATE` date 
); 
insert into `employee` (`EMPLOYEE_ID`, `EMPLOYEE_NAME`, `AGE`, `SALARY`, `CITY`, `COUNTRY`, `CREATED_DATE`) values('1','Peter','32','7000','Chennai','India','2019-09-03');
insert into `employee` (`EMPLOYEE_ID`, `EMPLOYEE_NAME`, `AGE`, `SALARY`, `CITY`, `COUNTRY`, `CREATED_DATE`) values('2','Dave','34','8000','Bangalore','India','2019-09-04');
insert into `employee` (`EMPLOYEE_ID`, `EMPLOYEE_NAME`, `AGE`, `SALARY`, `CITY`, `COUNTRY`, `CREATED_DATE`) values('3','John','45','10000','Chennai','India','2019-09-24');
insert into `employee` (`EMPLOYEE_ID`, `EMPLOYEE_NAME`, `AGE`, `SALARY`, `CITY`, `COUNTRY`, `CREATED_DATE`) values('4','Ajay','32','7000','Kerala','India','2019-09-18');
insert into `employee` (`EMPLOYEE_ID`, `EMPLOYEE_NAME`, `AGE`, `SALARY`, `CITY`, `COUNTRY`, `CREATED_DATE`) values('5','Vijay','40','8888','Tokyo','Japan','2019-09-30');
insert into `employee` (`EMPLOYEE_ID`, `EMPLOYEE_NAME`, `AGE`, `SALARY`, `CITY`, `COUNTRY`, `CREATED_DATE`) values('6','Arun','56','7777','Kyoto ','Japan','2019-09-16');
