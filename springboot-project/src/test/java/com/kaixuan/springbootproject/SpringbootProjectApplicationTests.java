package com.kaixuan.springbootproject;


import com.kaixuan.springbootproject.demo.User;
import com.kaixuan.springbootproject.redisConfig.UserRedis;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * 功能描述: 
 *
 * @param:     缓存数据库
 * @return: 
 * @auther: kaixuan
 * @date: 2019/3/5 10:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootProjectApplicationTests {



  @Autowired
  UserRedis userRedis;


  @Before

 public void setup(){
        User user = new User();
        user.setId(1);
        user.setName("周凯旋");
        user.setAge(12);
        System.out.println(this.getClass().getName()+"userByName:"+user.getName());
        userRedis.delete(this.getClass().getName()+"userByName:"+user.getName());
        userRedis.add(this.getClass().getName()+":userByPkid:"+user.getId(),10L,user);
    }

    @Test
    public void get(){
        User user = userRedis.get(this.getClass().getName()+":userByPkid:1");
        System.out.println("=================user==================name:{}"+user.getName());
    }



}
