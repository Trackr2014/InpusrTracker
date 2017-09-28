/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50153
Source Host           : localhost:3806
Source Database       : springmvc

Target Server Type    : MYSQL
Target Server Version : 50153
File Encoding         : 65001

Date: 2016-05-11 14:50:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tuser
-- ----------------------------
DROP TABLE IF EXISTS `tuser`;
CREATE TABLE `tuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `login_date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tuser
-- ----------------------------
INSERT INTO `tuser` VALUES ('28', '44', '44', '44');
INSERT INTO `tuser` VALUES ('27', '33', '33', '33');
INSERT INTO `tuser` VALUES ('25', '11', '11', '11');
INSERT INTO `tuser` VALUES ('26', '22', '22', '22');
