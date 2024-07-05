/*Create a report to display the last name, job ID, and hire date for employees with the 
last names of Matos and Taylor. 
Order the query in ascending order by the hire date.*/

CREATE TABLE employee(emp_number INT, firstName VARCHAR(10),lastName VARCHAR(10),
salary FLOAT,pb_id INT,hireDate DATE);
INSERT INTO employee VALUES(1,"Mahesh","vihari",50000,10,"2023-05-30");
INSERT INTO employee VALUES(2,"Rajesh","chakra",60000,10,"2023-05-30");
INSERT INTO employee VALUES(3,"simhan","veeru",10000,10,"2023-05-30");
INSERT INTO employee VALUES(4,"Raghav","anand",3000,10,"2023-05-30");
INSERT INTO employee VALUES(176,"seenu","madha",50000,10,"2023-05-30");
INSERT INTO employee VALUES(178,"Kowshik","Matos",30000,10,"2023-09-30");
INSERT INTO employee VALUES(179,"Ravi","Taylor",20000,10,"2023-08-30");

SELECT lastName,pb_id FROM employee WHERE lastName IN ("Matos","Taylor") ORDER BY hireDate;