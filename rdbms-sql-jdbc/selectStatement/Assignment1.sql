/*Determine the structure of the DEPARTMENTS table and its contents.*/


create table department(dept_id int,dept_name varchar(10), salary int);
insert into department values(1,"CSE",50000);
insert into department values(2,"ECE",50000);
insert into department values(3,"EEE",50000);
DESC department;

