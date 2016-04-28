--APACHE DERBY SQL FILE FOR RESTUARANT AUTOMATION SOFTWARE
#works with customer stuff
create table tables(
	tableStatus varChar(1),
	tableNumber INT,
	CONSTRAINT pk_tableNumber PRIMARY KEY (tableNumber);
);

create table menu(
	itemName varChar (20),
	price INT
	CONSTRAINT pk_itemName PRIMARY KEY (itemName);
);

create table orders(
	orderID INT,
	qty INT,
	itemName varChar(20),
    CONSTRAINT pk_orderID PRIMARY KEY (orderID),
	CONSTRAINT fk_itemName FOREIGN KEY (itemName)
	REFERENCES menu	(itemName)
);

#modify for
alter table orders
add tableNumber int

alter table orders
add constraint fk_tableNum FOREIGN KEY (tableNumber)
references tables(tableNumber
/* removed in database redesign
create table bill(
	total int,
    tableNumber int,
    orderID int,
	CONSTRAINT pk_bill PRIMARY KEY (tableNumber, orderID),
	CONSTRAINT fk_tablesorder FOREIGN KEY (tableNumber)
		REFERENCES tables (tableNumber),
    CONSTRAINT fk_orders FOREIGN KEY  (orderID)
        REFERENCES orders (orderID)
);*/




#some test data
#10 tables all clean
insert into tables values ('c', 1);
insert into tables values ('c', 2);
insert into tables values ('c', 3);
insert into tables values ('c', 4);
insert into tables values ('c', 5);
insert into tables values ('c', 6);
insert into tables values ('c', 7);
insert into tables values ('c', 8);
insert into tables values ('c', 9);
insert into tables values ('c', 10);
