DROP TABLE mytable;
CREATE TABLE mytable(
   userid INT unsigned,
   married BOOLEAN
);

--Save Engine
DROP TABLE mytable;
CREATE TABLE mytable(
   userid INT unsigned,
   married BOOL
)ENGINE=InnoDB;
ALTER TABLE mytable engine=MyISAM;
SHOW CREATE TABLE mytable;
SHOW TABLE status;
SHOW ENGINES;

DROP TABLE mytable;
CREATE TABLE mytable(
   userid INT unsigned,
   married TINYINT(1)
);


--Store Procedure
delimiter //
create procedure my_procedure(out p_out int)
begin
	select p_out;
	set p_out=100;
	select p_out;
end 
//
delimiter ;

call my_procedure(@p_out);


DROP TABLE my_user;
CREATE TABLE my_user(
   userid INT unsigned,
   username VARCHAR(20),
   userlevel INT unsigned
);

delete from my_user;
select * from my_user;
insert into my_user(userid,username) values(1,'Zhang San');
insert into my_user(userid,username) values(2,'Li Si');

--触发器
drop trigger my_trigger;
delimiter //
create trigger my_trigger
before insert on my_user
for each row
begin
	set new.userlevel = 1;
end;
//
delimiter ;

drop trigger my_log_trigger;
delimiter //
create trigger my_log_trigger
after insert on my_user
for each row
begin
	//
end;
//
delimiter ;



create trigger my_triggerName  
after/before insert/update/delete on 表名  
for each row   #这句话在mysql是固定的  
begin  
    sql语句;  
end;  


create trigger tg2
after insert on o
for each row 
begin
update g set num=num-new.much where id=new.gid;(注意此处和第一个触发器的不同)
end$
