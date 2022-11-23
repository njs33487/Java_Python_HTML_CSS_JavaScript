DROP TABLE orders;
DROP TABLE restaurant;


CREATE TABLE restaurant( --feels SIMILAR TO your ers_useer
	rest_id SERIAL PRIMARY KEY
	, rest_name VARCHAR(100) NOT NULL UNIQUE
	, rest_location VARCHAR(1024) NOT NULL
);

CREATE TABLE orders( --feels SIMILAR TO your ers_reimbursements
	order_id SERIAL PRIMARY KEY
	, order_amount	DECIMAL(10, 2) NOT NULL
			--(10 is the max amount of in the entire number,
			--	2 is the max possible number of numbes to the right of the decimal point)
	, order_contents VARCHAR(1024) NOT NULL UNIQUE
	, order_rest_id INTEGER NOT NULL
	, FOREIGN KEY (order_rest_id) REFERENCES restaurant (rest_id)
);


-------------INSERTS
INSERT INTO restaurant (rest_name, rest_location) VALUES ('Chipotle', 'Texas');
INSERT INTO restaurant (rest_name, rest_location) VALUES ('Taco Bell', 'Washington');
INSERT INTO restaurant (rest_name, rest_location) VALUES ('Cava', 'Maryland');
INSERT INTO restaurant (rest_name, rest_location) VALUES ('Krusty Krab', 'Unda da sea');
SELECT * FROM restaurant;


INSERT INTO orders (order_amount, order_contents, order_rest_id) VALUES (12.45, 'burrito', 1);
INSERT INTO orders (order_amount, order_contents, order_rest_id) VALUES (8.90, 'quesadilla', 1);
INSERT INTO orders (order_amount, order_contents, order_rest_id) VALUES (5.00, 'sadness', 2);
INSERT INTO orders (order_amount, order_contents, order_rest_id) VALUES (12.00, 'chicken bowl', 3);
INSERT INTO orders (order_amount, order_contents, order_rest_id) VALUES (8.00, 'salad', 3);
INSERT INTO orders (order_amount, order_contents, order_rest_id) VALUES (3, 'drink', 3);
INSERT INTO orders (order_amount, order_contents, order_rest_id) VALUES (8, '5 dollar footlong', 4);
SELECT * FROM orders;




SELECT rest_location, order_id, order_amount, order_contents, rest_name
FROM orders
INNER JOIN restaurant
ON restaurant.rest_id = orders.order_rest_id;


