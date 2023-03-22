package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");

        String fullName = input.nextLine();

        System.out.println("Enter your Programming Language:");
        String programming = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt(); // 29 enough but enter need

        input.nextLine(); //Enter

        System.out.println("Enter your scholl name:");
        String schoolName = input.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();
    }
}
