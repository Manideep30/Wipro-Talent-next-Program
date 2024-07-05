/*Display the last names of all employees who have both an "a" and an "e" in their last name. */

SELECT lastName FROM employee WHERE lastName LIKE "%a%" AND lastName LIKE "%e%";