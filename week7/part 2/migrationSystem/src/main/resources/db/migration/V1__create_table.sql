drop table if exists users;

create table users (
                       id bigint not null auto_increment,
                       user_name varchar(255) not null,
                       first_name varchar(255) not null ,
                       last_name varchar(255) not null ,
                       email varchar(255) not null ,
                       primary key (id));