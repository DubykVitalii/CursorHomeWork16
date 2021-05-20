package com.example.cursorhomework16.components;

import org.springframework.stereotype.Component;

@Component
public class Hands {

    public Hands() {
        System.out.println("Hands created");
    }

    public void push() {
        System.out.println("Robot is pushing");
    }
}
