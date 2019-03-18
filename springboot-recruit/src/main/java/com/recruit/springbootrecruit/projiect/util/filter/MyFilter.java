package com.recruit.springbootrecruit.projiect.util.filter;

import com.recruit.springbootrecruit.projiect.util.LoggerUtil;
import com.recruit.springbootrecruit.projiect.util.SessionUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/18 13:20
 * @Description:
 *
 *    过滤器配置
 */

//filertName   过滤器的名字      urlPatterns   需要过滤的URl
@WebFilter(filterName = "test", urlPatterns = "/index/*")
public class MyFilter  implements Filter  {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("----------------------->过滤器被创建");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String requestURI = req.getRequestURI();
        System.out.println("--------------------->过滤器：请求地址"+requestURI);
        String sess = (String)SessionUtil.getSession().getAttribute("USERNAME");
        if(sess == null){
            servletRequest.getRequestDispatcher("/login/getLogin").forward(servletRequest, servletResponse);
        }else{
            System.out.println("没有过滤掉！！");
        }
    }

    @Override
    public void destroy() {

        System.out.println("----------------------->过滤器被销毁");
    }


}
