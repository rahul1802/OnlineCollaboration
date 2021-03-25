package com.coll.OnlineCollaboration.dao;
import java.util.List;

import com.coll.OnlineCollaboration.model.*;
public interface IUserDao {
List<User> userListbyStatus(String status);
List<User> getAllUsers();
User getUserById(int userId);
User getUserByUsername(String username);
User validateUser(User user);
boolean addUser(User user);
boolean updateUser(User user);
boolean deleteUser(int userId);
boolean deactivateUser(int userId);
boolean updateUserProfile(String file,int userId);
List<User> getAllDeactiveUser();
boolean activateUser(int userId);
}
