CREATE TABLE  car (
      id BIGINT PRIMARY KEY,
      brand VARCHAR(255) NOT NULL
);

CREATE TABLE owner (
       id BIGINT PRIMARY KEY,
       firstName VARCHAR(255) NOT NULL,
       car_id BIGINT UNIQUE,
       FOREIGN KEY (car_id) REFERENCES car(id)
);

INSERT INTO car (id, brand) VALUES (1, 'Maruti');
INSERT INTO car(id, brand) VALUES (2, 'Bugati');

INSERT INTO owner(id, firstName, car_id) VALUES (1, 'OwnerA', 1);
INSERT INTO owner(id, firstName, car_id) VALUES (2, 'OwnerB', 2);
