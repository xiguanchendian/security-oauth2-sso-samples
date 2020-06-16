package com.xgcd.sso.client1.service.impl;

import com.xgcd.sso.client1.entity.User;
import com.xgcd.sso.client1.mapper.UserMapper;
import com.xgcd.sso.client1.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceI {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
