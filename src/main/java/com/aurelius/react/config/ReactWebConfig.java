package com.aurelius.react.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Defines Configuration for React Frontend. React Frontend is included as
 * webjars built from spring-react-frontend project. A copy of index.html needs
 * to be created in main/resources/public which points to bundle.js in webjar to
 * serve React. Note that in the spring-react-frontend project the index.html
 * will use bundle.js directly, not from webjar.
 * 
 * @author kim.loong.tan
 *
 */
@Configuration
@ComponentScan(basePackages = "com.aurelius.react.config", excludeFilters = @Filter(Configuration.class))
public class ReactWebConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		if (!registry.hasMappingForPattern("/webjars/**")) {
			registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		}
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/react").setViewName("forward:/index.html");
	}
}
