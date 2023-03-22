package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = -2147483648;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }


        }
        System.out.println("Maximum number is " + max);

        sc.close();

    }
}
