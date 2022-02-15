DROP DATABASE IF EXISTS sewing_business;
CREATE DATABASE sewing_business;
USE sewing_business;

DROP TABLE IF EXISTS products;

CREATE TABLE products (
  product_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  category_id int(11) NOT NULL,
  size_id int(11) NOT NULL,
  price decimal(11,2) NOT NULL,
  textile_id int(11) NOT NULL,
  quantity_in_stock int(11) NOT NULL,
  PRIMARY KEY (product_id),
  FOREIGN KEY (category_id) REFERENCES product_categories(category_id),
  FOREIGN KEY (size_id) REFERENCES product_sizes(size_id),
  FOREIGN KEY (textile_id) REFERENCES textile(textile_id)
);

CREATE TABLE product_categories (
	category_id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    PRIMARY KEY (category_id)
);

CREATE TABLE product_sizes(
	size_id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    PRIMARY KEY (size_id)
);

CREATE TABLE textile (
	textile_id int(11) NOT NULL AUTO_INCREMENT,
    color_id int(11) NOT NULL,
    price decimal(11,2) NOT NULL,
    footage decimal(11,2) NOT NULL,
    seller_id int(11) NOT NULL,
    PRIMARY KEY (textile_id),
    FOREIGN KEY (color_id) REFERENCES textile_colors(color_id),
    FOREIGN KEY (seller_id) REFERENCES textile_sellers(seller_id)
);

CREATE TABLE textile_colors(
	color_id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    PRIMARY KEY (color_id)
);

CREATE TABLE textile_sellers(
	seller_id int(11) NOT NULL AUTO_INCREMENT,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    email varchar(50),
    phone_number varchar(50) NOT NULL,
    address varchar(50) NOT NULL,
    PRIMARY KEY (seller_id)
);

CREATE TABLE employees(
	employee_id int(11) NOT NULL AUTO_INCREMENT,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    salary int(11) NOT NULL,
    position_id int(11) NOT NULL,
    PRIMARY KEY (employee_id),
    FOREIGN KEY (position_id) REFERENCES employee_positions(position_id)
);

CREATE TABLE employee_positions (
	position_id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    PRIMARY KEY (position_id)
);

CREATE TABLE customers (
  customer_id int(11) NOT NULL AUTO_INCREMENT,
  first_name varchar(50) NOT NULL,
  last_name varchar(50) NOT NULL,
  phone_number varchar(50) DEFAULT NULL,
  email varchar(50),
  city varchar(50) NOT NULL,
  country varchar(50) NOT NULL,
  PRIMARY KEY (customer_id)
);

CREATE TABLE orders (
	order_id int(11) NOT NULL AUTO_INCREMENT,
    customer_id int(11) NOT NULL,
    order_item_id int(11) NOT NULL,
    PRIMARY KEY (order_id),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    FOREIGN KEY (order_item_id) REFERENCES order_items(order_item_id)
);

CREATE TABLE order_items (
	order_item_id int(11) NOT NULL AUTO_INCREMENT,
    product_id int(11) NOT NULL,
    quantity int(11) NOT NULL,
    order_date date NOT NUll,
    order_status_id int(11) NOT NULL,
    ship_item_id int(11) NOT NULL,
    payment_item_id int(11) NOT NULL,
    PRIMARY KEY (order_item_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id),
    FOREIGN KEY (order_status_id) REFERENCES order_statuses(order_status_id),
    FOREIGN KEY (ship_item_id) REFERENCES ship_items(ship_item_id),
    FOREIGN KEY (payment_item_id) REFERENCES payment_items(payment_item_id)
);

CREATE TABLE order_statuses (
  order_status_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  PRIMARY KEY (order_status_id)
);

CREATE TABLE ship_items (
	ship_item_id int(11) NOT NULL AUTO_INCREMENT,
    ship_status_id int(11) NOT NULL,
    shipper_id int(11) NOT NULL,
    shipped_date date NOT NUll,
    PRIMARY KEY (ship_item_id),
    FOREIGN KEY (ship_status_id) REFERENCES ship_statuses(ship_status_id),
    FOREIGN KEY (shipper_id) REFERENCES shippers(shipper_id)
);

CREATE TABLE ship_statuses (
  ship_status_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  PRIMARY KEY (ship_status_id)
);

CREATE TABLE shippers (
  shipper_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  PRIMARY KEY (shipper_id)
);

CREATE TABLE payment_items (
	payment_item_id int(11) NOT NULL AUTO_INCREMENT,
    payment_status_id int(11) NOT NULL,
    payment_total decimal (11,2) NOT NULL,
    customer_id int(11) NOT NULL,
    due_date date NOT NUll,
    PRIMARY KEY (payment_item_id),
    FOREIGN KEY (payment_status_id) REFERENCES payment_statuses(payment_status_id),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

CREATE TABLE payment_statuses (
  payment_status_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  PRIMARY KEY (payment_status_id)
);











