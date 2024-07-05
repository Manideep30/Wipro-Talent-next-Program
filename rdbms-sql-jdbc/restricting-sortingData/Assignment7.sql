/*Create a report that displays the last name and hire date for all employees who were hired in 1994. */

SELECT lastName,hireDate FROM employee WHERE EXTRACT(year FROM hireDate)=1994;