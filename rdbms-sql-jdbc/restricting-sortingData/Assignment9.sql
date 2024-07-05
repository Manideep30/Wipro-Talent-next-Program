/*Create a report to display the last name, salary, and commission of all employees who earn commissions.
Sort data in descending order based on salary and commissions. Use the column's numeric position in the 
ORDER BY clause. */

SELECT lastName,salary,commission FROM employee WHERE commission IS NOT NULL ORDER BY 2 DESC,3 DESC;