package com.hometask2.tests.shapes;

import com.hometask2.app.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void computeArea() {
        Rectangle rectangle = new Rectangle(1.9, 1.1);
        assertEquals(1.9 * 1.1, rectangle.computeArea());
    }
}