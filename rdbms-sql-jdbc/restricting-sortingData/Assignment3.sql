/*To find high-salary and low-salary employees. Create a query to display the last name and salary for any employee whose 
salary is not in the range of $5,000 to $12,000*/

CREATE TABLE employee(emp_number INT, firstName VARCHAR(10),lastName VARCHAR(10),salary FLOAT,pb_id INT,hireDate DATE);
INSERT INTO employee VALUES(1,"Mahesh","vihari",50000,10,"2023-05-30");
INSERT INTO employee VALUES(2,"Rajesh","chakra",60000,10,"2023-05-30");
INSERT INTO employee VALUES(3,"simhan","veeru",10000,10,"2023-05-30");
INSERT INTO employee VALUES(4,"Raghav","anand",3000,10,"2023-05-30");
INSERT INTO employee VALUES(176,"seenu","madha",50000,10,"2023-05-30");

SELECT lastName,salary FROM employee WHERE salary NOT BETWEEN 5000 AND 12000;