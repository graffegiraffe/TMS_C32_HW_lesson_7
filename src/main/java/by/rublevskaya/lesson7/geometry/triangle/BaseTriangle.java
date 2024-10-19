package main.java.by.rublevskaya.lesson7.geometry.triangle;

import main.java.by.rublevskaya.lesson7.geometry.figure.Figure;

public class BaseTriangle extends Figure {

    public double a, b, c;
    public BaseTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
