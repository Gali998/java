package chapter2;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String arg[]){

        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("On a "+adjective+" "+season+" day,I drink a minimum of "+number+" cups of coffee");
    }
}
