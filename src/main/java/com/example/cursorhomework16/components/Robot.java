package com.example.cursorhomework16.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    private final Hands hands;
    private final Head head;
    private final Legs legs;

    @Autowired
    public Robot(Hands hands, Head head, Legs legs) {
        this.hands = hands;
        this.head = head;
        this.legs = legs;
        System.out.println("Robot created");
        robotPush();
        robotMove();
        robotThink();
    }

    public void robotPush() {
        hands.push();
    }

    public void robotMove() {
        legs.move();
    }

    public void robotThink() {
        head.think();
    }
}
