package com.payments.controller;

import com.payments.model.User;
import com.payments.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class UserController {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    UserService userService;

    @GetMapping(value = "/", produces = "application/json")
    public List<User> getAllUser() {
        List<User> userList = userService.getUsers();
        logger.info("In UserController:: getAllUser " + userList);
        return userList;
    }

    @GetMapping(value = "/{userId}", produces = "application/json")
    public User getUserById(@PathVariable("userId") long userId) {
        User user = userService.getUser(userId);
        logger.info("In UserController:: getUserById " + user);
        return user;
    }

    @PostMapping(value = "/", produces = "application/json")
    public User addUser(@RequestBody User user) {
        User resp = userService.addUser(user);
        logger.info("In UserController:: addUser " + resp);
        return resp;
    }

    @PutMapping(value = "/{userId}", produces = "application/json")
    public User updateUser(@RequestBody User UserRq, @PathVariable("userId") long userId) {
        User resp = userService.updateUser(UserRq);
        logger.info("In UserController:: updateUser " + resp);
        return resp;
    }

}
