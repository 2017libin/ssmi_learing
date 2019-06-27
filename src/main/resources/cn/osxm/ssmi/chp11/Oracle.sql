CREATE TABLE my_user(
   userid INT,
   username VARCHAR(20),
   userlevel INT unsigned
);

select STATUS,MACHINE,OSUSER,PROGRAM from v$session where USERNAME='OSCAR999';
select STATUS,STATE,WAIT_CLASS MACHINE,OSUSER,PROGRAM from v$session where USERNAME='OSCAR999';
select * from v$session where USERNAME='OSCAR999';