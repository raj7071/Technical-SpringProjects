insert into user_details(id,birth_date,name)
values(10001, current_date(), 'Diogo');

insert into user_details(id,birth_date,name)
values(10002, current_date(), 'Luke');

insert into user_details(id,birth_date,name)
values(10003, current_date(), 'Manuel');


insert into post(id,description,user_id)
values(20001,'I want to win Premier League', 10001);

insert into post(id,description,user_id)
values(20002,'I want to win Champions League', 10001);

insert into post(id,description,user_id)
values(20003,'I want to win FA Cup', 10002);

insert into post(id,description,user_id)
values(20004,'I want to win FIFA Club World Cup', 10002);