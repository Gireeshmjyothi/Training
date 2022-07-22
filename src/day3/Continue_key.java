package day3;
import java.util.Scanner;

public class Continue_key {
	public static void main(String[] arg){
		
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
       // continue key is used to skip the execution when condition is satisfied.
            if(i<=1)continue;
            boolean flag=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag)System.out.println(i);
        }
        sc.close();
    }
}
