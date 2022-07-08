create sequence donut_sequence start 1 increment 1;
create table donuts(id int8 not null,description TEXT not null,name TEXT not null,picture TEXT not null,price int4 not null, primary key (id));