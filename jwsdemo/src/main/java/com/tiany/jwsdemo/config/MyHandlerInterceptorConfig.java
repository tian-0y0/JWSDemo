package com.tiany.jwsdemo.config;

import com.tiany.jwsdemo.Interceptor.MyHandlerInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class MyHandlerInterceptorConfig extends WebMvcConfigurerAdapter {
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(new MyHandlerInterceptor());

        addInterceptor.addPathPatterns("/test");
        addInterceptor.addPathPatterns("/admin/index");
        addInterceptor.addPathPatterns("/admin/userList");
        addInterceptor.addPathPatterns("/admin/userDetail/{id}");
        addInterceptor.addPathPatterns("/admin/userDelete/{id}");
        addInterceptor.addPathPatterns("/admin/newsList");
        addInterceptor.addPathPatterns("/admin/toAddNews");
        addInterceptor.addPathPatterns("/admin/doAddNews");
        addInterceptor.excludePathPatterns("/admin/toRegister");
        addInterceptor.excludePathPatterns("/admin/toLogin");
        super.addInterceptors(registry);
    }
}
