import java.util.Scanner;
public class Day6 {
    //check number is even or odd by if else statement
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is odd");
        }

        System.out.println(n);
    }
}
