/*Create a report to display the last name and job title of all employees who do not 
have a manager */

SELECT lastName,jobTitle FROM employee WHERE jobTitle NOT LIKE "Manager";