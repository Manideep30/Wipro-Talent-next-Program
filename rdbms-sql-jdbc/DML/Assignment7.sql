/*Create a query to increase salary by 10% for all employees in dept 90.*/


SET SQL_SAFE_UPDATES=0;
UPDATE  myEmployee SET salary=(salary+0.01*salary) WHERE deptId=90;
SET SQL_SAFE_UPDATES=1;