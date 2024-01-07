import java.util.Scanner;
/*
check number is power of two or not
 */
public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = sc.nextInt();
        if(num<1){
            System.out.println("Gven number is not power of 2");
        }
        while(num!=1){
            if(num%2==1){
                System.out.println("Incorrect");
            }
            num =num/2;
        }

        System.out.println("correct");
    }
}
