create table Customer(
Customer_id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
Name varchar(50) NOT NULL,
Addr varchar(120) NOT NULL,
Mob_no varchar(15) NOT NULL,
Gender varchar(10) NOT NULL,
Email_id varchar(40) NOT NULL,
Username varchar(20) NOT NULL,
Pass varchar(20) NOT NULL)

create table Seller(
Seller_id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
Compnay_name varchar(50) NOT NULL,
Addr varchar(120) NOT NULL,
Mob_no varchar(15) NOT NULL,
Gender varchar(10) NOT NULL,
Email_id varchar(40) NOT NULL,
Username varchar(20) NOT NULL,
Pass varchar(20) NOT NULL)

ALTER TABLE "Customer"
ALTER COLUMN Addr varchar(120);

Select * from Customer
Select * from Seller

DELETE FROM Customer WHERE Customer_id=1;

Drop table Seller

Select Username from Customer

Select Pass from Customer where Username='Mayank';