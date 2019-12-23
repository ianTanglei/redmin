DROP TABLE IF EXISTS `redmin_redis_paramter`;
CREATE TABLE `redmin_redis_paramter` (
  `id` int(8) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(64) NOT NULL,
  `value` varchar(1024) NOT NULL,
  `type` tinyint(1) NOT NULL,
  `desc` varchar(256) NOT NULL,
  `category` varchar(32) NOT NULL DEFAULT '系统参数',
  `create_time` date NOT NULL,
  `updaye_time` date DEFAULT NULL,
  `expire_time` date NOT NULL,
  `status` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000000 DEFAULT CHARSET=utf8;

