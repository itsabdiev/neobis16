CREATE TABLE Clients (
			id int PRIMARY KEY,
            name varchar(255) not null,
            email varchar(200) unique,
			contact varchar(60) unique,
            card_credentials varchar(60) not null unique,
            client_role_id int not null
);
CREATE TABLE Donuts (
			id int PRIMARY KEY,
            name varchar(255) not null,
			price int not null,
            image longblob not null,
            description varchar(255) not null,
            ingredients json not null
);
CREATE TABLE Order_Statuses (    
            id int PRIMARY KEY, 
            status_name varchar(60) not null 
    
);
CREATE TABLE Client_Roles (
			id int PRIMARY KEY,
            role_name varchar(60) not null
);
CREATE TABLE Orders (
			id int PRIMARY KEY,
            all_donuts json not null,
            order_price int not null,
            address varchar(200) not null,
            created_time date not null,
            order_status_id int not null,
            client_id int not null
);



