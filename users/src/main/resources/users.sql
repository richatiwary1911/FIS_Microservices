use test;

create table role (ro_id int, ro_name varchar(20));
create table user (us_id int, us_username varchar(20), us_password varchar(20));

create table user_role(ur_ro_id int, ur_us_id int);