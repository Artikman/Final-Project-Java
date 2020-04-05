CREATE DATABASE shoppingcart;

-- auto-generated definition
create table accounts
(
  User_Name varchar(20) not null
    primary key,
  Active    bit         not null,
  Password  varchar(20) not null,
  User_Role varchar(20) not null
);

-- auto-generated definition
create table depository
(
  depository_id int auto_increment
    primary key,
  goods         varchar(255) not null,
  quantity      int(4)       not null,
  provider      varchar(25)  not null
);

-- auto-generated definition
create table order_details
(
  ID         varchar(50) not null
    primary key,
  Amount     double      not null,
  Price      double      not null,
  Quanity    int         not null,
  ORDER_ID   varchar(50) not null,
  PRODUCT_ID varchar(20) not null,
  constraint ORDER_DETAIL_ORD_FK
    foreign key (ORDER_ID) references orders (ID),
  constraint ORDER_DETAIL_PROD_FK
    foreign key (PRODUCT_ID) references products (Code)
);

-- auto-generated definition
create table orders
(
  ID               varchar(50)  not null
    primary key,
  Amount           double       not null,
  Customer_Address varchar(255) not null,
  Customer_Email   varchar(128) not null,
  Customer_Name    varchar(255) not null,
  Customer_Phone   varchar(128) not null,
  Order_Date       datetime     not null,
  Order_Num        int          not null,
  constraint UK_sxhpvsj665kmi4f7jdu9d2791
    unique (Order_Num)
);

-- auto-generated definition
create table products
(
  Code        varchar(20)  not null
    primary key,
  Create_Date datetime     not null,
  Image       longblob     null,
  Name        varchar(255) not null,
  Price       double       not null
);