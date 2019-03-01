DROP DATABASE IF EXISTS ssmi;
CREATE DATABASE IF NOT EXISTS ssmi DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

USE ssmi;
SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT  COMMENT '主键id',
  `name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `deptid` int(20) COMMENT '部门id',
  `age` int(3) COMMENT '年龄',
  `email_address` varchar(50) COMMENT '邮箱地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';


DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(20) NOT NULL COMMENT '主键id',
  `name` varchar(50) DEFAULT NULL COMMENT '部门名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

insert into `ssmi`.`user`(`id`,`name`,`deptid`,`age`,`email_address`) values('1','user1',1,20,'user1@mail.com');
insert into `ssmi`.`user`(`id`,`name`,`deptid`,`age`,`email_address`) values('2','user2',1,20,'user2@mail.com');
insert into `ssmi`.`user`(`id`,`name`,`deptid`,`age`,`email_address`) values('3','user3',1,20,'user3@mail.com');
insert into `ssmi`.`user`(`id`,`name`,`deptid`,`age`,`email_address`) values('4','user4',2,20,'user4@mail.com');


insert into `ssmi`.`dept`(`id`,`name`) values('1','IT');
insert into `ssmi`.`dept`(`id`,`name`) values('2','HR');




DROP TABLE IF EXISTS `user_chp12`;
CREATE TABLE `user_chp12` (
  `id` int(20) NOT NULL COMMENT '主键id',
  `name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `contactInfoType` varchar(50) COMMENT '联系类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

DROP TABLE IF EXISTS `email_contact`;
CREATE TABLE `email_contact` (
  `id` int(20) NOT NULL COMMENT '主键id',
  `email_address` varchar(50) DEFAULT NULL COMMENT '邮箱地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='邮箱联系方式';

DROP TABLE IF EXISTS `phone_contact`;
CREATE TABLE `phone_contact` (
  `id` int(20) NOT NULL COMMENT '主键id',
  `phone_no` varchar(50) DEFAULT NULL COMMENT '电话号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='电话联系方式';


insert into `ssmi`.`user_chp12`(`id`,`name`,`contactInfoType`) values('1','user1','email');
insert into `ssmi`.`user_chp12`(`id`,`name`,`contactInfoType`) values('2','user2','phone');

insert into `ssmi`.`email_contact`(`id`,`email_address`) values('1','user1@email.com');
insert into `ssmi`.`phone_contact`(`id`,`phone_no`) values('1','13888888888');






DROP TABLE IF EXISTS `dept_mybatis`;
CREATE TABLE `dept_mybatis` (
  `deptid` varchar(50) NOT NULL COMMENT '主键id',
  `deptname` varchar(50) DEFAULT NULL COMMENT '部门名',
  `deptleaderid` varchar(50) COMMENT '部门主管id',
  PRIMARY KEY (`deptid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

DROP TABLE IF EXISTS `user_mybatis`;
CREATE TABLE `user_mybatis` (
  `userid`  varchar(50) NOT NULL COMMENT '用户id',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age`  int(20) COMMENT '年龄',
  `deptid`  varchar(50) NOT NULL COMMENT '所属部门id',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

insert into `ssmi`.`dept_mybatis`(`deptid`,`deptname`,`deptleaderid`) values('dept0001','IT','user0001');
insert into `ssmi`.`dept_mybatis`(`deptid`,`deptname`,`deptleaderid`) values('dept0002','HR','user0002');
insert into `ssmi`.`user_mybatis`(`userid`,`username`,`age`,`deptid`) values('user0001','user 1',30,'dept0001');
insert into `ssmi`.`user_mybatis`(`userid`,`username`,`age`,`deptid`) values('user0002','user 2',40,'dept0002');
insert into `ssmi`.`user_mybatis`(`userid`,`username`,`age`,`deptid`) values('user0003','user 3',31,'dept0001');


----------------------------------------------------------------------

DROP TABLE IF EXISTS `gen_user`;
CREATE TABLE `gen_user` (
  `id` int(20) NOT NULL COMMENT '主键id',
  `user_type` varchar(50) DEFAULT NULL COMMENT '用户类型',
  `emp_id` varchar(50) COMMENT '员工号',
  `dept` varchar(50) COMMENT '部门',
  `company` varchar(50) COMMENT '外包公司',
  `vendor_account` varchar(50) COMMENT '外包账号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

insert into `ssmi`.`gen_user`(`id`,`user_type`,`emp_id`,`dept`,`company`,`vendor_account`) values(1,'employee','0001','IT','','');
insert into `ssmi`.`gen_user`(`id`,`user_type`,`emp_id`,`dept`,`company`,`vendor_account`) values(2,'outsource','','','Google','vend001');
Go