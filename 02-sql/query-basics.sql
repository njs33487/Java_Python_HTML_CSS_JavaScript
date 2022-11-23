
----------------QUERY BASICS

--SELECT * <-----the '*' means all columns
SELECT * FROM employee;

--SELECT [column1, column2, column3, etc] FROM [table_name]
SELECT first_name, last_name FROM employee;


--ALIAS (using the "as" keyword) changes the title of the attributes in the result set
SELECT first_name AS muffin, last_name AS button FROM employee;
SELECT first_name muffin, last_name button FROM employee;
--ALIASING for tables (notice that you don't need the "as" keyword)
SELECT employee.first_name , employee.birth_date FROM employee;
SELECT bunnywabbit.first_name , bunnywabbit.birth_date FROM employee AS bunnywabbit;
SELECT bunnywabbit.first_name , bunnywabbit.birth_date FROM employee bunnywabbit;
SELECT A.first_name , A.birth_date FROM employee A;

--example
SELECT first_name, title, reports_to AS manager FROM employee;

/*
 * 
 * What is a result set?
 * 	The temporary table that you get back from a query
 */


------------DIFFERENT TYPES OF SELECTS
SELECT * FROM employee;
--WHERE clause is essentially a filter clause
SELECT * FROM employee WHERE title = 'Sales Support Agent';
SELECT * FROM employee WHERE title = 'sales support agent'; --NOTICE how the DATA entries ARE CASE SENSITIVE

SELECT * FROM employee WHERE first_name='Jane' AND title='Sales Support Agent';
SELECT * FROM employee WHERE first_name='Jane' OR  first_name='Steve' OR  first_name='Margaret';

SELECT * FROM employee WHERE first_name IN ('Andrew','Margaret','Steve');--you can ALSO use the "IN" keyword

--ALSO, you can use >, <, <=, >= in ther where clause
SELECT * FROM employee WHERE reports_to >=1;
--SELECT * FROM employee WHERE reports_to >0 AND birth_date > blahblah;


SELECT * FROM employee WHERE first_name != 'Jane';
SELECT * FROM employee WHERE first_name <> 'Jane';
SELECT * FROM employee WHERE NOT first_name = 'Jane';








--------I GAVE YOU ALL THESE TOPICS TO STUDY, BUT HERE IS THE SYNTAX IF YOU NEED EXAMPLES--------------------




----------NULL REFERENCE
SELECT * FROM employee;
--
SELECT * FROM employee WHERE reports_to = null; --this wont work
SELECT * FROM employee WHERE reports_to = 'null'; --this wont WORK
--will get anyone that reports to no one
SELECT * FROM employee WHERE reports_to IS NULL;
SELECT * FROM employee WHERE NOT reports_to IS NOT NULL;
--will get anyone that DOES report to someone
SELECT * FROM employee WHERE reports_to IS NOT NULL;
SELECT * FROM employee WHERE NOT reports_to IS NULL;



--------------------LIKE keyword, finds patterns in attributes
------'%' is a wildcard that is a stand-in for 0 or more characters
-------'_' is a wildcard that is a stand-in for EXACTLY 1 character
SELECT * FROM album;
SELECT * FROM album WHERE title LIKE 'B%';
SELECT * FROM album WHERE title LIKE 'Bi%';
SELECT * FROM album WHERE title LIKE '%ig Ones';
SELECT * FROM album WHERE title LIKE '%Big Ones';
SELECT * FROM album WHERE title LIKE 'B% O%';
SELECT * FROM album WHERE title LIKE '%%%%%%%%%%%%B%%%%%%%%%%%%%%%%%%%%%%%';
SELECT * FROM album WHERE title LIKE '_ig Ones';
SELECT * FROM album WHERE title LIKE '_Big Ones';
SELECT * FROM album WHERE title LIKE '_g Ones';
--can you do a "one or more" wildcard?
SELECT * FROM album WHERE title LIKE '_%ig Ones';
SELECT * FROM album WHERE title LIKE '_%g Ones';
SELECT * FROM album WHERE title LIKE '_%Big Ones';



-------------ORDER BY -------- aka sorting
---defaults to ascending order...BUT you can manually order by descending
SELECT * FROM employee ;
SELECT * FROM employee ORDER BY first_name;
SELECT * FROM employee ORDER BY first_name ASC;
SELECT * FROM employee ORDER BY first_name DESC;
SELECT * FROM employee ORDER BY title ;
SELECT * FROM employee ORDER BY title , first_name ;
SELECT * FROM employee ORDER BY title , first_name , last_name ;


-----------------------BETWEEN keyword
SELECT * FROM employee e ;
SELECT * FROM employee e WHERE employee_id >=5 AND employee_id <=7;
SELECT * FROM employee e WHERE employee_id BETWEEN 5 AND 7; --inclusive range
SELECT * FROM employee e WHERE employee_id BETWEEN 5 AND 7 AND title = 'IT Staff';
SELECT * FROM employee e WHERE first_name BETWEEN 'A' AND 'R';

----------------IN keyword
SELECT * FROM employee WHERE first_name ='Andrew' OR first_name ='Margaret' OR first_name = 'Steve';
SELECT * FROM employee e WHERE first_name IN ('Andrew', 'Steve', 'Margaret');
SELECT * FROM employee e WHERE first_name NOT IN ('Andrew', 'Steve', 'Margaret');








----------------------------AGREGATE FUNCTIONS
/*
 * What is an aggregate function?
 * a calculated operating on a group of records/entries, often producing a single value as a result
 * 
 * There are different types of aggregate functions, for example:
 * COUNT, MAX, MIN, AVG, SUM, DISTINCT
 * 
 */

SELECT * FROM album a;
SELECT count(*) FROM album a ;
--
SELECT * FROM employee e ;
SELECT count(*) FROM employee e ;
--
SELECT count(title) FROM employee e ; --will NOT DO what we wanted it to
SELECT DISTINCT(title) FROM employee e ;
SELECT count(DISTINCT(title)) FROM employee e ;
--
SELECT * FROM invoice i ;
SELECT count(*) FROM invoice i;
SELECT max(total) FROM invoice i ;
SELECT min(total) FROM invoice i ;
SELECT avg(total) FROM invoice i ;
SELECT sum(total) FROM invoice i ;
-------yes, we can use max and min on strings
SELECT max(billing_city) FROM invoice i ;


--question: what if I wanted to know how much each country spent individually?

--GROUP BY
--group by allows aggregate functions to work on smaller pockets of records
SELECT * FROM invoice i ;
SELECT billing_country, sum(total) FROM invoice i GROUP BY billing_country ;
SELECT billing_country, count(*) FROM invoice i  GROUP BY billing_country ;



--question: what if I wanted to create a result set that only contained countries that have spent more than $50

--THESE DON'T GET THE RESULTS THAT WE DESIRE
--SELECT billing_country, sum(total)>50 FROM invoice i GROUP BY billing_country ; --NOT what we wanted
--SELECT billing_country, sum(total) FROM invoice i WHERE total>50 GROUP BY billing_country; --NOT what we waned
--SELECT billing_country, sum(total) FROM invoice i WHERE sum(total)>50 GROUP BY billing_country ; --syntax error
--SELECT billing_country, sum(total) AS muffin FROM invoice i WHERE muffin>50 GROUP BY billing_country ; --syntax error

--HERE IS HOW TO SOLVE THE PROBLEM
------as it turns out WHERE filters before aggregate functions, HAVING filters afterwards
SELECT billing_country, sum(total) FROM invoice i GROUP BY billing_country HAVING sum(total)>50;
SELECT billing_country, sum(total) FROM invoice i WHERE total>1 GROUP BY billing_country HAVING sum(total)>50;

/*
 * BTW, order of the keywrods matters, "where" goes before "group by" goes before "having"
 * 
 * Also, order by is usually the last keyword
 */









-----------------------SCALAR FUNCTIONS 
/*
 * What is a scalar functions?
 * 	functions that work on individual records
 * 
 * There are TONS of scalar functiosn. Some deal with numeric values, some with character values, others with dates, and more....
 */

--FIRST, let's create a dummy TABLE 
----we'll use this like the System.out.println();
SELECT 5*7;
SELECT 'helloWorld';


---------NUMERIC
----here are some examples, but there are MANY more:
SELECT abs(-99);
SELECT floor(88.77);
SELECT ceil(88.77);
SELECT trunc(23432.23427, 4); --doesn't round
SELECT trunc(23432.23427, 2); 
SELECT trunc(23432.23427, -4);


-----CHARACTER
----here are some examples, but there are MANY more:
SELECT 'HeLlo WorlD';
SELECT upper('HeLlo WorlD');
SELECT lower('HeLlo WorlD');
SELECT length('HeLlo WorlD');


-----DATE
----here are some examples, but there are MANY more:
SELECT current_date;
SELECT current_timestamp ;


------leet's look at scalar functions operating on an entire TABLE 
SELECT * FROM invoice i ;
SELECT billing_country, billing_city FROM invoice i ;
SELECT upper(billing_country), billing_city FROM invoice i ;




------------SUBQUERIES
--------------------------aka nested queries

SELECT * FROM customer c;
SELECT * FROM invoice i ;


/*
 * In this subquery example we are looking for customer in the INVOICE TABLE that have spent more than 16 bucks,
 * THEN from the CUSTOMER TABLE we are finding those individuals information.
 */
SELECT * FROM customer A WHERE customer_id IN(
	SELECT B.customer_id FROM invoice B WHERE B.total >16
);

----another example of a subquery
SELECT B.customer_id, total, invoice_id FROM (SELECT * FROM invoice WHERE total>15) AS B WHERE invoice_id>200;
--turns out thought...this query does the SAME THING as the query above; I was just proving you COULD do it.
SELECT customer_id, total, invoice_id FROM invoice WHERE total>15 AND invoice_id >200;








