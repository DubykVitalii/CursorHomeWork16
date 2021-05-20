package com.example.cursorhomework16.components;

import org.springframework.stereotype.Component;

@Component
public class Head {

    public Head() {
        System.out.println("Head created");
    }

    public void think() {
        System.out.println("Robot is thinking");
    }
}
