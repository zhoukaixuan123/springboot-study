package com.kaixuan.springbootproject.demo;

import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Map;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/1 22:43
 * @Description:
 */
public interface DemoService {


    List<User> getUser();
}
