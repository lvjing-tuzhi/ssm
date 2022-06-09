/*
 Navicat Premium Data Transfer

 Source Server         : upupw
 Source Server Type    : MySQL
 Source Server Version : 100318
 Source Host           : localhost:3306
 Source Schema         : ssmbuild

 Target Server Type    : MySQL
 Target Server Version : 100318
 File Encoding         : 65001

 Date: 09/06/2022 16:25:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bookread
-- ----------------------------
DROP TABLE IF EXISTS `bookread`;
CREATE TABLE `bookread`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `bookId` int NULL DEFAULT NULL,
  `userId` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of bookread
-- ----------------------------
INSERT INTO `bookread` VALUES (1, 1, 1);
INSERT INTO `bookread` VALUES (2, 2, 1);
INSERT INTO `bookread` VALUES (3, 3, 2);

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `bookID` int NOT NULL AUTO_INCREMENT COMMENT '书id',
  `bookName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '书名',
  `bookCounts` int NOT NULL COMMENT '数量',
  `detail` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '描述',
  INDEX `bookID`(`bookID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES (1, 'Java', 1, '从入门到放弃');
INSERT INTO `books` VALUES (2, 'MySQL', 10, '从删库到跑路');
INSERT INTO `books` VALUES (3, 'Linux', 5, '从进门到进牢');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '吕竟');
INSERT INTO `user` VALUES (2, '小明');
INSERT INTO `user` VALUES (5, 'c');

SET FOREIGN_KEY_CHECKS = 1;
