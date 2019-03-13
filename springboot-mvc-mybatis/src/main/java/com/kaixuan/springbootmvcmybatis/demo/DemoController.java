package com.kaixuan.springbootmvcmybatis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/1 22:43
 * @Description:
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;


    @RequestMapping("getUser")
    public String getUser(HttpServletRequest request) {
        Map<String, String> map = demoService.getUser();
        request.setAttribute("age", map.get("age"));
        return "index";
    }
}
