package com.sheva.service.impl;

import com.sheva.dao.BaseDao;
import com.sheva.dao.master.UserDao;
import com.sheva.pojo.User;
import com.sheva.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
* Title: UserServiceImpl
* Description: 
* 用户操作实现类 
* Version:1.0.0  
* @author pancm
* @date 2018年3月19日
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User>  implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	protected BaseDao<User> getMapper() {
		return this.userDao;
	}
	
}
