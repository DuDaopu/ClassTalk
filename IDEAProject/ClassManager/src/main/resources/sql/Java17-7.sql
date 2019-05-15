/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.5.60 : Database - java17-7
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`java17-7` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `java17-7`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `content` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`content`) values 
(1,'杜道普',NULL),
(2,'杜新征',NULL),
(3,'樊德草',NULL),
(4,'和文正',NULL),
(5,'姬帅庆',NULL),
(6,'蒋鹏龙',NULL),
(7,'李少奇',NULL),
(8,'李志枫',NULL),
(9,'李恣瑞',NULL),
(10,'刘世博',NULL),
(11,'刘致玮',NULL),
(12,'吕制颉',NULL),
(13,'买闪闪',NULL),
(14,'任振威',NULL),
(15,'邵新威',NULL),
(16,'王美美',NULL),
(17,'向宇星',NULL),
(18,'徐石豪',NULL),
(19,'薛涛',NULL),
(20,'杨朝军',NULL),
(21,'余亚威',NULL),
(22,'张邦阳',NULL),
(23,'张家利',NULL),
(24,'张金月',NULL),
(25,'张克强',NULL),
(26,'张丽娇',NULL),
(27,'张留欣',NULL),
(28,'张晴',NULL),
(29,'赵辉',NULL),
(30,'祝菡秀',NULL),
(31,'陆鹏',NULL),
(32,'李俊解',NULL),
(33,'王灿强',NULL),
(34,'贺鹏博',NULL),
(35,'陈喜林',NULL),
(36,'时霄剑',NULL),
(37,'柳超',NULL),
(38,'胡忠权',NULL),
(39,'曹鹏举',NULL),
(40,'王硕',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
