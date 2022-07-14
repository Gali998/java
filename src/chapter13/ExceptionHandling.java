package chapter13;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String args[]){

        //createNewFile();
        noExceptionHandling();
    }

    public static void createNewFile(){
        File file = new File("resources/new.txt");

        try{
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Directory does not exist ");
            e.printStackTrace();
        }

    }

    public static void noExceptionHandling(){
        File file = new File("resources/numbers.txt");
        //Scanner fileReader = null;
        try  (Scanner fileReader = new Scanner(file)){
            while (fileReader.hasNext()){
                double no = fileReader.nextDouble();
                System.out.println(no);
            }
        }
        catch (FileNotFoundException |InputMismatchException e){
            e.printStackTrace();
        }
    }
}
