CREATE TABLE continent (
                           id BIGINT AUTO_INCREMENT,
                           name VARCHAR(255) NOT NULL UNIQUE,
                           PRIMARY KEY (id)
);

CREATE TABLE country (
                         id BIGINT AUTO_INCREMENT,
                         name VARCHAR(255) NOT NULL UNIQUE,
                         continent_id BIGINT,
                         PRIMARY KEY (id),
                         FOREIGN KEY (continent_id) REFERENCES continent(id)
);

CREATE TABLE city (
                      id BIGINT AUTO_INCREMENT,
                      name VARCHAR(255) NOT NULL UNIQUE,
                      country_id BIGINT,
                      PRIMARY KEY (id),
                      FOREIGN KEY (country_id) REFERENCES country(id)
);

CREATE TABLE hotel (
                       id BIGINT AUTO_INCREMENT,
                       name VARCHAR(255) NOT NULL UNIQUE,
                       standard INT,
                       info VARCHAR(255),
                       city_id BIGINT,
                       PRIMARY KEY (id),
                       FOREIGN KEY (city_id) REFERENCES city(id)
);


CREATE TABLE airport (
                         id BIGINT NOT NULL UNIQUE AUTO_INCREMENT,
                         name VARCHAR(255) NOT NULL UNIQUE,
                         city_id BIGINT,
                         PRIMARY KEY (id),
                         FOREIGN KEY (city_id) REFERENCES city(id)
);

