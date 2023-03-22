package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Aaeron";
        String lastName = "Daniels";
        int age = 19;
        String jobTitle="Senior SDET";
        String companyName="Apple Inc";
        double salary = 100000.58;

        String fullname =firstName+" "+lastName;


        System.out.println(fullname);
        System.out.println("Full name of the person is "+fullname+".");

        System.out.println(fullname+" is "+age+" years old.");

        System.out.println(fullname+" is "+jobTitle+", works at "+companyName+" and "+fullname+"'s salary is $"+salary);










    }
}
