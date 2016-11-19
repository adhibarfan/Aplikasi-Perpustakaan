package com.adhib.arfan.aplikasi.perpustakaan.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @Author Adhib Arfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Nov 16, 2016
 * @Time 11:06:34 PM
 * @Encoding UTF-8
 * @Project Aplikasi-Perpustakaan
 * @Package com.adhib.arfan.aplikasi.perpustakaan.configuration
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API aplikasi perpustakaan")
                .description("dokumentasi API untuk aplikasi perpustakan")
                .contact(new Contact("Adhib Arfan", "https://adhibarfan.github.io/", "adhib.arfan@gmai.com"))
                .license("Apache License Version 2.0")
                .build();

    }

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(springfox.documentation.builders.PathSelectors.regex("/api.*"))
                .build();
    }
}
