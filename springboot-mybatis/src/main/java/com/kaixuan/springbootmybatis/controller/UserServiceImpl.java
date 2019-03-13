package com.kaixuan.springbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/1 14:41
 * @Description:
 */
@Service
public class UserServiceImpl  implements  UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String id) {
        return  userMapper.getUser("1");
    }
}
