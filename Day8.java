import java.util.Scanner;

public class Day8 {
    /*
       leap year  condition
     1.if year divided by 400 then it is called leap year
     .if year divided by 4 and not divided by 100;
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println("Given year is leap year");
        }
        else if (year%4==0 && year%100!=0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not leap year");
        }

    }



}
