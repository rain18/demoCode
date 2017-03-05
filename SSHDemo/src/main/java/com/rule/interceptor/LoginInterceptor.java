package com.rule.interceptor;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by rain on 2017/2/7.
 */
public class LoginInterceptor implements HandlerInterceptor{

    private final Logger logger = Logger.getLogger(LoginInterceptor.class);
    private final String USERID = "userId";

    /**
     *  在业务处理器之前被调用
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Object userIdObj = httpServletRequest.getSession().getAttribute(USERID);
        if (userIdObj != null) {
            return true;
        }
        httpServletResponse.sendRedirect("");
        return false;
    }

    /*
        在业务处理器请求完成后，生成视图之前执行的动作
        可以在modelAndView中加入数据，比如当前时间
     */
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    /*
        在DispatcherServle完全处理请求后被调用，用于清理资源等
        当有拦截器抛出异常时，会从当前拦截器往回执行所有的拦截器的afterCompletion()
     */
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
