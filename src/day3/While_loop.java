package day3;
import java.util.Scanner;

public class While_loop {
	
	public static void main(String[] args) {
		System.out.println("Enter the max range");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int a=0,b=1,c=0;
		//while loop is used when we know terminating condition.
		while(a<range) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		sc.close();
	}
}
