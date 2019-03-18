/*
package com.recruit.springbootrecruit.projiect.util.filter;

import com.recruit.springbootrecruit.projiect.util.filter.MyInterceptor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

*/
/**
 *
 * 功能描述:
 *          拦截
 * @param:
 * @return:
 * @auther: kaixuan
 * @date: 2019/3/18 13:11
 *//*



@Configuration
@EnableWebMvc
@ComponentScan
public class MyWebMvcConfigurationSupport extends WebMvcConfigurationSupport {

    private ApplicationContext applicationContext;

    public MyWebMvcConfigurationSupport() {
        super();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }




    */
/**
     *
     * 功能描述:
     *            拦截页面
     * @param
     * @return:
     * @auther: kaixuan
     * @date: 2019/3/18 13:10
     *//*

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截规则
        registry.addInterceptor(new MyInterceptor());
        super.addInterceptors(registry);

    }


}
*/
