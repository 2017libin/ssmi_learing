DROP TABLE mytable;
CREATE TABLE mytable(
   userid INT unsigned,
   married BOOLEAN
);

DROP TABLE mytable;
CREATE TABLE mytable(
   userid INT unsigned,
   married BOOL
);

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
