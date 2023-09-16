DROP TABLE IF EXISTS account;

CREATE TABLE IF NOT EXISTS account (
  uuid UUID  PRIMARY KEY,
  customer_uuid UUID,
  account_type varchar(100) NOT NULL,
  branch_address varchar(200) NOT NULL,
  create_date timestamp DEFAULT NULL
);