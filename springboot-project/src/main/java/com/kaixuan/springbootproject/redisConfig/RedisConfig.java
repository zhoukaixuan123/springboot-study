package com.kaixuan.springbootproject.redisConfig;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

   @Autowired
    private static StringRedisTemplate template;


   /**
    *
    * 功能描述:
    *         封装对象
    *
    *          原始操作依然使用redis 的命令进行操作
    * @param:
    * @return:
    * @auther: kaixuan
    * @date: 2019/3/8 17:55
    */
   public  static Object getStirngRedisTemplate(){
     return   template.opsForValue();
   }

}