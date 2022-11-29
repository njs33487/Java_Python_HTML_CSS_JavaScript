



-----------------DROP TABLES/VIEWS
DROP VIEW super_human_power_join ; -- again, "SimilarToProject01" example's view
DROP VIEW shortened_query_view;
DROP TABLE shuman_spower_junction;
DROP TABLE superhumans;
DROP TABLE superpowers;




-----------------CREATE TABLES
/*
 * SERIAL   will auto increment the value everytime you feed it default/null; the datatype will be an INTEGER
 * BIGSERIAL    will do the same but produce a BIGINT
 * SMALLSERIAL    will do the same but produce a SMALLINT
 */

CREATE TABLE superhumans(
	shuman_id SERIAL PRIMARY KEY
	, shuman_name VARCHAR(100) NOT NULL UNIQUE
	, bounty NUMERIC(30) NOT NULL
);

CREATE TABLE superpowers(
	spower_id SERIAL PRIMARY KEY
	, spower_name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE shuman_spower_junction(
	my_shuman_id INTEGER NOT NULL
	, my_spower_id INTEGER NOT NULL
	, CONSTRAINT my_combo_key_or_something PRIMARY KEY (my_shuman_id, my_spower_id)
	, FOREIGN KEY (my_shuman_id) REFERENCES superhumans (shuman_id)
	, FOREIGN KEY (my_spower_id) REFERENCES superpowers (spower_id)
);


-------------INSERTS
INSERT INTO superhumans (shuman_name, bounty) VALUES ('Danny Boy', 250000);
INSERT INTO superhumans (shuman_name, bounty) VALUES ('Abyss', 240000);
INSERT INTO superhumans (shuman_name, bounty) VALUES ('Aster', 120000);
INSERT INTO superhumans (shuman_name, bounty) VALUES ('Asura', 250000);
INSERT INTO superhumans (shuman_name, bounty) VALUES ('Rain Man', 225000);
SELECT * FROM superhumans;


INSERT INTO superpowers (spower_name) VALUES ('Flying');
INSERT INTO superpowers (spower_name) VALUES ('Toy Chest');
INSERT INTO superpowers (spower_name) VALUES ('Fire Breathing');
INSERT INTO superpowers (spower_name) VALUES ('Hair Armament');
INSERT INTO superpowers (spower_name) VALUES ('Regen');
INSERT INTO superpowers (spower_name) VALUES ('unknown');
INSERT INTO superpowers (spower_name) VALUES ('SuperSpeed');
INSERT INTO superpowers (spower_name) VALUES ('Fog');
SELECT * FROM superpowers;


INSERT INTO shuman_spower_junction VALUES (1,1);
INSERT INTO shuman_spower_junction VALUES (1,2);
INSERT INTO shuman_spower_junction VALUES (1,5);
INSERT INTO shuman_spower_junction VALUES (2,6);
INSERT INTO shuman_spower_junction VALUES (3,3);
INSERT INTO shuman_spower_junction VALUES (3,5);
INSERT INTO shuman_spower_junction VALUES (4,4);
INSERT INTO shuman_spower_junction VALUES (4,6);
INSERT INTO shuman_spower_junction VALUES (5,7);
INSERT INTO shuman_spower_junction VALUES (5,8);
--INSERT INTO shuman_spower_junction VALUES (500,800); --this line will fail
SELECT * FROM shuman_spower_junction;


-----QUESTION, how would I delete a superhuman?
--DELETE FROM shuman_spower_junction WHERE my_shuman_id =1;
--DELETE FROM superhumans WHERE shuman_id =1;

-----QUESTION how would I find a specific superhuman?
SELECT * FROM superhumans WHERE shuman_id=1;

-----First, let's do it with subqueries
SELECT * FROM superpowers WHERE spower_id IN (
	SELECT my_spower_id FROM shuman_spower_junction WHERE my_shuman_id =  1 --OR my_shuman_id=4
);



SELECT * FROM superhumans; --what IF....I idk....renamed this TABLE TO accounts (restaurant/healthinsepctor)
SELECT * FROM superpowers; --what IF.....I....idk...renamed this TABLE TO fridges
SELECT * FROM shuman_spower_junction;

-----------EXAMPLE OF A JOIN THAT INCLUDES A MANY TO MANY RELATIONSHIP
--------------------(aka including a junction table)

--STEP 1: join superhuman table and the junction table
SELECT * 
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id = B.my_shuman_id ;


--STEP 2: join the result set above with the superpowers table
SELECT * 
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id = B.my_shuman_id
INNER JOIN superpowers C
ON C.spower_id = B.my_spower_id;



--STEP 3: you can add any other select concepts to your join
SELECT * 
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id = B.my_shuman_id
INNER JOIN superpowers C
ON C.spower_id = B.my_spower_id
WHERE A.shuman_name = 'Danny Boy';

--OR
SELECT A.shuman_name , C.spower_name , A.bounty 
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id = B.my_shuman_id
INNER JOIN superpowers C
ON C.spower_id = B.my_spower_id
WHERE A.shuman_name = 'Danny Boy'
ORDER BY C.spower_name ;



--if you need practice with joins try: https://sqlzoo.net/



--------VIEWS
/*
 * WHAT IS A VIEW?
 *  the view is essentially a projection of 1 or more ACTUAL tables
 * the view itself is just a virtual table, it doesn't store data, it just references
 * data from other tables.
 * 
 * In other words, a view stores a query so you can access massive queries easier
 */

CREATE VIEW shortened_query_view AS
SELECT A.shuman_name , C.spower_name , A.bounty 
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id = B.my_shuman_id
INNER JOIN superpowers C
ON C.spower_id = B.my_spower_id
WHERE A.shuman_name = 'Danny Boy'
ORDER BY C.spower_name ;

SELECT * FROM shortened_query_view;

/*
 * 
SELECT *
FROM superhumans A, shuman_spower_junction
WHERE A.shuman_name = 'Danny Boy';
*/




/*
 * 
 * What is a Materialized View?
 * 	It's a view that DOES store data.
 * 
 * Normally with a view tht data is updated EVERYTIME you select the view. With a materialized view
 * the data is stored so you could possibly be getting outdated data. Materialized views are updated
 * periodically. They are used to speed up computations in SQL, because views need to be recompiled while
 * materialized views do not.
 * 
 * view syntax:
 * CREATE VIEW get_rid_of_annoyance_view AS
 * 
 * materialized view syntax:
 * 	CREATE MATERIALIZED VIEW get_rid_of_annoyance_view AS
 * 
 * to refresh materialized views syntax:
 * 	REFRESH MATERIALIZED VIEW get_rid_of_annoyance_view;
 * 
 * 
 * Let's for a moment think of facebook; they have 2billion users and each of those uses have how many posts?
 * 	maybe....let's just lowball guess 500...you may not want to rerun a inner join everytime.
 * 
 * 
 * 
 * What is an index?
 *   YOu can create indexes on a table to speed up searching on a table. It becomes usesful whene you're looking in
 * a small range of a table that has a LOT of records. It's similar to a table of contents.
 */







--THIS JOIN WILL BE USED FOR THE "SimilarToProject01" demo project
CREATE VIEW super_human_power_join AS
SELECT A.shuman_id, A.shuman_name, C.spower_name, A.bounty
FROM superhumans A
INNER JOIN shuman_spower_junction B
ON A.shuman_id  = B.my_shuman_id
INNER JOIN superpowers C
ON C.spower_id = B.my_spower_id;

SELECT * FROM super_human_power_join; 

--DROP VIEW super_human_power_join ;
------again, the stuff above will be for "SimilarToProject01" demo coming later


