package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(10);
        ageOfPerson(1993);
        printNumbers(1000,2000);
    }


    //check if a number is odd number or even number
    public static void oddOrEven(int number ){
        if (number % 2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }
    }

    //display the age of the person
    public static void ageOfPerson(int birthYear){
        int age=2022-birthYear;
        System.out.println("Your age is: "+age);
    }

    //print all the numbers betwen X and Y
    public static void printNumbers(int x, int y){
        System.out.println(x);
        System.out.println(y);
    }
}
