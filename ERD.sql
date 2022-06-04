create table [Role](
	RoleID Int not null Identity(1,1) primary key,
	RoleName varchar(20) not null
)

create table [User](
	Username varchar(50) primary key not null,
	[Password] varchar(150) not null,
	RoleID Int not null foreign key references [Role](RoleID)
)


create table [Profile](
	Username varchar(50) primary key not null foreign key references [User](Username),
	FirstName varchar(50) not null,
	LastName varchar(50) null,
	[Address] varchar(max) not null,
	Balance money not null default 0
)

create table Category(
	CategoryID Int not null Identity(1,1) primary key,
	CategoryName varchar(50) not null
)

create table Product(
	ProductID Int not null Identity(1,1) primary key,
	ProductName varchar(50) not null,
	SellerID varchar(50) not null foreign key references [User](Username),
	CategoryID Int not null foreign key references Category(CategoryID),
	Price money not null,
	[Description] varchar(max) null,
	Discontinue bit not null default 0
)

create table Shipment(
	ShipmentID Int not null Identity(1,1) primary key,
	ShipmentName varchar(50) not null,
	Price money not null,
	IsActive bit not null default 1
)

create table [Cart](
	CartID Int not null Identity(1,1) primary key,
	BuyerID varchar(50) not null foreign key references [User](Username)
)

create table [CartDetail](
	CartDetailID Int not null Identity(1,1) primary key, 
	CartID int not null foreign key references Cart(CartID),
	ProductID Int not null foreign key references Product(ProductID),
	ShipmentID Int not null foreign key references Shipment(ShipmentID),
	Quantity Int not null default 1
)

create table [Transaction](
	TransactionID Int not null Identity(1,1) primary key,
	TransactionDate datetime not null,
	BuyerID varchar(50) not null foreign key references [User](Username),
	SellerName varchar (50),
	ProductName varchar (100) ,
	ShipmentName varchar (50),
	Quantity Int not null,
	TotalPrice money not null,
)


