package com.kaixuan.springbootproject.project.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/6 15:00
 * @Description:
 *   主页面
 *
 *
 */
@Controller
@RequestMapping("index")
public class IndexController {


    @Autowired
     private  IndexService  indexService;

    
    /**
     *
     * 功能描述: 
     *
     * @param:   主页
     * @return: 
     * @auther: kaixuan
     * @date: 2019/3/8 17:17
     */
    @RequestMapping("getIndex")
    public String  getIndex(){
        return "index";
    }
    
    
    /**
     *
     * 功能描述: 
     *
     * @param:    主页上的上数据
     * @return: 
     * @auther: kaixuan
     * @date: 2019/3/8 17:16
     */
    @RequestMapping("getIndexData")
      public String  getIndexData(){
         String listJson =  indexService.getIndexData();

          return  listJson;
      }
    
}
