package day10_NestedIf;

public class FieldGrip {
    public static void main(String[] args) {

        int grade = 4;
        String location = "";
        int groupNumber =0;
        String teacher ="";

        if (grade >=1 && grade<=4){
            if (grade ==1){
                location="Apple Orchad";
                groupNumber=3;
                teacher="Mrs.Smith";
            }else if (grade==2){
                location="Zoo";
                groupNumber=7;
                teacher="M.Lee";
            } else if (grade==3) {
                location="Aquarium";
                groupNumber=5;
                teacher="Ms.Wilson";
            } else{
                location="Movie Theater";
                groupNumber=2;
                teacher="Ms.Reyes";
            }
        }else{
            System.out.println("Invalid grade");
        }

        System.out.println("location = " + location);
        System.out.println("groupNumber = " + groupNumber);
        System.out.println("teacher = " + teacher);


    }
}
