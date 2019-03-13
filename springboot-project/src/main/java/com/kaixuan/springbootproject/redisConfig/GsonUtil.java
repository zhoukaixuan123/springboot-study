package com.kaixuan.springbootproject.redisConfig;

import com.google.gson.Gson;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/8 17:43
 * @Description:
 *
 *    谷歌Gson
 *
 *    单例模式   饿汉式
 *
 */
public class GsonUtil {


    public static Gson  gson = null;

    /**
     *
     * 功能描述: 
     *
     * @param: 饿汉式加载
     * @return: 
     * @auther: kaixuan
     * @date: 2019/3/8 17:46
     */
    public GsonUtil(){
        gson = new  Gson();
    }


    /**
     *
     * 功能描述:
     *              返回json字符串
     * @param:
     * @return:
     * @auther: kaixuan
     * @date: 2019/3/8 17:49
     */
    public static String  getStringGson(Object object){
        return gson.toJson(object);
    }



}
