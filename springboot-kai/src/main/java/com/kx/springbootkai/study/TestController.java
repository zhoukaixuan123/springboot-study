package com.kx.springbootkai.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: kaixuan
 * @Date: 2019/2/28 11:11
 * @Description:
 */
@Controller
public class TestController {


    @RequestMapping("getPage")
    public  String getPage(){
        System.out.println("----------------");
        return  "index";
    }
    @RequestMapping("login")
    public  String getLogin(){
        return  "index";
    }

}
