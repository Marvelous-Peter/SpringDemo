package com.marongxin.demo.controller;

import com.marongxin.demo.entity.User;
import com.marongxin.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aaa")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public ResponseEntity<?> getUsers(){
        List<User> users = userService .selectUsers();
        System.out.println(users);
        return ResponseEntity.ok(users);
    }
//    @GetMapping("/user")
//    public List<User> getUsers(){
//        List<User> users = userService .selectUsers();
//        System.out.println(users);
//        return users;
////        return ResponseEntity.ok(users);
//    }
}