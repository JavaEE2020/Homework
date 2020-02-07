/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-02-04 13:17:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `jobs` varchar(50) DEFAULT NULL,
  `phone` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '改名', '学生', '12345678901');
INSERT INTO `t_user` VALUES ('2', '李四', '学生', '13567998372');
INSERT INTO `t_user` VALUES ('3', '小米', '主任', '13905782372');
INSERT INTO `t_user` VALUES ('4', '小明', '老师', '13112234442');
INSERT INTO `t_user` VALUES ('5', '小岗', '管理员', '13123498372');
INSERT INTO `t_user` VALUES ('10', '新人', '学生', '12345678910');
