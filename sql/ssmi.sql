DROP DATABASE IF EXISTS ssmi;
CREATE DATABASE IF NOT EXISTS ssmi DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

USE ssmi;
SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT  COMMENT '����id',
  `name` varchar(50) DEFAULT NULL COMMENT '�û���',
  `deptid` int(20) COMMENT '����id',
  `age` int(3) COMMENT '����',
  `email_address` varchar(50) COMMENT '�����ַ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�û���';


DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(20) NOT NULL COMMENT '����id',
  `name` varchar(50) DEFAULT NULL COMMENT '������',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���ű�';

insert into `ssmi`.`user`(`id`,`name`,`deptid`,`age`,`email_address`) values('1','user1',1,20,'user1@mail.com');
insert into `ssmi`.`user`(`id`,`name`,`deptid`,`age`,`email_address`) values('2','user2',1,20,'user2@mail.com');
insert into `ssmi`.`user`(`id`,`name`,`deptid`,`age`,`email_address`) values('3','user3',1,20,'user3@mail.com');
insert into `ssmi`.`user`(`id`,`name`,`deptid`,`age`,`email_address`) values('4','user4',2,20,'user4@mail.com');


insert into `ssmi`.`dept`(`id`,`name`) values('1','IT');
insert into `ssmi`.`dept`(`id`,`name`) values('2','HR');




DROP TABLE IF EXISTS `user_chp12`;
CREATE TABLE `user_chp12` (
  `id` int(20) NOT NULL COMMENT '����id',
  `name` varchar(50) DEFAULT NULL COMMENT '�û���',
  `contactInfoType` varchar(50) COMMENT '��ϵ����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�û���';

DROP TABLE IF EXISTS `email_contact`;
CREATE TABLE `email_contact` (
  `id` int(20) NOT NULL COMMENT '����id',
  `email_address` varchar(50) DEFAULT NULL COMMENT '�����ַ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='������ϵ��ʽ';

DROP TABLE IF EXISTS `phone_contact`;
CREATE TABLE `phone_contact` (
  `id` int(20) NOT NULL COMMENT '����id',
  `phone_no` varchar(50) DEFAULT NULL COMMENT '�绰����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�绰��ϵ��ʽ';


insert into `ssmi`.`user_chp12`(`id`,`name`,`contactInfoType`) values('1','user1','email');
insert into `ssmi`.`user_chp12`(`id`,`name`,`contactInfoType`) values('2','user2','phone');

insert into `ssmi`.`email_contact`(`id`,`email_address`) values('1','user1@email.com');
insert into `ssmi`.`phone_contact`(`id`,`phone_no`) values('1','13888888888');






DROP TABLE IF EXISTS `dept_mybatis`;
CREATE TABLE `dept_mybatis` (
  `deptid` varchar(50) NOT NULL COMMENT '����id',
  `deptname` varchar(50) DEFAULT NULL COMMENT '������',
  `deptleaderid` varchar(50) COMMENT '��������id',
  PRIMARY KEY (`deptid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���ű�';

DROP TABLE IF EXISTS `user_mybatis`;
CREATE TABLE `user_mybatis` (
  `userid`  varchar(50) NOT NULL COMMENT '�û�id',
  `username` varchar(50) DEFAULT NULL COMMENT '�û���',
  `age`  int(20) COMMENT '����',
  `deptid`  varchar(50) NOT NULL COMMENT '��������id',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�û���';

insert into `ssmi`.`dept_mybatis`(`deptid`,`deptname`,`deptleaderid`) values('dept0001','IT','user0001');
insert into `ssmi`.`dept_mybatis`(`deptid`,`deptname`,`deptleaderid`) values('dept0002','HR','user0002');
insert into `ssmi`.`user_mybatis`(`userid`,`username`,`age`,`deptid`) values('user0001','user 1',30,'dept0001');
insert into `ssmi`.`user_mybatis`(`userid`,`username`,`age`,`deptid`) values('user0002','user 2',40,'dept0002');
insert into `ssmi`.`user_mybatis`(`userid`,`username`,`age`,`deptid`) values('user0003','user 3',31,'dept0001');


----------------------------------------------------------------------

DROP TABLE IF EXISTS `gen_user`;
CREATE TABLE `gen_user` (
  `id` int(20) NOT NULL COMMENT '����id',
  `user_type` varchar(50) DEFAULT NULL COMMENT '�û�����',
  `emp_id` varchar(50) COMMENT 'Ա����',
  `dept` varchar(50) COMMENT '����',
  `company` varchar(50) COMMENT '�����˾',
  `vendor_account` varchar(50) COMMENT '����˺�',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�û���';

insert into `ssmi`.`gen_user`(`id`,`user_type`,`emp_id`,`dept`,`company`,`vendor_account`) values(1,'employee','0001','IT','','');
insert into `ssmi`.`gen_user`(`id`,`user_type`,`emp_id`,`dept`,`company`,`vendor_account`) values(2,'outsource','','','Google','vend001');
Go