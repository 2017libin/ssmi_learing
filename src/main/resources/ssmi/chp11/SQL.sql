USE ssmi;


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




---------用户表
DROP TABLE my_user;
CREATE TABLE my_user(
   userid INT unsigned,
   username VARCHAR(20),
   userlevel INT unsigned
);

DELETE FROM my_user;
SELECT * FROM my_user;
INSERT INTO my_user(userid,username) VALUES(1,'Zhang San');
INSERT INTO my_user(userid,username) VALUES(2,'Li Si');


---------日志表
DROP TABLE my_log;
CREATE TABLE my_log(
   fieldname VARCHAR(100),
   newvalue VARCHAR(100),
   oldvalue VARCHAR(100)
);






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

UPDATE my_user SET username='Wang Wu' WHERE userid=1;
DROP TRIGGER mylog_trigger;
DELIMITER //
CREATE TRIGGER mylog_trigger
BEFORE UPDATE ON my_user
FOR EACH ROW
BEGIN
	INSERT INTO my_log(fieldname,newvalue,oldvalue) VALUES('username',new.username,old.username);
END;
//
DELIMITER ;


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



--Store Procedure
DELIMITER //
CREATE PROCEDURE my_procedure(out p_out int)
begin
	set p_out=100;
end 
//
DELIMITER ;
CALL my_procedure(@p_out);
SELECT @p_out;


DROP PROCEDURE  my_procedure;
DELIMITER //
CREATE PROCEDURE my_procedure(out p_out int)
begin
	select p_out;
	set p_out=100;
	select p_out;
end 
//
DELIMITER ;
call my_procedure(@p_out);

DROP PROCEDURE  my_procedure;
DELIMITER //
CREATE PROCEDURE my_procedure(out p_out varchar)
begin
	set p_out='111';
end 
//
DELIMITER ;
call my_procedure(@p_out);



	select username as p_out from my_user where userid=1;




