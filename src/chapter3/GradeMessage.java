package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]){

        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "you need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error!invalid grade";
        }




    }

}