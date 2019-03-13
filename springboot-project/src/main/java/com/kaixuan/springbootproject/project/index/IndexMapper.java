package com.kaixuan.springbootproject.project.index;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/8 17:04
 * @Description:
 */
@Mapper
public interface IndexMapper {


    /**
     *
     * 功能描述: 
     *
     * @param:   首页展示功能
     * @return: 
     * @auther: kaixuan
     * @date: 2019/3/8 17:14
     */
    List<Map<String,String>> getIndexData();
}
