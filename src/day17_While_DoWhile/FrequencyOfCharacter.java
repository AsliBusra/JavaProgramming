package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBBC";
        char ch = 'A';

        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (ch == eachChar) {
                frequency++;
            }
        }
        System.out.println(frequency);

        System.out.println("--------------");

        String str2 = "Cat Cat Dog Dog cAt CAT caT";

        int frequency2 = 0;

        for (int i = 0; i < str2.length() - 3; i++) {
            String each = str2.substring(i, i + 3);
            //System.out.println(each);

            if (each.equalsIgnoreCase("Cat")){
                frequency2++;
            }
        }
        System.out.println(frequency2);
    }


}
