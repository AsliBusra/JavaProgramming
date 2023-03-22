package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float avarageScore = 20.5f;
        byte num1 = (byte) avarageScore; //explicit casting
        short num2= (short) avarageScore; //explicit casting
        int num3 = (int) avarageScore; //explicit casting
        long num4= (long) avarageScore; //explicit casting
        float num5= avarageScore;//no casting
        double num6 =avarageScore; //implicit casting

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


    }
}
