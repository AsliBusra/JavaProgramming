package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int n=10;
        String result;

        if (n>=1 && n <=12){
            if (n==1){
                result="January";
            } else if (n==2){
                result="February";
            }else if (n==3){
                result="March";
            }else if (n==4){
                result="April";
            }else if (n==5){
                result="May";
            }else if (n==6){
                result="June";
            }else if (n==7){
                result="July";
            }else if (n==8){
                result="August";
            }else if (n==9){
                result="September";
            }else if (n==10){
                result="October";
            }else if (n==11){
                result="November";
            }else{
                result="December";
            }

        }else{
            result="Invalid";
        }
        System.out.println(result);


        System.out.println("---------------------------------");

        String nameOfMonth =(n==1)? "Jan" : (n==2)? "Feb" : (n==3)? "March"
                : (n==4)? "April":(n==5)? "May":(n==6)? "Jun": (n==7)? "July"
                : (n==8)? "Aug":(n==9)? "Sep":(n==10)? "Oct":(n==11)? "Nov": "Dec";

        System.out.println(nameOfMonth);
        
        
        
        
        
    }
}
