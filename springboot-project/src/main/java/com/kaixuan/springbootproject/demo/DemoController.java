package com.kaixuan.springbootproject.demo;

import com.google.gson.Gson;
import com.kaixuan.springbootproject.redisConfig.UserRedis;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
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

    @Autowired
    private StringRedisTemplate template;
    @Autowired
    private UserRedis userRedis;



    /**
     *
     * 功能描述:
     *              redis 缓存练习  测试
     * @param:
     * @return:
     * @auther: kaixuan
     * @date: 2019/3/6 12:00
     */
    @RequestMapping("getUser")
    public String getUser(HttpServletRequest request){

        Gson gson = new Gson();
        List<User> map = null;
        // redis 中没有数据的时候查询数据库
        if (template.opsForValue().get("user") == null || template.opsForValue().get("user") == "") {
                map = demoService.getUser();
                //把数据放到redis  服务器中
                template.opsForValue().set("user", gson.toJson(map));
                request.setAttribute("age", template.opsForValue().get("user"));
                System.out.println("第一次没有缓存");
        } else {
            //有数据直接从 redis 数据库中取
            request.setAttribute("age", template.opsForValue().get("user"));
            System.out.println("第二次缓存过的");
        }
        return "demo";
    }
}
