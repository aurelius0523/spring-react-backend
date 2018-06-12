package com.aurelius.react.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Defines Configuration for React Frontend. React Frontend is included as jar
 * dependency built from spring-react-frontend project.
 * 
 * @author kim.loong.tan
 *
 */
@Configuration
@ComponentScan(basePackages = "com.aurelius.react.config", excludeFilters = @Filter(Configuration.class))
public class ReactWebConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
	registry.addViewController("/react").setViewName("forward:/index.html");
    }
}
