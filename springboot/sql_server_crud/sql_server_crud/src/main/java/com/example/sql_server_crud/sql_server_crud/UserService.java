package com.example.sql_server_crud.sql_server_crud;


import com.example.sql_server_crud.sql_server_crud.entity.Users;

import java.util.List;

public interface UserService {

    public List<Users> getAllUsers();
    public Users getUserById(int userId);
    public Users addOrUpdateUser(Users user);
    public Users deleteUser(int userId) throws Exception;
}
