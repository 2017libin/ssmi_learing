CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '����id',
  `name` varchar(50) DEFAULT NULL COMMENT '�û���',
  `deptid` int(20) DEFAULT NULL COMMENT '����id',
  `age` int(3) DEFAULT NULL COMMENT '����',
  `email_address` varchar(50) DEFAULT NULL COMMENT '�����ַ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='�û���'
