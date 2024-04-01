import java.text.DecimalFormat;
import java.util.*;
class GradeCalculator {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. Of Subject: ");
        int noOfSub = sc.nextInt();
        int Final = 0;
        String grade ;


        for (int i = 1; i <= noOfSub; i++) {
            System.out.println("Enter Marks Obtain In Subject - " + i + ":");
            int marks = sc.nextInt();
            Final += marks;
        }
        double APercentage = (double)Final/noOfSub;
        if ( APercentage >= 95 && APercentage <=100) {
            grade = "E";
        } else if (APercentage >= 90 && APercentage < 95){
            grade = "O";
        } else if (APercentage >= 80 && APercentage < 90){
            grade = "A";
        } else if (APercentage >= 70 && APercentage < 80){
            grade = "B";
        } else if (APercentage >= 65 && APercentage < 70){
            grade = "C";
        } else if (APercentage >= 41 && APercentage < 65){
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " +Final+"/"+noOfSub*100);
        System.out.println("Avarage Parcentage: "+  df.format(APercentage));
        System.out.println("Grade: " + grade);

        sc.close();
    }
}