/*项目表*/
DROP TABLE IF EXISTS `interface_test_project`;
CREATE TABLE `interface_test_project` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(128) NOT NULL COMMENT '项目名',
  `description` varchar(256) COMMENT '项目描述',
  `prefixUrl` varchar(256) NOT NULL COMMENT '前缀url',
  `createTime` datetime COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*接口表*/
DROP TABLE IF EXISTS `interface_test_url`;
CREATE TABLE `interface_test_url` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `projectId` int(11) NOT NULL COMMENT '项目id',
  `url` varchar(128) COMMENT '接口url',
  `method` enum('getpost', 'get', 'post') COMMENT '请求方法',
  `description` varchar(256) COMMENT '接口描述',
  KEY `projectId` (`projectId`),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*参数表*/
DROP TABLE IF EXISTS `interface_test_param`;
CREATE TABLE `interface_test_param` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `urlId` int(11) NOT NULL COMMENT '链接id',
  `name` varchar(128) COMMENT '参数名',
  `type` enum('int', 'float', 'string') COMMENT '参数类型',
  `required` bit(1) COMMENT '是否必须的',
  `defaultValue` varchar(128) COMMENT '默认值',
  `description` varchar(256) COMMENT '参数描述',
  KEY `urlId` (`urlId`),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

show tables;
