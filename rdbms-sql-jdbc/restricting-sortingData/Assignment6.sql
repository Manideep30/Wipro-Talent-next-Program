/*List employees who earn between $5,000 and $12,000, and are in department 20 or 50. Label the columns as
Employee and Monthly Salary, respectively. */

SELECT emp_id AS Employee,salary AS monthlySalary FROM employee WHERE salary BETWEEN(5000,12000) AND 
dept_id IN (20,50);