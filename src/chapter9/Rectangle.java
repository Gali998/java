package chapter9;

public class Rectangle {

    protected double length;
    protected double width;
    protected double slides = 4;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSlides() {
        return slides;
    }

    public void setSlides(double slides) {
        this.slides = slides;
    }

    public double calculateParameter(){
        return (2*length)+(2*width);
    }

    public void print(){
        System.out.println("I am a rectangle");
    }

}
