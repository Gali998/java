package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){

        System.out.println("Enter the number of hours the employees worked ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();

        double grossPay = hours * rate;

        System.out.println("Gross pay amount: "+grossPay);


    }
}
