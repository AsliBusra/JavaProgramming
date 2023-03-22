package day21_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names={"Elminur Ablimit","Ali Kilic","Hulya Keles","Simen Kaya",
                "Begench Begenjov","Jonathan Holly","Alshun Rodgers","Manas Kalenov",
                "Gulsen Sohret","Ruveyda Durna",};

        for (String each : names) {
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }
    }
}
