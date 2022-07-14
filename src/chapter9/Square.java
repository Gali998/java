package chapter9;

public class Square extends Rectangle{

    //override method
    @Override
    public double calculateParameter(){
        return slides * length;
    }

    //overload inheritance method
    public void print(String what){
        System.out.println("I am a "+what);

    }
}
