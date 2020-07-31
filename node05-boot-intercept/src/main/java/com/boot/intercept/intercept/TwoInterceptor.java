package com.boot.intercept.intercept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器二
 */
public class TwoInterceptor implements HandlerInterceptor {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(TwoInterceptor.class.getName());
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object o) throws Exception {
        String url =String.valueOf(request.getRequestURL()) ;
        LOGGER.info("2、url=="+url);
        // 放开拦截
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {
        LOGGER.info("2、postHandle");
    }
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
        LOGGER.info("2、afterCompletion");
    }
}
