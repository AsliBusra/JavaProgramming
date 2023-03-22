package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score =85;
        char letterGrade;

        if (score >= 90 && score <= 100){
            //System.out.println("A");
            letterGrade = 'A';
        }else if (score >= 80 && score <= 89) {
            //System.out.println("B");
            letterGrade = 'B';
        }else if (score >= 70 && score <= 79){
            //System.out.println("C");
            letterGrade= 'C';
        }else if (score >= 60 && score <= 69) {
            //System.out.println("D");
            letterGrade = 'D';
        }else{
            //System.out.println("F");
            letterGrade= 'F';
        }
        System.out.println("letterGrade = " + letterGrade);;
    }
}
