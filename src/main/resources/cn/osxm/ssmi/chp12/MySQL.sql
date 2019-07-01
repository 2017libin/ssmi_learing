CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `deptid` int(20) DEFAULT NULL COMMENT '部门id',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `email_address` varchar(50) DEFAULT NULL COMMENT '邮箱地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='用户表'
