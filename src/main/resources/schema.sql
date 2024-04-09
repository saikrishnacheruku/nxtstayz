CREATE TABLE hotel (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    location TEXT,
    rating INTEGER
);

CREATE TABLE room (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    roomNumber TEXT,
    type TEXT,
    price DOUBLE,
    hotelid INTEGER,
    FOREIGN KEY (hotelid) REFERENCES hotel(id)
);
