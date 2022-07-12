package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTickets {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args ){

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    //return an array
    public static int[] generateNumbers(){
        int[] tickets = new int[LENGTH];

        //randomly generate numbers
        Random random = new Random();

        //assign values
        for (int i=0;i<LENGTH;i++){
            /*
            * assign random value for i value of array
            value between 1-69
            * if the no exists,then generate another no
            * */

            int randomNumber ;

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
            }while (search(tickets,randomNumber));

            //no is unique if we get here,add to the array
            tickets[i] = randomNumber;
        }
        return tickets;
    }

    /**
     *Does a sequential search on the array to find a value
     * @param array array to search through
     * @param noToSearchFor value to search for
     * @return true if found,false if not
     */
    public static boolean search(int[]array,int noToSearchFor){

        //enhance loop-iterate through array and each time assign a current element to value
        for (int value:array){
            if (value==noToSearchFor){
                return true;
            }
        }
        //entire array search and value not found
        return false;
    }

    public static boolean binarySearch(int[]array,int noToSearchFor){
        //array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array,noToSearchFor);
        if (index>=0){
            return true;
        }else return false;

    }
    public static void printTicket(int ticket[]){
        for (int i=0;i<LENGTH;i++){
            System.out.println(ticket[i]+" | ");
        }
    }
}
