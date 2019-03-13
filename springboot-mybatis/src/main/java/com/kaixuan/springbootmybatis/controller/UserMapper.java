package com.kaixuan.springbootmybatis.controller;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/1 14:42
 * @Description:
 */
@Mapper
public interface UserMapper {

    public User getUser(String id );
}
