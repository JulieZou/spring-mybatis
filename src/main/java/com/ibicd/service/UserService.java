package com.ibicd.service;

import com.ibicd.domain.User;
import com.ibicd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    public void add(User user) {
        userMapper.add(user);
    }

    public User findById(Integer id) {

        return userMapper.findById(id);
    }

    @Autowired
    private UserMapper userMapper;

}
