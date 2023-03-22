package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
         int a =10,
                 b=20,
                 c=30;

         boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
         boolean bIsMedian = (b>a && b<c) || (b>c && b<a);
         boolean cIsMedian = !aIsMedian && !bIsMedian;

         if (aIsMedian){
             System.out.println(a+" is the Median Number");
         }
         if (bIsMedian){
             System.out.println(b+" is the Median Number");
         }
         if (cIsMedian){
             System.out.println(c+" is the Median Number");
         }






    }
}
