package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Wooden", "Spoon");
        System.out.println("-------------");

        domain("asli@gmail.com");
        System.out.println("-------------");

        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "Elminur@cydeo.com", "gulsen@gmail.com" };
        for (String email : emails) {
            domain(email);
        }
        System.out.println("-------------");

        nameOfMonth(5);

        System.out.println("-------------");

        nameOfDay(5);

        System.out.println("-------------");

        daysInMonth(5);



    }

    //1.display the initials of the person,  initials()
    public static void initials(String firstName, String lastName) {
        //System.out.println("Hello World");
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    //2.display the domain of the email,  domain()
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain= " + domain);
    }

    //3.display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March" :
                    (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "June" :
                            (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "Sep" :
                                    (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";

        } else {
            name = "Invalid";
        }
        System.out.println("Month name= " + name);
    }

    //4.display the name of the day based on the given number to the method
    public static void nameOfDay(int number) {
        String name = "";
        if (number >= 1 && number <= 7) {
            name = (number == 1) ? "Mon" : (number == 2) ? "Tue" : (number == 3) ? "Wed" :
                    (number == 4) ? "Thu" : (number == 5) ? "Fri" : (number == 6) ? "Sat" : "Sun";
        } else {
            name = "Invalid";
        }
        System.out.println("Day name= " + name);
    }

    //5.print how many days a month has
    public static void daysInMonth(int number) {

        boolean has28Days = number ==2;
        boolean has30Days = number ==4 || number==6||number==9||number==11;
        boolean has31Days = !has28Days && !has30Days;

        if (has28Days){
            System.out.println(number+ ". month is 28 Days");
        }
        if (has30Days){
            System.out.println(number+ ". month is 30 Days");
        }
        if (has31Days){
            System.out.println(number+ ". month is 31 Days");
        }

    }


}
