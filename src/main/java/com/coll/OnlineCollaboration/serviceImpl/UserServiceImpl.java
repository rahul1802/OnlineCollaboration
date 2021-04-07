package com.coll.OnlineCollaboration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coll.OnlineCollaboration.dao.IUserDao;
import com.coll.OnlineCollaboration.model.User;
import com.coll.OnlineCollaboration.service.IUserService;

@Service  
@Transactional  

public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDao userDao;
	@Override
	public List<User> userListbyStatus(String status) {
		return userDao.userListbyStatus(status);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User getUserById(int userId) {
		return userDao.getUserById(userId);
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	@Override
	public User validateUser(User user) {
		return userDao.validateUser(user);
	}

	@Override
	public boolean addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(int userId) {
		return userDao.deleteUser(userId);
	}

	@Override
	public boolean deactiveUser(int userId) {
		return userDao.deactivateUser(userId);
	}

	@Override
	public boolean updateUserProfile(String file, Integer userId) {
		return userDao.updateUserProfile(file, userId);
	}

	@Override
	public List<User> getAllDeactiveUser() {
		return userDao.getAllDeactiveUser();
	}

	@Override
	public boolean activateUser(int userId) {
		return userDao.activateUser(userId);
	}

	@Override
	public boolean logout(int userId) {
		return userDao.logout(userId);
	}


	
	

}
