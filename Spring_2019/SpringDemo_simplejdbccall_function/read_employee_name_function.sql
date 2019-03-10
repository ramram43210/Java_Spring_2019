DELIMITER $$

CREATE
    /*[DEFINER = { user | CURRENT_USER }]*/
    FUNCTION `org_db`.`read_employee_name`(in_employee_id INTEGER)
    RETURNS VARCHAR(200) READS SQL DATA
    /*LANGUAGE SQL
    | [NOT] DETERMINISTIC
    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
    | SQL SECURITY { DEFINER | INVOKER }
    | COMMENT 'string'*/
    BEGIN
    
	DECLARE out_name VARCHAR(100);
	SELECT CONCAT(first_name, ' ', last_name)
        INTO out_name
        FROM employee WHERE employee_id = in_employee_id;
    RETURN out_name;

    END$$

DELIMITER ;