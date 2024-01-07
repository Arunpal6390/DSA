import  java.util.Scanner;
public class Day7 {
    //write a program addition of two of more digits and return ans in single digits;
    /*
    example
    43->4+3->7
    1236 ->1+2+3+6 -> 11-2 ->
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number:");
        int num = sc.nextInt();
        while(num>9) {
            int rem;
            int ans = 0;
            while (num != 0) {
                rem = num % 10;
                num = num / 10;
                ans = ans + rem;

            }
            num =ans;

        }
        System.out.println("Addition of two number in single digit:"+num);



    }
}
