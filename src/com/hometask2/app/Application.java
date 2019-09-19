package com.hometask2.app;


import com.hometask2.app.shapes.Rectangle;
import com.hometask2.app.shapes.Shape;

public class Application {

    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 5);
        printShape(shape);
    }

    private static void printShape(Shape shape) {
        System.out.println(shape.computeArea());
    }
}
