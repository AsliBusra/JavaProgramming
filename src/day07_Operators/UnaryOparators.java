package day07_Operators;

public class UnaryOparators {
    public static void main(String[] args) {
        int a =100;
        System.out.println(++a);
        System.out.println("-----------------------------------");

        int b =100;
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(--b);
        System.out.println("-----------------------------------");

        int c=100;
        System.out.println(c++);
        System.out.println(c);
        System.out.println("-----------------------------------");

        int x=200;
        System.out.println(--x);

        int y =200;
        System.out.println(y--);
        System.out.println("-----------------------------------");

        int z=45;
        System.out.println(++z); //46
        System.out.println(z++);//46
        System.out.println(z);//47

        int q=30;
        System.out.println(--q);//29
        System.out.println(q--);//29
        System.out.println(q);//28




    }
}
