/*Display the last name and department ID of all employees in departments 20 or 50 
in ascending alphabetical order by name*/

SELECT lastName,dept_id FROM employee WHERE dept_id IN (20,50) ORDER BY lastName;

