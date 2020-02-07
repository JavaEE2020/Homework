package com.fcf.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fcf.mapper.UserMapper;
import com.fcf.model.User;
import com.fcf.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(String userId) {
        return userMapper.selectUser(userId);
    }
}
