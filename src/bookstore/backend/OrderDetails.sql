Create table Order_Detail(
order_id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
product_id int NOT NULL,
product_name varchar(50) NOT NULL,
price int NOT NULL,
seller_name varchar(50),
addr varchar(120) NOT NULL,
customer_name varchar(50) NOT NULL,
email varchar(40) NOT NULL,
phone varchar(15) NOT NULL,
isDeliver varchar(15) NOT NULL,
customer_username varchar(50) NOT NULL )

Select * from Order_Detail

Drop table Order_Detail
