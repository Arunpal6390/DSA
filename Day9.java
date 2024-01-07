import java.util.Scanner;

/*
write the java code reverse integer
exp-
45 ->54

 */
public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = sc.nextInt();
        int ans=0;
        int rem;
        while(num!=0){
            rem=num%10;
            num = num/10;
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10){
                System.out.println(0);
            }
            ans = ans*10+rem;
        }
        System.out.println("Ans is:"+ans);
    }


}
