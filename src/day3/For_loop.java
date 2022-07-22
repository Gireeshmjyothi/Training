package day3;
import java.util.Scanner;

public class For_loop {
	   public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter String");
	        String st=sc.nextLine();
	        int b=st.length();
	        int vowels=0;
	        char[] a={'a','e','i','o','u'};
	   //for loop is used based on the index and we can run for loop in bidirection.
	        for(int i=0; i<a.length;i++)
	        {
	            char vls=a[i];
	            for(int j=0;j<st.length();j++)
	            {
	                char ch=st.charAt(j);
	                if(vls==ch)
	                    vowels++;
	            }
	        }
	        int conson=b-vowels;
	        System.out.println("Vowels:"+vowels);
	        System.out.println("Consonants:"+conson);
	        sc.close();
	    }
}
