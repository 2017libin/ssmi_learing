DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '�û�id',
  `name` varchar(50) DEFAULT NULL COMMENT '�û���',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�û���';

insert into `ssmi`.`user`(`id`,`name`) values('001','Chen Oscar');