package chapter6;

public class Rectangle {

    /*
    fields of a rectangle
    private means no other code ,outside of this class can access
    protected - other class with same package can access
     */

    private double length;
    private double width;

    public Rectangle(){
        //initialize the object
        length = 0;
        width = 0;
    }

    public Rectangle(double length,double width){
        //this.length = length;
        setLength(length);
        setWidth(width);

    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2*length)+(2*width);

    }

    public double calculateArea(){
        return length*width;
    }
}
