package com.example.sql_server_crud.sql_server_crud.controller;


import com.example.sql_server_crud.sql_server_crud.entity.Users;
import com.example.sql_server_crud.sql_server_crud.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private final UserServiceImpl userService;
    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<Users>> getAllUsers(){
        List<Users> user = null;
        try{
            user = userService.getAllUsers();
        }
        catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<List<Users>>(user,HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable("id") int userId)
    {
        Users user = null;
        try {
            user = userService.getUserById(userId);
        } catch (Exception e) {
            e.getMessage();
        }

        return new ResponseEntity<Users>(user,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Users> addUser(@RequestBody Users user)
    {
        Users user2 = null;
        try {
            user2 = userService.addOrUpdateUser(user);
        } catch (Exception e) {
            e.getMessage();
        }

        return new ResponseEntity<Users>(user,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Users> deleteById(@PathVariable("id") int userId)
    {
        Users user = null;
        try {
            user =  userService.deleteUser(userId);
        } catch (Exception e) {
            e.getMessage();
        }

        return new ResponseEntity<Users>(user,HttpStatus.OK);
    }
}
