CREATE DATABASE Account
USE Account

CREATE TABLE Account(
	UserName VARCHAR(50),
	Pass CHAR(20),
	Confirmpass CHAR(20),
	SDT CHAR(11)
)
INSERT INTO Account(UserName,Pass,Confirmpass,SDT)
VALUES ('dinhkhachoat','20200184','20200184','0972637223'),
	   ('tranductien','20200781', '20200781','0987633321'),
	   ('daovietbao','20200910','20200910','0978234765')
