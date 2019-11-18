package com.hyl.dao;

import com.hyl.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao{
	User selectUser(String username,String password);
}
