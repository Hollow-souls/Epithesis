package edu.wbu.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yog
 * @create 2023-03-2023/3/29-10:54
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private TokenCheckInterceptor tokenCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(tokenCheckInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/user/login","/paper/uploadPaper");
    }
}
