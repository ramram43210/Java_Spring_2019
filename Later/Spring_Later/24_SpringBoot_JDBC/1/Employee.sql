CREATE DATABASE org_db;


CREATE TABLE `employee` (
  `ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(100) NOT NULL,
  `AGE` INT(10) NOT NULL,
  `SALARY` INT(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

insert into `employee` (`ID`, `NAME`, `AGE`, `SALARY`) values('1','Peter','28','80000');
insert into `employee` (`ID`, `NAME`, `AGE`, `SALARY`) values('2','John','50','40000');
insert into `employee` (`ID`, `NAME`, `AGE`, `SALARY`) values('3','David','45','20000');