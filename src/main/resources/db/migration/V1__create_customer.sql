DROP TABLE IF EXISTS customer;

CREATE TABLE IF NOT EXISTS customer (
  uuid UUID  PRIMARY KEY,
  name varchar(100) NOT NULL,
  email varchar(100) NOT NULL,
  mobile_number varchar(20) NOT NULL,
  create_date timestamp DEFAULT NULL
);