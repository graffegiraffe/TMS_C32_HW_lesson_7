package main.java.by.rublevskaya.lesson7.katushaITClub.position;

import main.java.by.rublevskaya.lesson7.katushaITClub.employee.Accountant;
import main.java.by.rublevskaya.lesson7.katushaITClub.employee.Director;
import main.java.by.rublevskaya.lesson7.katushaITClub.employee.Worker;

import java.util.Scanner;

public class PositionRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the job number (1 - Director, 2 - Worker, 3 - Accountant):");
        int jobNumber = scanner.nextInt();

        Position position = null;

        switch (jobNumber) {
            case 1:
                position = new Director();
                ((Director) position).signPapers();
                break;
            case 2:
                position = new Worker();
                ((Worker) position).performWork();
                break;
            case 3:
                position = new Accountant();
                ((Accountant) position).cashAccounting();
                break;
            default:
                System.out.println("Invalid job number");
        }
        position.showPosition();
    }
}