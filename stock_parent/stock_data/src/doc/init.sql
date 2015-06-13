/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50543
Source Host           : localhost:3306
Source Database       : stock

Target Server Type    : MYSQL
Target Server Version : 50543
File Encoding         : 65001

Date: 2015-06-13 12:56:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for stock_info
-- ----------------------------
DROP TABLE IF EXISTS `stock_info`;
CREATE TABLE `stock_info` (
  `id` varchar(36) NOT NULL,
  `closing` varchar(6) DEFAULT NULL,
  `open` varchar(6) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `code` varchar(10) DEFAULT NULL,
  `lowest` varchar(6) DEFAULT NULL,
  `highest` varchar(6) DEFAULT NULL,
  `current` varchar(6) DEFAULT NULL,
  `preClose` varchar(6) DEFAULT NULL,
  `vol` varchar(32) DEFAULT NULL,
  `closingCost` varchar(32) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `week` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- View structure for week_stock_info
-- ----------------------------
DROP VIEW IF EXISTS `week_stock_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `week_stock_info` AS select code,max(highest) as highest,MIN(lowest) as lowest ,SUM(vol) as vol,SUM(closingCost) as closingCost,week from stock_info where highest != 0 group by code,week ORDER BY code ;
