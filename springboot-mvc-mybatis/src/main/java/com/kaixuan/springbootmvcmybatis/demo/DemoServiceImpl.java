package com.kaixuan.springbootmvcmybatis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/1 22:43
 * @Description:
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoMapper demoMapper;

    @Override
    public Map<String, String> getUser() {
        return demoMapper.getUser("1");

    }
}
