package main.java.by.rublevskaya.lesson7.katushaITClub.employee;

import main.java.by.rublevskaya.lesson7.katushaITClub.position.Position;

public class Worker implements Position {

    @Override
    public void showPosition() {
        System.out.println("Position: worker");
    }
    public void performWork() {
        System.out.println("the worker does sad tasks");
    }
}
