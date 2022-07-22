package day3;
import java.util.Scanner;

public class Do_while {
	
	public static void main(String[]args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
       //do while execute atleast once irrespective of checking the condition.
        do{
            sum=0;
            while(n>0)
            {
                sum+=n%10;
                n/=10;
            }
            System.out.println(sum);
            n=sum;
        }
        while(n>9);
        sc.close();
    }
}
