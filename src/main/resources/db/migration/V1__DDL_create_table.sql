CREATE TABLE continent (
                           continent_id LONG NOT NULL UNIQUE AUTO_INCREMENT,
                           continent_name VARCHAR(255) NOT NULL UNIQUE,
                           PRIMARY KEY (continent_id)
);

CREATE TABLE country (
                         country_id LONG NOT NULL UNIQUE AUTO_INCREMENT,
                         country_name VARCHAR(255) NOT NULL UNIQUE,
                         continent_id INT,
                         PRIMARY KEY (country_id),
                         FOREIGN KEY (continent_id) REFERENCES continent(continent_id)
);

CREATE TABLE city (
                      city_id INT NOT NULL UNIQUE AUTO_INCREMENT,
                      city_name VARCHAR(255) NOT NULL UNIQUE,
                      country_id INT,
                      PRIMARY KEY (city_id),
                      FOREIGN KEY (country_id) REFERENCES country(country_id)
);

CREATE TABLE hotel (
                       hotel_id INT NOT NULL UNIQUE AUTO_INCREMENT,
                       hotel_name VARCHAR(255) NOT NULL UNIQUE,
                       city_id INT,
                       PRIMARY KEY (hotel_id),
                       FOREIGN KEY (city_id) REFERENCES city(city_id)
);


CREATE TABLE airport (
                         airport_id INT NOT NULL UNIQUE AUTO_INCREMENT,
                         airport_name VARCHAR(255) NOT NULL UNIQUE,
                         city_id INT,
                         PRIMARY KEY (airport_id),
                         FOREIGN KEY (city_id) REFERENCES city(city_id)
);

