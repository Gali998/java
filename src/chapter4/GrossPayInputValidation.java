package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String args[]){

        //initialize known variable
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variable
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input
        while (hoursWorked>maxHours || hoursWorked<1){
            System.out.println("Invalid entry.Your hours must be between 1 and 40.Try again ");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double grossPay = rate * hoursWorked;
        System.out.println("Gross pay : $"+grossPay);
    }
}
