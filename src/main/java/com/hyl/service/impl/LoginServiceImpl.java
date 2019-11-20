package com.hyl.service.impl;

import com.hyl.dao.LoginDao;
import com.hyl.pojo.User;
import com.hyl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public User selectUser(String username,String password){
		return loginDao.selectUser(username,password);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public int insertUser (User user){
		int i = loginDao.insertUser(user);
		return i ;
	}
}
