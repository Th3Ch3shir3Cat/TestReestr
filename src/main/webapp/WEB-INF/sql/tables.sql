create table Event_Bank (
	bankId LONG not null primary key,
	name VARCHAR(75) null,
	bik VARCHAR(75) null,
	address VARCHAR(75) null
);

create table Event_Position (
	positionId LONG not null primary key,
	name VARCHAR(75) null,
	archived BOOLEAN
);

create table Event_Worker (
	workerId LONG not null primary key,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	gender VARCHAR(75) null,
	dateOfBirth VARCHAR(75) null,
	positionId LONG,
	employmentDate VARCHAR(75) null,
	salaryLevel VARCHAR(75) null,
	numberWorkPhone VARCHAR(75) null,
	numberHomePhone VARCHAR(75) null,
	bankId LONG,
	archived BOOLEAN
);