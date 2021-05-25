package com.example.cursorhomework16.configuration;

import com.example.cursorhomework16.components.Head;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public Head head(){
        return new Head();
    }
}
