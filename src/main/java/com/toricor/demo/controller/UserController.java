package com.toricor.demo.controller;

import com.toricor.demo.domain.User;
import com.toricor.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    UserService userService;

    // 全件取得
    @RequestMapping(method = RequestMethod.GET)
    List<User> getUsers() {
        List<User> users = userService.findAll();
        return users;
    }

    // 1件取得
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    User getUser(@PathVariable Integer id) {
        User user = userService.findOne(id);
        return user;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    void postUsers(@RequestBody User user) {
        userService.create(user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    void putUser(@PathVariable Integer id, @RequestBody User user) {
        user.setId(id);
        userService.update(user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteUser(@PathVariable Integer id) {
        userService.delete(id);
    }
}
