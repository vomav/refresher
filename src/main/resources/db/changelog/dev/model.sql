DROP TABLE IF EXISTS db_Users;

CREATE TABLE db_Users (
  ID VARCHAR(36) NOT NULL,
  email VARCHAR(64),
  name VARCHAR(128),
  surname VARCHAR(128),
  currentTenant_ID VARCHAR(36),
  password VARCHAR(128),
  previousPassword VARCHAR(128),
  refreshToken VARCHAR(2048),
  isActivated BOOLEAN,
  PRIMARY KEY(ID)
);
