package com.hometask2.tests.shapes;

import com.hometask2.app.shapes.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void computeArea() {
        Circle circle = new Circle(10);
        assertEquals(Math.PI * 100, circle.computeArea());
    }
}