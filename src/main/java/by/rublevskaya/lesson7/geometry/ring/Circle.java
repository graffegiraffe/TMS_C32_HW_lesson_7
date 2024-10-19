package main.java.by.rublevskaya.lesson7.geometry.ring;

import main.java.by.rublevskaya.lesson7.geometry.figure.Figure;

public class Circle extends Figure {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2*Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
