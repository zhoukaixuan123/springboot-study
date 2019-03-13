package com.kaixuan.springbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/1 14:40
 * @Description:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getData")
    @ResponseBody
    public  String  getData(){
       User user =  userService.getUser("1");
        return  "111" ;
    }
}
