package com.kaixuan.springbootmvcmybatis.demo;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/1 22:43
 * @Description:
 */
@Mapper
public interface DemoMapper {

    Map<String, String> getUser(String id);
}
