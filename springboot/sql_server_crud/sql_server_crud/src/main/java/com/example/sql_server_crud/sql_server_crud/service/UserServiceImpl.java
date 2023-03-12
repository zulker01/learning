package com.example.sql_server_crud.sql_server_crud.service;



import com.example.sql_server_crud.sql_server_crud.UserService;
import com.example.sql_server_crud.sql_server_crud.entity.Users;
import com.example.sql_server_crud.sql_server_crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<Users> getAllUsers() {

        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public Users addOrUpdateUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users deleteUser(int userId) throws Exception {
        Users deleted = null;
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
