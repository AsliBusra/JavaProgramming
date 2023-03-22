package day04_Variables;

import javax.lang.model.SourceVersion;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age: 38 years old
        byte age = 38;

        //weight:160 pounds
        //byte weight = 160; //160 is out of byte' renge
        //byte num = -129; // -129 is out of byte' range
        short weight = 160; //160 is within the range of short

        //salary: 100000 $
        //short salary =100000; //100000 is out of short' range
        int salary = 100_000; //100000 is the preffered data type integer numbers

        long asset = 3_333_333_333L; //

        //tax:0.26
        float tax = 0.26F;

        double PI = 3.14;


        char gender = 'F';
        char grade = 'F';
        char yesNo = 'Y';

        System.out.println(yesNo);
        // char ch5 = 'AB';

        boolean isEmployed = true;
        boolean isMarried = false;

        boolean result = 100 > 300 ;
        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "Mclean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

        String first_name$ ="Muhtar";
        int num1 = 100;
        int num2 = 200;








    }
}
