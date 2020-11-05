package com.ibicd.web;

import com.ibicd.domain.User;
import com.ibicd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void add() {

        User user = new User();
        user.setUserName("Julie");
        user.setCorp("ibicd");

        userService.add(user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public void findById() {
        User user = userService.findById(1);
        System.out.println("findUser: " + user.getUserName());
    }

    @Autowired
    UserService userService;
}
