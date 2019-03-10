DELIMITER $$

USE `org_db`$$

DROP PROCEDURE IF EXISTS `read_all_employee`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `read_all_employee`()
BEGIN
        SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, AGE, SALARY  FROM employee;
END$$

DELIMITER ;