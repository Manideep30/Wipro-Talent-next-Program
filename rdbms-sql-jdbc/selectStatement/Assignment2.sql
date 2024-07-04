/* ﻿Create a query to display all unique job IDs from the EMPLOYEES table.
Create a query to display employee id, last name, job id and hiredate from employee table with more describing column names. Name the column headings
Emp # Employee, Job and Hire Date respectively.*/

CREATE TABLE employee (job_id INT, emp_name VARCHAR(10), salary FLOAT);
INSERT INTO employee VALUES(1,"mahesh",50000);
INSERT INTO employee VALUES(1,"rajesh",70000);
INSERT INTO employee VALUES(2,"sowrab",60000);

SELECT DISTINCT(job_id) FROM employee ;
 


