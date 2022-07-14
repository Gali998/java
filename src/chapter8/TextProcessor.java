package chapter8;

public class TextProcessor {

    public static void main(String[] args){
//        countWords("I love test automation university");
//        reverseString("Hello Shey");
        addSpaces("HelloWorld!It'sMeShey");
    }

    /**
     * splits a String into an array by tokenizing it.
     * counts words and prints them
     * @param text full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int noOfWords = words.length;

        String message = String.format("Your text contains %d words:",noOfWords);
        System.out.println(message);

        for (int i=0;i<noOfWords;i++){
            System.out.println(words[i]);
        }
    }

    public static void reverseString(String text){
        for (int i=text.length()-1;i>=0;i--){
            System.out.println(text.charAt(i));
        }
    }

    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for (int i =0;i<modifiedText.length();i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
