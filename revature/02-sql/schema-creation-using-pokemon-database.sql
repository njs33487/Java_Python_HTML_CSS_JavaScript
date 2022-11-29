
--THIS IS A COMMENT

/*
 * THIS is a block comment in SQL
 * 
 * 
 * SQL is not case sensitive
 *
 *BUT the convention is to capitalize the keywords for readability sake
 *
 *ALSO.....data entries ARE case sensitive. For example strings: 'helloWorld' and 'helloworld'
 * are different.
 */



SELECT * FROM actor;
select * from actor; 
--it's onl case sensitive when you look at data
SELECT * FROM actor WHERE first_name='Penelope';
SELECT * FROM actor WHERE first_name='penelope';








SELECT * FROM pokemon;






/*
 * DATATYPES IN POSTGRESQL
 * Integer, varchar, timestamp, date, numeric, serial, bigserial, smallserial, bigint, smallint, text,etc
 * 
 * 
 * There are a TON of them.
 * https://www.postgresql.org/docs/current/datatype.html
 * 
 * 
 * 
 * 
 * CONSTRAINTS: they are restrictions on the data that can be entered into a column; or to think of
 * 	it another way, they are conditions that have to be met.
 * 
 * >PRIMARY KEY (PK) it represents the official unique identifier for the record
 * 		>Primary Key is a combination of unique and not null
 * 		>Additional note: you should probably NEVER change your PK, not because it isn't possible
 * 		but because it's dangerous. Let your DBA change PK if it necessary for any reason.
 * 		>example syntax:
 * 			PRIMARY KEY (refAttr_from_THIS_table)
 * 
 * >FOREIGN KEY (FK) it's a reference pointer to *another* table's PK
 * 		>FK does not have to be not-null and unique (but it does in its own table because there it's the
 * 													primary key)
 * 		>example syntax:
 * 			FOREIGN KEY (refAttr_from_THIS_table) REFERENCES other_table (PK_attr_from_other_table)
 * 		>furthering the example:
 * 			FOREIGN KEY (car_fk) REFERENCES car (car_id)
 * 
 * >NOT NULL ensures that the record has a value in this column (can't be null)
 * 
 * >UNIQUE ensures that any two records will NOT have the same value in this column
 * 
 * >CHECK ensures that the record will meet a certain business condition
 * 		>example syntax:
 * 			CONSTRAINT constraint_name CHECK (column_amount>15)
 * 
 * >DEFAULT creates a default value for a column that is given null
 */
--DDL: CREATE
CREATE TABLE pokemon(
	--[variablename] DATATYPE [constraints]
	pokemon_id SERIAL --INTEGER --PRIMARY KEY
	, PRIMARY KEY (pokemon_id)
	
	, pokemon_name VARCHAR(100) UNIQUE
	, pokemon_type VARCHAR(25) NOT NULL
);


--DDL: DROP
DROP TABLE pokemon;

--DDL: ALTER
ALTER TABLE pokemon ADD pokemon_secondtype VARCHAR(25);

--DDL: TRUNCATE
--I'll leave this to you if you want to experiment with it
--------truncate will delete all records but keep the schema (table)



--DML: SELECT
SELECT * FROM pokemon;
SELECT pokemon_name, pokemon_id FROM pokemon;

--DML: INSERT 
INSERT INTO pokemon values(1, 'bulbasaur','grass','ice');
INSERT INTO pokemon values(25, 'pikachu','electric',null);
INSERT INTO pokemon values(121, 'starmie','water','psychic');
INSERT INTO pokemon values(149, 'dragonite','dragon','flying');
INSERT INTO pokemon values(150, 'mewtwo','psychic',null);

INSERT INTO pokemon(pokemon_name, pokemon_id, pokemon_type) VALUES ('charmander', 4, 'fire');
--INSERT INTO my_table VALUES(18, null, null, null, null, 'value', null, null, null, 15, null, null);



INSERT INTO pokemon values(121, 'starmie','water','psychic'); --UNIQUE CONSTRAINT violation

INSERT INTO pokemon values(NULL, 'missingno', 'normal', null);-- NOT-NULL CONSTRAINT violation


INSERT INTO pokemon VALUES(DEFAULT, 'missingno8', 'normal', null); --"SERIAL" example
INSERT INTO pokemon(pokemon_name, pokemon_type) values('missingno15', 'normal');-- "SERIAL" example




--DML: UPDATE 
--UPDATE pokemon SET pokemon_secondtype = 'poison';
UPDATE pokemon SET pokemon_secondtype = 'poison' WHERE pokemon_id = 1;



--DML: DELETE
--DELETE FROM pokemon;
DELETE FROM pokemon WHERE pokemon_name ='mewtwo';


COMMIT;
ROLLBACK;

