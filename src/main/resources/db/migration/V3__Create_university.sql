CREATE TABLE  university(
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);


CREATE TABLE student(
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    university_id BIGINT,
    FOREIGN KEY (university_id) REFERENCES university(id)
);

INSERT INTO university(id, name) VALUES (1, 'Harvard University');
INSERT INTO university(id, name) VALUES (2, 'Stanford University');
INSERT INTO university(id, name) VALUES (3, 'MIT');

INSERT INTO student(id, name, university_id) VALUES (1, 'Alice Johnson', 1);
INSERT INTO student(id, name, university_id) VALUES (2, 'Bob Smith', 2);
INSERT INTO student(id, name, university_id) VALUES (3, 'Charlie Brown', 3);
INSERT INTO student(id, name, university_id) VALUES (4, 'Diana Prince', 1);
