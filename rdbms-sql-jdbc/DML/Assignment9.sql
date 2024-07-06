/*Delete employees whose name either first or last name has char seq of 'man' */

DELETE FROM myEmployee WHERE firstName LIKE "%man%" OR lastName LIKE "%man%";