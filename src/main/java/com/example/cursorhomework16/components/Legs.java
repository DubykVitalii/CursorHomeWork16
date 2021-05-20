package com.example.cursorhomework16.components;

import org.springframework.stereotype.Component;

@Component
public class Legs {

    public Legs() {
        System.out.println("Legs created");
    }

    public void move() {
        System.out.println("Robot is moving");
    }
}
