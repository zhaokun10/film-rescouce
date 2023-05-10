package com.sht.filmrescource.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("配置文件已经生效");
        // 存储的静态文件的路径（绝对路径）
        String path="/Users/zhaokun/IdeaProjects/film-rescouce/src/main/resources/static/";
        registry.addResourceHandler("/image/**").addResourceLocations("file:"+path);


    }
}



