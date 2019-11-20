package com.hyl.dao;

import com.hyl.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao{
	/**
	 * 注册
	 * @return
	 */
	int insertUser(User user);

	/**
	 * 登录
	 * @param username
	 * @param password
	 * @return
	 */
	User selectUser(String username,String password);

}
