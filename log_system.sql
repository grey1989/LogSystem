/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : log_system

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 17/04/2022 22:05:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for app
-- ----------------------------
DROP TABLE IF EXISTS `app`;
CREATE TABLE `app` (
  `appID` bigint(20) NOT NULL,
  `appName` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`appID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `logID` bigint(20) NOT NULL,
  `appID` bigint(20) DEFAULT NULL,
  `content` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `level` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `app_env` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `server_ip` varchar(15) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `err_class` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `requestID` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`logID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for request
-- ----------------------------
DROP TABLE IF EXISTS `request`;
CREATE TABLE `request` (
  `requestID` bigint(20) NOT NULL,
  `origin_ip` varchar(15) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `origin_port` varchar(5) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `origin_location` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `request_content` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`requestID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` bigint(20) DEFAULT NULL,
  `username` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for warn
-- ----------------------------
DROP TABLE IF EXISTS `warn`;
CREATE TABLE `warn` (
  `warn_id` bigint(20) NOT NULL,
  `warn_management_id` bigint(20) DEFAULT NULL,
  `count` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `server_ip` varchar(15) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `server_port` varchar(5) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`warn_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for warn_management
-- ----------------------------
DROP TABLE IF EXISTS `warn_management`;
CREATE TABLE `warn_management` (
  `warn_management_id` bigint(20) NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `appID` int(11) DEFAULT NULL,
  `info_count` int(11) DEFAULT NULL,
  `error_count` int(11) DEFAULT NULL,
  `warn_count` int(11) DEFAULT NULL,
  `critical_count` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`warn_management_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

SET FOREIGN_KEY_CHECKS = 1;
