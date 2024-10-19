package main.java.by.rublevskaya.lesson7.katushaITClub.employee;

import main.java.by.rublevskaya.lesson7.katushaITClub.position.Position;

public class Accountant implements Position {

    @Override
    public void showPosition() {
        System.out.println("Position: accountant");
    }
    public void cashAccounting(){
        System.out.println("keep accounting records");
    }
}
