--from the chinook database

SELECT * FROM album; --COLUMNS ARE album_id, title, AND artist_id
SELECT * FROM artist; --COLUMNS ARE artist_id AND name
SELECT * FROM employee e ;

SELECT count(*) FROM album; --347 records
SELECT count(*) FROM artist; --275 records


--------INNER JOIN
SELECT * FROM artist INNER JOIN album ON artist.artist_id = album.artist_id;
--now let's do this with aliasing
SELECT * FROM artist A INNER JOIN album B ON A.artist_id = B.artist_id;
--
SELECT count(*) FROM artist A INNER JOIN album B ON A.artist_id = B.artist_id; --347 records
--we can STILL use the where clause and other keywords
SELECT * FROM artist A INNER JOIN album B ON A.artist_id = B.artist_id WHERE A.artist_id=1;
SELECT * FROM artist A INNER JOIN album B ON A.artist_id = B.artist_id ORDER BY A.name ;


--------------LEFT OUTER JOIN
SELECT * FROM artist A LEFT OUTER JOIN album B ON A.artist_id = B.artist_id;
--
SELECT count(*) FROM artist A LEFT OUTER JOIN album B ON A.artist_id = B.artist_id; --418 records
--"OUTER" is actually sugar syntax
SELECT * FROM artist A LEFT JOIN album B ON A.artist_id = B.artist_id;



--------------RIGHT OUTER JOIN
SELECT * FROM artist A RIGHT OUTER JOIN album B ON A.artist_id = B.artist_id;
--
SELECT count(*) FROM artist A RIGHT OUTER JOIN album B ON A.artist_id = B.artist_id; --347 records, BY chance
--
SELECT * FROM artist A RIGHT JOIN album B ON A.artist_id = B.artist_id;



--------------FULL OUTER JOIN
SELECT * FROM artist A FULL OUTER JOIN album B ON A.artist_id = B.artist_id;
--
SELECT count(*) FROM artist A FULL OUTER JOIN album B ON A.artist_id = B.artist_id; --418 records, BY chance
--
SELECT * FROM artist A FULL JOIN album B ON A.artist_id = B.artist_id;





--------------EXCLUSIVE OUTER JOINS
-----(aka strictly outer joins    aka distinct outer joins)


---exclusive left outer join

/*
 * this is basically a GIANT subtraction problem
 * premise:            leftOuterJoin =  left+middleOfVendiagram
 * 
 * leftOuterJoin - innerJoin = exclusiveLeftOuterJoin
 */
SELECT * FROM artist a LEFT OUTER JOIN album b ON a.artist_id = b.artist_id 
WHERE a.artist_id NOT IN(
	SELECT c.artist_id FROM artist c INNER JOIN album d ON c.artist_id=d.artist_id 
) ORDER BY name;



-----anoter way to do exclusive left outer join
SELECT * FROM artist a LEFT OUTER JOIN album b ON a.artist_id = b.artist_id 
	WHERE b.artist_id IS NULL;


-----anoter way to do exclusive right outer join
SELECT * FROM artist a RIGHT OUTER JOIN album b ON a.artist_id = b.artist_id 
	WHERE a.artist_id IS NULL;



-----anoter way to do exclusive full outer join
SELECT * FROM artist a FULL OUTER JOIN album b ON a.artist_id = b.artist_id 
	WHERE b.artist_id IS NULL OR a.artist_id  IS NULL;



---------SELF JOIN
--------SELECT * FROM table01 A INNER JOIN table01 B ON A._id = B.foreign_id;

---------------CROSS JOIN
------------SELECT  FROM table01 CROSS JOIN table02;


--cross join syntax
SELECT count(*) FROM album; --347 records
SELECT count(*) FROM artist; --275 records
SELECT * FROM album CROSS JOIN artist;
SELECT count(*) FROM album CROSS JOIN artist; --347*275 = 95,425


