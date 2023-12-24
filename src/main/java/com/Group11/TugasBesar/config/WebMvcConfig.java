package com.Group11.TugasBesar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.Group11.TugasBesar.interceptors.CheckLoggedInInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public CheckLoggedInInterceptor checkLoggedInInterceptor() {
        return new CheckLoggedInInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(checkLoggedInInterceptor()).addPathPatterns("/**");
    }
}

