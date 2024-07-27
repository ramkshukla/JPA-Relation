CREATE TABLE stream(
    id BIGINT PRIMARY KEY,
    nickname VARCHAR(255) NOT NULL
);


CREATE TABLE viewer(
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE followed_stream(
    stream_id BIGINT,
    viewer_id BIGINT,
    PRIMARY KEY (stream_id, viewer_id),
    FOREIGN KEY (stream_id) REFERENCES stream(id),
    FOREIGN KEY (viewer_id) REFERENCES viewer(id)
);

INSERT INTO stream(id, nickname) VALUES (1, 'GamerX');
INSERT INTO stream(id, nickname) VALUES (2, 'CoderLive');
INSERT INTO stream(id, nickname) VALUES (3, 'MusicStream');
INSERT INTO stream(id, nickname) VALUES (4, 'ArtChannel');


INSERT INTO viewer (id, name) VALUES (1, 'Alice');
INSERT INTO viewer (id, name) VALUES (2, 'Bob');
INSERT INTO viewer (id, name) VALUES (3, 'Charlie');
INSERT INTO viewer (id, name) VALUES (4, 'Diana');


INSERT INTO followed_stream (stream_id, viewer_id) VALUES (1, 1);
INSERT INTO followed_stream (stream_id, viewer_id) VALUES (2, 1);
INSERT INTO followed_stream (stream_id, viewer_id) VALUES (3, 2);
INSERT INTO followed_stream (stream_id, viewer_id) VALUES (1, 3);
INSERT INTO followed_stream (stream_id, viewer_id) VALUES (4, 4);
INSERT INTO followed_stream (stream_id, viewer_id) VALUES (3, 4);

SELECT followed_stream.stream_id, followed_stream.viewer_id, viewer.name, stream.nickname
FROM followed_stream
JOIN stream ON followed_stream.stream_id = stream.id
JOIN viewer ON followed_stream.viewer_id = viewer.id;

SELECT stream.id, stream.nickname
FROM followed_stream
JOIN stream ON followed_stream.stream_id = stream.id
JOIN viewer ON followed_stream.viewer_id = viewer.id
WHERE viewer.name = 'Alice';

SELECT viewer.id, viewer.name
FROM followed_stream
JOIN viewer on viewer.id = followed_stream.viewer_id
JOIN stream on stream.id = followed_stream.stream_id
WHERE  stream.nickname = 'GamerX';

SELECT stream.id,stream.nickname, COUNT(followed_stream.viewer_id)
FROM stream
LEFT JOIN followed_stream on stream.id = followed_stream.stream_id
GROUP BY stream.id, stream.nickname;

SELECT viewer.id, viewer.name, COUNT(followed_stream.stream_id)
FROM viewer
LEFT JOIN followed_stream ON viewer.id = followed_stream.viewer_id
GROUP BY viewer.id, viewer.name;


