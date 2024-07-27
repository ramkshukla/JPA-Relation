CREATE TABLE cart(
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE item(
    id BIGINT PRIMARY KEY,
    serialNumber VARCHAR(255) NOT NULL,
    cart_id BIGINT,
    FOREIGN KEY (cart_id) REFERENCES cart(id)
);

INSERT INTO cart(id, name) VALUES (1, 'Cart1');
INSERT INTO cart(id, name) VALUES (2, 'Cart2');
INSERT INTO cart(id, name) VALUES (3, 'Cart3');
INSERT INTO cart(id, name) VALUES (4, 'Cart4');

INSERT INTO item(id, serialNumber, cart_id) VALUES (1, '146829', 1);
INSERT INTO item(id, serialNumber, cart_id) VALUES (2, '1468459', 1);



