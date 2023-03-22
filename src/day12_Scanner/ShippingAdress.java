package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName= scan.nextLine();

        System.out.println("Enter your building name:");
        String buildingName = scan.next();

        scan.nextLine();

        System.out.println("Enter your street name:");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        scan.nextLine();

        System.out.println("Enter your zip code:");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your country name:");
        String country = scan.nextLine();


        String shippingAdress = fullName +"\n" + buildingName + ". "
        +streetName + "\n"+ cityName+ "/"+state+"\n"+zipCode+"\n"+country;

        System.out.println(shippingAdress);


        scan.close();
    }
}
