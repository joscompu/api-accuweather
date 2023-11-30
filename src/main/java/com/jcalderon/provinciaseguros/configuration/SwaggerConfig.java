package com.jcalderon.provinciaseguros.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

//Author: Jose Calderon
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public static final String TITLE = "API-ACCUWEATHER";
    public static final String DESCRIPTION = "Microservicio del clima";
    public static final String VERSION = "1.0";
    public static final String NAME = "Jose Calderon";
    public static final String URL = "https://github.com/joscompu";
    public static final String EMAIL = "joscompu@gmail.com";

    @Bean
    public InternalResourceViewResolver defaultViewResolver() {
        return new InternalResourceViewResolver();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiDetails() {
        return new ApiInfo(TITLE,
                DESCRIPTION,
                VERSION,
                "",
                new Contact(NAME, URL, EMAIL),
                "",
                "",
                Collections.emptyList());
    }
}
