package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("-------------");
        helloCydeo5Times();
        System.out.println("-------------");
        evenNumber();

    }


    //create a func that can print hello world 5 times
    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }

    //create a func that can print hello Cydeo 5 times
    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }
    }

    //create a func that can print all the even numbers from 1~10
    public static void evenNumber(){
        for (int i = 0; i < 11; i+=2) {
            System.out.println(i);

        }
    }

}
