package assignment;
import java.util.Scanner;
public class Assignment02 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int sum=a,base=1;
		while(n!=0) {
			sum=sum+(b*base);
			base*=2;
			System.out.print(sum+" ");
			n--;
		}
		sc.close();
	}
}
