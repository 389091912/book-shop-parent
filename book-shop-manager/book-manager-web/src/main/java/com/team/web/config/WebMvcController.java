package com.team.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-08-01
 * Time: 1:18
 */
@Configuration
public class WebMvcController implements WebMvcConfigurer {
 /*   @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedMethods("*");
            }
        };
    }*/
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController( "/websocket.html" ).setViewName( "websocket1" );

    }

}
