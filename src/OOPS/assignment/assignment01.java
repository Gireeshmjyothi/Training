package assignment;
import java.util.Scanner;
public class assignment01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%2!=0)System.out.println("Weird");
			else if(i>=2 && i<=6)System.out.println("Not Wei rd");
		}
		sc.close();
	}

}
