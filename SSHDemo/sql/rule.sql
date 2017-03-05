/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.12-log : Database - rule_engine
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rule_engine` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `rule_engine`;

/*Table structure for table `rule` */

DROP TABLE IF EXISTS `rule`;

CREATE TABLE `rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '规则ID',
  `userId` int(11) NOT NULL,
  `crontab` varchar(100) DEFAULT NULL COMMENT '时间表达式',
  `logExp` varchar(100) DEFAULT NULL COMMENT '日志表达式',
  `logTopic` varchar(30) DEFAULT NULL COMMENT '日志主题',
  `rules` text NOT NULL COMMENT '规则文本',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isEnabled` tinyint(1) DEFAULT '1' COMMENT '是否启用',
  `updateTime` datetime DEFAULT NULL,
  `name` varchar(50) NOT NULL COMMENT '规则名称',
  `description` varchar(100) DEFAULT NULL COMMENT '描述',
  `clientId` int(11) DEFAULT NULL COMMENT '分配的clientId',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `rule` */

insert  into `rule`(`id`,`userId`,`crontab`,`logExp`,`logTopic`,`rules`,`createTime`,`isEnabled`,`updateTime`,`name`,`description`,`clientId`) values (1,1036,'1234','test','ruleTopic','params:\r\n  appkey: 1234\r\n  secretKey:  12345\r\nFilter:\r\n  - type=list instances Ip=123&mem>50\r\nAction:\r\n  - methodname key:value&key:value\r\n  - $ip=methodname key:value&key:value\r\n  - type=for size=10 method=createInstance key:value&key:value\r\n  - type=list instances createSnapshot&Stop','2017-01-31 01:33:40',1,NULL,'test','test',NULL),(3,1036,NULL,NULL,NULL,'第四章  关系数据库设计理论wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\nThe page end\r\n\r\n目录wb!!!54wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\n2、设计要求wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\n1、关系库wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\n3、软件wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\nThe page end\r\n\r\n关系数据库设计理论就是借助于数学工具规定了一整套的关系数据库设计理论和方法wb!!!32wb!!!0wb!!!0wb!!!+mn-cswb!!!\r\n1、关系库wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\nThe page end\r\n\r\n本章主要内容：函数依赖规范化理论wb!!!32wb!!!0wb!!!0wb!!!wb!!!\r\n1、关系库wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\nThe page end\r\n\r\n简洁、清晰wb!!!32wb!!!0wb!!!0wb!!!+mn-cswb!!!\r\n2、设计要求wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\nThe page end\r\n\r\n关系结构无错wb!!!32wb!!!0wb!!!0wb!!!+mn-cswb!!!\r\n2、设计要求wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\nThe page end\r\n\r\nMySQLwb!!!32wb!!!0wb!!!0wb!!!+mn-cswb!!!\r\n3、软件wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\nThe page end\r\n\r\nMongDBwb!!!32wb!!!0wb!!!0wb!!!+mn-cswb!!!\r\n3、软件wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\nThe page end\r\n\r\nserverwb!!!32wb!!!0wb!!!0wb!!!+mn-cswb!!!\r\n3、软件wb!!!44wb!!!0wb!!!0wb!!!+mj-cswb!!!\r\nThe page end\r\n\r\n','2017-02-05 22:00:24',1,NULL,'zrain','zrain',NULL),(4,1036,'1488453796768','','','params:\r\n  appkey: 1234\r\n  secretKey:  12345\r\nFilter:\r\n  - type=list instances Ip=123&mem>50\r\nAction:\r\n  - methodname key:value&key:value\r\n  - $ip=methodname key:value&key:value\r\n  - type=for size=10 method=createInstance key:value&key:value\r\n  - type=list instances createSnapshot&Stop','2017-03-02 19:23:31',NULL,NULL,'zraingw','hgfweergstrhy',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
