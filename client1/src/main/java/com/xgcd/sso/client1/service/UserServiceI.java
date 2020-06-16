package com.xgcd.sso.client1.service;

import com.xgcd.sso.client1.entity.User;

public interface UserServiceI {
    User selectByPrimaryKey(Integer id);
}
