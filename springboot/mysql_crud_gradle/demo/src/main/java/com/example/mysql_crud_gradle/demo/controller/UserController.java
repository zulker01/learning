package com.example.mysql_crud_gradle.demo.controller;

import com.example.mysql_crud_gradle.demo.UserService;
import com.example.mysql_crud_gradle.demo.entity.User;
import com.example.mysql_crud_gradle.demo.service.UserServiceImpl;
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
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> user = null;
        try{
            user = userService.getAllUsers();
        }
        catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<List<User>>(user,HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int userId)
    {
        User user = null;
        try {
            user = userService.getUserById(userId);
        } catch (Exception e) {
            e.getMessage();
        }

        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user)
    {
        User user2 = null;
        try {
            user2 = userService.addOrUpdateUser(user);
        } catch (Exception e) {
            e.getMessage();
        }

        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<User> deleteById(@PathVariable("id") int userId)
    {
        User user = null;
        try {
            user =  userService.deleteUser(userId);
        } catch (Exception e) {
            e.getMessage();
        }

        return new ResponseEntity<User>(user,HttpStatus.OK);
    }
}
