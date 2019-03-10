CREATE TABLE `employee` (
  `EMPLOYEE_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` varchar(100) NOT NULL,
  `LAST_NAME` varchar(100) DEFAULT NULL,
  `AGE` int(10) NOT NULL,
  `SALARY` int(10) DEFAULT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

insert into `employee` (`EMPLOYEE_ID`, `FIRST_NAME`, `LAST_NAME`, `AGE`, `SALARY`) values('1','Peter','John','25','90000');
insert into `employee` (`EMPLOYEE_ID`, `FIRST_NAME`, `LAST_NAME`, `AGE`, `SALARY`) values('2','David','Raj','50','50000');
insert into `employee` (`EMPLOYEE_ID`, `FIRST_NAME`, `LAST_NAME`, `AGE`, `SALARY`) values('3','Arun','Kumar','40','30000');
