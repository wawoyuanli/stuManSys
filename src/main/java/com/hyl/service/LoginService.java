package com.hyl.service;

import com.hyl.pojo.User;

public interface LoginService{
	//根据用户名密码查询用户 登录
	User selectUser(String username,String password);
	//根据用户名密码进行注册
	int insertUser(User user);

}
