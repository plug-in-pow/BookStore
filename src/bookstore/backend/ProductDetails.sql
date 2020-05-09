Create table Product(
product_id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
product_name varchar(50) NOT NULL,
describe varchar(128) NOT NULL,
price int NOT NULL,
stock int NOT NULL,
product_image image,
seller_name varchar(50))

Alter table Product modify describe varchar(128)
ALTER TABLE Product
ADD seller_name varchar(50);

create table test(
dess varchar(500) )
insert into test (dess) values('This textbook of Chemistry has been designed with the aim to explore the significance of the philosophy of chemistry and also recommends strategies that simplify the learning process so that the aspirants have a better conceptual understanding of different scientific processes.')

select * from Product
select * from test
delete from test

DROP TABLE Product;
DROP TABLE test;