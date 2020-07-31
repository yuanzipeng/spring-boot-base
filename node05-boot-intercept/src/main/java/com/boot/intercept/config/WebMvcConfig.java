package com.boot.intercept.config;

import com.boot.intercept.intercept.OneInterceptor;
import com.boot.intercept.intercept.TwoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * Web配置文件
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有路径
        // 注册自定义两个拦截器
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/**");
    }
}
