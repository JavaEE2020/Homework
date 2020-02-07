/*
 Navicat Premium Data Transfer

 Source Server         : 1234
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 06/02/2020 14:27:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(5) NULL DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `age` int(3) NULL DEFAULT NULL,
  `address` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (10000, '王明', 23, '杭州');
INSERT INTO `student` VALUES (10001, '李四', 25, '上海');
INSERT INTO `student` VALUES (10002, '赵云', 26, '北京');
INSERT INTO `student` VALUES (10003, '武松', 28, '武汉');
INSERT INTO `student` VALUES (10004, '杨过', 36, '苏州');
INSERT INTO `student` VALUES (10005, '钱七', 25, '合肥');
INSERT INTO `student` VALUES (10006, '张三', 23, '杭州');
INSERT INTO `student` VALUES (10007, '徐五', 24, '苏州');
INSERT INTO `student` VALUES (10008, '王二', 23, '南京');
INSERT INTO `student` VALUES (10009, '李刚', 24, '沈阳');
INSERT INTO `student` VALUES (10010, '赵强', 21, '上海');

SET FOREIGN_KEY_CHECKS = 1;
