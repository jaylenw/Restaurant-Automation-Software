--APACHE DERBY SQL FILE FOR RESTUARANT AUTOMATION SOFTWARE
#works with customer stuff
create table tables(
	tableStatus varChar(1),
	tableNumber INT
	CONSTRAINT pk_tableNumber PRIMARY KEY (tableNumber);
);

create table menu(
	itemName varChar (40),
	price INT
	CONSTRAINT pk_itemName PRIMARY KEY (itemName);
);

create table order(
	orderID INT,
	qty INT
	CONSTRAINT fk_itemName FOREIGN KEY (itemName);
);

create table bill(
	INT total
	CONSTRAINT fk_tablesorder FOREIGN KEY (tableNumber, orderID);
)