package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int number =5;

        boolean has28Days = number ==2;
        boolean has30Days = number ==4 || number==6||number==9||number==11;
        boolean has31Days = !has28Days && !has30Days;

        if (has28Days){
            System.out.println(number+ "month is 28Days");
        }
        if (has30Days){
            System.out.println(number+ "month is 30Days");
        }
        if (has31Days){
            System.out.println(number+ "month is 31Days");
        }







    }
}
