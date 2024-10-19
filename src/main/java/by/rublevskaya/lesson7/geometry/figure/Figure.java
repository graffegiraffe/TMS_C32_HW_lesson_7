package main.java.by.rublevskaya.lesson7.geometry.figure;

public abstract class Figure {

    public abstract double area();
    public abstract double perimeter();

    public void print() {
        System.out.println( "area is " + area());
        System.out.println( "perimeter is " + perimeter());
    }
}
