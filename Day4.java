import java.util.Scanner;
// Find Interest of principal
public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount:");
        float p = sc.nextFloat();

        System.out.print("Enter rate of interest:");
        float n = sc.nextFloat();

        System.out.print("Enter time:");
        float t = sc.nextFloat();

        float ans = ((p*n*t)/100);
        System.out.println("Principal Amount:"+p);
        System.out.println("Rate of Interest:"+n);
                    System.out.println("Time:"+t);
        System.out.println("Interest:"+ans);
    }



}
