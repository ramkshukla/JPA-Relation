CREATE TABLE address (
    id BIGINT PRIMARY KEY,
    city VARCHAR(255) NOT NULL
);

CREATE TABLE "user" (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    address_id BIGINT UNIQUE,
    FOREIGN KEY (address_id) REFERENCES address(id)
);

INSERT  INTO  address (id, city) VALUES (1, 'Noida');
INSERT  INTO  address (id, city) VALUES (2, 'UP');
INSERT  INTO  address (id, city) VALUES (3, 'Albela');
INSERT  INTO  address (id, city) VALUES (4, 'MP');

INSERT INTO "user" (id, name, email,address_id ) values (1, 'A', 'Ashukla00000@gmail.com', 1);
INSERT INTO "user" (id, name, email, address_id) values (2, 'B', 'Bshukla00000@gmail.com',2);
INSERT INTO "user" (id, name, email, address_id) values (3, 'C', 'Cshukla00000@gmail.com',3);
INSERT INTO "user" (id, name, email, address_id) values (4, 'D', 'Dshukla00000@gmail.com',4);