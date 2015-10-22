/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50543
Source Host           : localhost:3306
Source Database       : stock

Target Server Type    : MYSQL
Target Server Version : 50543
File Encoding         : 65001

Date: 2015-10-22 18:55:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bankroll
-- ----------------------------
DROP TABLE IF EXISTS `bankroll`;
CREATE TABLE `bankroll` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stock_code` varchar(10) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  `month` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `mainForce_in` varchar(255) DEFAULT NULL COMMENT '主力',
  `mainForce_out` varchar(255) DEFAULT NULL,
  `large_in` varchar(255) DEFAULT NULL COMMENT '超大单',
  `large_out` varchar(255) DEFAULT NULL,
  `big_in` varchar(255) DEFAULT NULL,
  `big_out` varchar(255) DEFAULT NULL,
  `medium_in` varchar(255) DEFAULT NULL,
  `medium_out` varchar(255) DEFAULT NULL,
  `small_in` varchar(255) DEFAULT NULL,
  `small_out` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `code_date` (`stock_code`,`date`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5573 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3499 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for stock_info
-- ----------------------------
DROP TABLE IF EXISTS `stock_info`;
CREATE TABLE `stock_info` (
  `id` varchar(36) NOT NULL,
  `closing` double(10,2) DEFAULT NULL,
  `open` double(20,2) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `code` varchar(10) DEFAULT NULL,
  `lowest` double(20,2) DEFAULT NULL,
  `highest` double(10,2) DEFAULT NULL,
  `current` double(10,2) DEFAULT NULL,
  `preClose` double(20,2) DEFAULT NULL,
  `vol` double(32,0) DEFAULT NULL,
  `closingCost` double(32,0) DEFAULT NULL COMMENT '成交额(元）',
  `date` date DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `week` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for temp
-- ----------------------------
DROP TABLE IF EXISTS `temp`;
CREATE TABLE `temp` (
  `id` varchar(36) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- View structure for day_stock_info
-- ----------------------------
DROP VIEW IF EXISTS `day_stock_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `day_stock_info` AS select code,name,MAX(highest) as highest,min(lowest) as lowest,SUM(vol) as vol,SUM(closingCost) as closingCost,date
from stock_info 
where highest != 0 group by code,date ORDER BY code ;

-- ----------------------------
-- View structure for month_stock_info
-- ----------------------------
DROP VIEW IF EXISTS `month_stock_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `month_stock_info` AS select 
code,
name,
YEAR(date) as year,
MONTH(date) as month ,
MAX(highest) as highest,
MIN(lowest) as lowest,
SUM(vol) as vol,
SUM(closingCost) as closingCost
from stock_info GROUP BY month,code having vol != 0 ORDER BY code ;

-- ----------------------------
-- View structure for week_stock_info
-- ----------------------------
DROP VIEW IF EXISTS `week_stock_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `week_stock_info` AS select code,name,YEAR(date) as year,week,max(highest) as highest,MIN(lowest) as lowest ,SUM(vol) as vol,SUM(closingCost) as closingCost from stock_info 
where highest != 0 group by code,week ORDER BY code ;
