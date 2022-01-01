package com.codeProject.user.controller;

import com.codeProject.user.entity.User;
import com.codeProject.user.pojo.ResponseUser;
import com.codeProject.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    private User create(@RequestBody User user){
        log.info("Inside dept save user Controller");
        return userService.create(user);
    }

    @GetMapping("/get/{id}")
    private User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @GetMapping("/getUD/{id}")
    public ResponseUser getUserWithDept(@PathVariable Long id){
        return userService.getUSerWithDept(id);
    }
}
