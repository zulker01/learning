package com.example.mysql_crud_gradle.demo.service;

import com.example.mysql_crud_gradle.demo.UserService;
import com.example.mysql_crud_gradle.demo.entity.User;
import com.example.mysql_crud_gradle.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {

        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public User addOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(int userId) throws Exception {
        User deleted = null;
        try{
            deleted = userRepository.findById(userId).orElse(null);
            if(deleted == null)
                throw new Exception("user not found");
            else{
                userRepository.deleteById(userId);
            }
        }
        catch (Exception ex)
        {
            throw ex;
        }
        return deleted;
    }
}
