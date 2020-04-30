CREATE DATABASE myblog;
CREATE TABLE users(
	id INT PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(10),
	`password` VARCHAR(10)
)COMMENT='用户表';
CREATE TABLE blogs(
	id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	title VARCHAR(100) COMMENT '文章标题',
	article MEDIUMTEXT COMMENT '文章内容',
	userid INT COMMENT '文章对应的用户id'
	modifytime DATE COMMENT '文章修改时间'
)COMMENT='文章表';
