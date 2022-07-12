package chapter6;

/*
* Write a class that creates instance of the rectangle class to find the
* total area of 2 rooms in a house
* */
public class HomeAreaCalculator {

    public static void main(String args[]){

        //create instance of rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(30);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        //create instance of rectangle class 2
        Rectangle room2 = new Rectangle(30,80);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1+areaOfRoom2;

        System.out.println("Area of both rooms: "+totalArea);

    }

}
