package com.example.cursorhomework16.configuration;

import com.example.cursorhomework16.components.Head;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class SpringConfiguration {

    @Bean
    public Head head(){
        return new Head();
    }
}
