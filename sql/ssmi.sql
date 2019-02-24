DROP DATABASE IF EXISTS dashx;
CREATE DATABASE IF NOT EXISTS dashx DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

USE dashx;
SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `base_chart`;
CREATE TABLE `base_chart` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '����id',
  `name` varchar(50) DEFAULT NULL COMMENT 'ͼ������',
  `description` text COMMENT '����',
  --`create_time` datetime DEFAULT NULL COMMENT '����ʱ��',
  --`update_time` datetime DEFAULT NULL COMMENT '����ʱ��',
  --`creator` varchar(36) COMMENT '������',
  --`updater` varchar(36) COMMENT '������',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='ͼ��';

insert into `dashx`.`base_chart`(`name`,`description`) values('Hello World Chart','This is First Dashx Chart');