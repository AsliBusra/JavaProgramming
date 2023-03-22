package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
        letters[0]='A';
        letters[1]='B';
        */
        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {

            letters[j] = i;

        }
        System.out.println(Arrays.toString(letters));

        System.out.println("----------------------");

        for (char j = 'A', i = 0; j <= 'Z' && i < letters.length; i++, j++) {

            letters[i] = j;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("-----------------------");

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("**********************");

        char ch2 = 'A';
        char[] letters2 = new char[26]; //Z-A
        for (int i = letters2.length - 1; i >= 0; i--, ch2++) {
            letters2[i] = ch2;
        }
        System.out.println(Arrays.toString(letters2));
    }
}
