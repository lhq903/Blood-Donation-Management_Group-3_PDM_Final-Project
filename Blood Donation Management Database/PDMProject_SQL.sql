create database PDMProject;

Use[PDMProject]
go

create table Donor (
	ID int IDENTITY (1,1) NOT NULL,
	did AS ('D'+RIGHT('0000'+CAST (ID AS VARCHAR (4)),4)) PERSISTED not null,
	dname varchar(50) not null,
	gender smallint not null,
	dob date not null,
	age int not null check(age >= 18 and age <= 75),
	phone char(10) not null unique,
	email varchar(50) not null,
	address varchar(100),
	password varchar(200) not null,
	blood_type varchar(5) not null,
	med_cond varchar(200),
	primary key (did)
);

create table BloodBank (
	bid char(5) not null,
	bname varchar(50) not null,
	address varchar(100) not null,
	operating_hrs varchar(20) not null,
	primary key (bid)
);

create table BloodStock (
	ID int IDENTITY (1,1) NOT NULL,
	bsid AS ('BS'+RIGHT('0000'+CAST (ID AS VARCHAR (4)),4)) PERSISTED not null,
	did varchar(5) not null,
	bid char(5) not null,
	input_date date not null,
	blood_type varchar(5) not null,
	volume int not null,
	exp_date date not null,
	isOrdered int not null default 0,
	primary key (bsid),
	foreign key (did) references Donor,
	foreign key (bid) references BloodBank
);

create table Hospital (
	hid char(5) not null,
	hname varchar(50) not null,
	address varchar(100) not null,
	email varchar(50) not null,
	phone char(10) not null,
	coor_name varchar(50) not null,
	password varchar(200) not null,
	primary key (hid)
);

create table Patient (
	ID int IDENTITY (1,1) NOT NULL,
	pid AS ('P'+RIGHT('0000'+CAST (ID AS VARCHAR (4)),4)) PERSISTED not null,
	hid char(5) not null,
	pname varchar(50) not null,
	gender varchar(10) not null,
	dob date not null,
	age int not null,
	email varchar(50) not null,
	phone char(10) not null unique,
	address varchar(100) not null,
	med_cond varchar(200) not null,
	blood_type varchar(5) not null,
	health_ins varchar(50) not null,
	primary key (pid),
	foreign key (hid) references Hospital
);

create table Staff (
	sid char(5) not null,
	bid char(5) not null,
	sname varchar(50) not null,
	address varchar(100) not null,
	email varchar(50) not null,
	phone char(10) not null,
	degree varchar(50) not null,
	department varchar(50) not null,
	primary key (sid),
	foreign key (bid) references BloodBank
);

create table Ordered (
	hid char(5) not null,
	bsid varchar(6) not null,
	orderDate Date not null,
	isTransfused int not null default 0,
	primary key (bsid),
	foreign key (hid) references Hospital,
	foreign key (bsid) references BloodStock,
);

create table Transfuse (
	pid varchar(5) not null,
	bsid varchar(6) not null,
	transfuseDate Date not null,
	primary key (bsid),
	foreign key (pid) references Patient,
	foreign key (bsid) references BloodStock
);