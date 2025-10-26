package com.movieflix.movieAPI.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    // Swagger Bean
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Movie App Backend")
                        .version("1.0.0")
                        .description("API documentation for my Spring Boot project"));
    }

    // ModelMapper Bean
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
