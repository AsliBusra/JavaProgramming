package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        //
        char[] alphabets = new char[26]; //Z-A
/*
        alphabets[0]='Z';//90
        alphabets[1]='Y';//89
        alphabets[2]='X';//88

 */
        for (char i = 0, j = 'Z'; i < alphabets.length; i++, j--) {
            alphabets[i] = j;
        }

        //System.out.println(alphabets);
        System.out.println(Arrays.toString(alphabets));
        // System.out.println(alphabets[0]); // printing the element of array


    }
}
