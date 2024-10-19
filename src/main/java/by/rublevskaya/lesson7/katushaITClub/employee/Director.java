package main.java.by.rublevskaya.lesson7.katushaITClub.employee;

import main.java.by.rublevskaya.lesson7.katushaITClub.position.Position;

public class Director implements Position {

    @Override
    public void showPosition() {
        System.out.println("Position: director");
    }
    public void signPapers(){
        System.out.println("give instructions and sign important papers");
    }
}
