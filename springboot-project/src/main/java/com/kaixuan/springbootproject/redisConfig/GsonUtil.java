package com.kaixuan.springbootproject.redisConfig;

import com.google.gson.Gson;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/8 17:43
 * @Description:
 *
 *    �ȸ�Gson
 *
 *    ����ģʽ   ����ʽ
 *
 */
public class GsonUtil {


    public static Gson  gson = null;

    /**
     *
     * ��������: 
     *
     * @param: ����ʽ����
     * @return: 
     * @auther: kaixuan
     * @date: 2019/3/8 17:46
     */
    public GsonUtil(){
        gson = new  Gson();
    }


    /**
     *
     * ��������:
     *              ����json�ַ���
     * @param:
     * @return:
     * @auther: kaixuan
     * @date: 2019/3/8 17:49
     */
    public static String  getStringGson(Object object){
        return gson.toJson(object);
    }



}
