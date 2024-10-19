package main.java.by.rublevskaya.lesson7.katushaITClub.position;

public interface Position {

    void showPosition();
    default void employee(){ System.out.println("employee of the company katushaITClub"); }
}
