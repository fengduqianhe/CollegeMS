/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : collegems

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-29 16:56:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for announcement
-- ----------------------------
DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement` (
  `RID` int(11) NOT NULL,
  `Notice` varchar(1000) NOT NULL,
  `Noticetime` varchar(20) NOT NULL,
  PRIMARY KEY (`RID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of announcement
-- ----------------------------
INSERT INTO `announcement` VALUES ('1', '重庆文理学院棒棒哒乔贺辙', '2017');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `BID` int(20) NOT NULL AUTO_INCREMENT,
  `major` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `message` varchar(200) NOT NULL,
  `cost` int(20) NOT NULL,
  PRIMARY KEY (`BID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '法语', '法语基础', '北京大学', '221');
INSERT INTO `book` VALUES ('2', '计算机科学与技术', '数据结构', '清华大学', '12');
INSERT INTO `book` VALUES ('6', '应用数学', '数学理论', '清华大学', '2');
INSERT INTO `book` VALUES ('7', '环境科学', '环境导论', '西南交通大学', '33');
INSERT INTO `book` VALUES ('9', '翻译', '翻译基础', '北京大学', '23');
INSERT INTO `book` VALUES ('10', '计科', 'C++', '清华大学', '21');
INSERT INTO `book` VALUES ('11', '数媒', '计算机图形', '图形学', '123');
INSERT INTO `book` VALUES ('12', '数媒', '大学英语', '英语', '23');
INSERT INTO `book` VALUES ('13', '数媒', 'Java', '编程语言', '23');

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `CID` int(11) NOT NULL AUTO_INCREMENT,
  `college` varchar(20) NOT NULL,
  `major` varchar(20) NOT NULL,
  `Message` varchar(20) NOT NULL,
  `Number` int(20) NOT NULL,
  `Numcollege` int(20) NOT NULL,
  `Numclass` int(20) NOT NULL,
  `Nummajor` int(20) NOT NULL,
  `Numpeople` int(20) NOT NULL,
  PRIMARY KEY (`CID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('1', '信息科学与技术', '计科', '计科最棒', '30', '10', '1', '1', '28');
INSERT INTO `class` VALUES ('2', '信息科学与技术', '软件', '还不错', '30', '11', '2', '1', '26');
INSERT INTO `class` VALUES ('3', '信息科学与技术', '数字媒体', '还可以', '30', '12', '3', '1', '24');

-- ----------------------------
-- Table structure for friend
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
  `FID` int(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `Fno` varchar(20) NOT NULL,
  `College` varchar(20) NOT NULL,
  `Major` varchar(20) NOT NULL,
  PRIMARY KEY (`FID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of friend
-- ----------------------------
INSERT INTO `friend` VALUES ('11', '乔贺辙', '2017101127', '信息科学与技术', '计科');

-- ----------------------------
-- Table structure for leaving
-- ----------------------------
DROP TABLE IF EXISTS `leaving`;
CREATE TABLE `leaving` (
  `LID` int(11) NOT NULL AUTO_INCREMENT,
  `Lsno` varchar(20) NOT NULL,
  `Lname` varchar(20) NOT NULL,
  `Lcollege` varchar(20) NOT NULL,
  `Lmajor` varchar(20) NOT NULL,
  PRIMARY KEY (`LID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leaving
-- ----------------------------

-- ----------------------------
-- Table structure for manger
-- ----------------------------
DROP TABLE IF EXISTS `manger`;
CREATE TABLE `manger` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manger
-- ----------------------------
INSERT INTO `manger` VALUES ('1', 'admin', '123456');
INSERT INTO `manger` VALUES ('2', '乔贺辙', '123');
INSERT INTO `manger` VALUES ('6', '呵呵', '123');

-- ----------------------------
-- Table structure for money
-- ----------------------------
DROP TABLE IF EXISTS `money`;
CREATE TABLE `money` (
  `MID` varchar(20) NOT NULL,
  `Book` int(20) NOT NULL,
  `Enexam` int(20) NOT NULL,
  `Register` int(20) NOT NULL,
  `Maexam` int(20) NOT NULL,
  PRIMARY KEY (`MID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of money
-- ----------------------------
INSERT INTO `money` VALUES ('1', '420', '500', '500', '500');

-- ----------------------------
-- Table structure for newstudent
-- ----------------------------
DROP TABLE IF EXISTS `newstudent`;
CREATE TABLE `newstudent` (
  `NID` varchar(20) NOT NULL,
  `NName` varchar(20) NOT NULL,
  `Nsex` varchar(255) NOT NULL,
  `NTime` varchar(20) NOT NULL,
  `NPhone` varchar(20) NOT NULL,
  `NCollege` varchar(20) NOT NULL,
  `NMajor` varchar(20) NOT NULL,
  `NScore` int(20) NOT NULL,
  `NClass` int(20) NOT NULL,
  PRIMARY KEY (`NID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of newstudent
-- ----------------------------
INSERT INTO `newstudent` VALUES ('2', '张三', '男', '1997.4.16', '15368505312', '信息科学与技术', '软件', '545', '1');
INSERT INTO `newstudent` VALUES ('3', '李四', '男', '1996.5.27', '13415689562', '信息科学与技术', '数媒', '515', '1');

-- ----------------------------
-- Table structure for punish
-- ----------------------------
DROP TABLE IF EXISTS `punish`;
CREATE TABLE `punish` (
  `PID` int(11) NOT NULL AUTO_INCREMENT,
  `Sno` varchar(255) NOT NULL,
  `Sname` varchar(20) NOT NULL,
  `Message` varchar(200) NOT NULL,
  PRIMARY KEY (`PID`),
  KEY `Pno` (`Sno`),
  CONSTRAINT `Pno` FOREIGN KEY (`Sno`) REFERENCES `student` (`Sno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of punish
-- ----------------------------

-- ----------------------------
-- Table structure for reward
-- ----------------------------
DROP TABLE IF EXISTS `reward`;
CREATE TABLE `reward` (
  `RID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `message` varchar(255) NOT NULL,
  `money` int(20) NOT NULL,
  `Sno` varchar(20) NOT NULL,
  PRIMARY KEY (`RID`),
  KEY `Kno` (`Sno`),
  CONSTRAINT `Kno` FOREIGN KEY (`Sno`) REFERENCES `student` (`Sno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reward
-- ----------------------------
INSERT INTO `reward` VALUES ('21', '乔贺辙', '数学建模', '100', '2017101127');

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `ID` int(20) NOT NULL,
  `Floor` varchar(20) NOT NULL,
  `Dorm` varchar(20) NOT NULL,
  `DormNum` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('1', '松林', '2', '400');
INSERT INTO `room` VALUES ('2', '珙桐', '6', '600');
INSERT INTO `room` VALUES ('3', '芙蓉', '8', '800');

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `ID` int(20) NOT NULL,
  `Sno` varchar(20) DEFAULT NULL,
  `Sname` varchar(20) DEFAULT NULL,
  `ma` int(20) DEFAULT NULL,
  `en` int(20) DEFAULT NULL,
  `ph` int(20) DEFAULT NULL,
  `pe` int(20) DEFAULT NULL,
  `ce` int(20) DEFAULT NULL,
  `me` int(20) DEFAULT NULL,
  `ge` int(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Dno` (`Sno`),
  CONSTRAINT `Dno` FOREIGN KEY (`Sno`) REFERENCES `student` (`Sno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('2', '2015002', '风度千贺', '87', '67', '87', '75', '87', '74', '65');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `Sno` varchar(20) NOT NULL,
  `Psd` varchar(20) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Sex` varchar(10) NOT NULL,
  `Sclass` varchar(20) NOT NULL,
  `Stime` varchar(20) NOT NULL,
  `College` varchar(20) NOT NULL,
  `Major` varchar(20) NOT NULL,
  `Card` int(20) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  PRIMARY KEY (`Sno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('2015002', '123', '风度千贺', '男', '1', '1996.5.25', '地球科学学院', '地质', '125', '1568963694');
INSERT INTO `student` VALUES ('2015003', '123', '乔少主', '男', '2', '1997.6.23', '文法学院', '社会学', '52', '1568956123');
INSERT INTO `student` VALUES ('2017101127', '123', '乔贺辙', '男', '1', '1997.8.29', '信息科学与技术', '计科', '100', '13547886234');

-- ----------------------------
-- Table structure for studentroom
-- ----------------------------
DROP TABLE IF EXISTS `studentroom`;
CREATE TABLE `studentroom` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Sno` varchar(20) NOT NULL,
  `Number` varchar(20) DEFAULT NULL,
  `Dorm` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Rno` (`Sno`),
  CONSTRAINT `Rno` FOREIGN KEY (`Sno`) REFERENCES `student` (`Sno`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentroom
-- ----------------------------
INSERT INTO `studentroom` VALUES ('2', '2015002', '224', '松林');
INSERT INTO `studentroom` VALUES ('11', '2017101127', null, null);

-- ----------------------------
-- Table structure for talent
-- ----------------------------
DROP TABLE IF EXISTS `talent`;
CREATE TABLE `talent` (
  `SID` int(11) NOT NULL,
  `Sname` varchar(20) NOT NULL,
  `Grade` double(20,0) NOT NULL,
  `Smessage` varchar(20) NOT NULL,
  `Sno` varchar(20) NOT NULL,
  PRIMARY KEY (`SID`),
  KEY `Sno` (`Sno`),
  CONSTRAINT `Sno` FOREIGN KEY (`Sno`) REFERENCES `student` (`Sno`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of talent
-- ----------------------------
INSERT INTO `talent` VALUES ('2', '风度千贺', '4', '成绩优异', '2015002');

-- ----------------------------
-- Table structure for working
-- ----------------------------
DROP TABLE IF EXISTS `working`;
CREATE TABLE `working` (
  `HID` int(11) NOT NULL AUTO_INCREMENT,
  `post` varchar(20) NOT NULL,
  `place` varchar(20) NOT NULL,
  `salery` int(20) NOT NULL,
  PRIMARY KEY (`HID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of working
-- ----------------------------
INSERT INTO `working` VALUES ('1', '图书馆整理', '图书馆', '100');
INSERT INTO `working` VALUES ('2', '教室清洁', '六教', '120');
INSERT INTO `working` VALUES ('4', '学校清洁', '学校啊', '210');
