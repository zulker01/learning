package com.example.mysql_crud_gradle.demo;
import com.example.mysql_crud_gradle.demo.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public User getUserById(int userId);
    public User addOrUpdateUser(User user);
    public User deleteUser(int userId) throws Exception;
}
