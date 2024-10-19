package main.java.by.rublevskaya.lesson7.geometry.figure;

import main.java.by.rublevskaya.lesson7.geometry.quadrangle.Square;
import main.java.by.rublevskaya.lesson7.geometry.quadrangle.Rectangle;
import main.java.by.rublevskaya.lesson7.geometry.triangle.IsoscelesTriangle;
import main.java.by.rublevskaya.lesson7.geometry.triangle.RightTriangle;
import main.java.by.rublevskaya.lesson7.geometry.ring.Circle;

public class FigureShow {
    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
        figures[0] = new RightTriangle(3, 4); // Прямоугольный треугольник
        figures[1] = new IsoscelesTriangle(5, 6); // Равнобедренный треугольник
        figures[2] = new Circle(3); // Круг
        figures[3] = new Rectangle(4, 5); // Прямоугольник
        figures[4] = new Square(4); // квадрат

        double totalPerimeter = 0;
        double totalArea = 0;

        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName());
            figure.print();
            System.out.println();
            totalPerimeter += figure.perimeter();
            totalArea += figure.area();
        }
        System.out.println("sum of all perimeters: " + totalPerimeter);
        System.out.println("sum of all areas: " + totalArea);
    }
}
