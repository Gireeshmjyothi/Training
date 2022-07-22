package day3;

import java.util.Scanner;

public class Switch_case {
	 public static void main(String[] args)   {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the String");
	        String st=sc.next();
	        int s=0,p=0,b=0;
	       for(int i=0;i<st.length();i++){
	        char ch=st.charAt(i);
	        //Switch case is used to multiple statement in one condition and it is also works on particular data type like int,char and string.
	        switch(ch){
	            case '{':b++;break;
	            case '}':b--;break;
	            case '(':p++;break;
	            case ')':p--;break;
	            case '[':s++;break;
	            case ']':s--;break;
	        }
	      }
	       if(s==0&&p==0&&b==0)
	       System.out.println("Balanced String");
	       else
	       System.out.println("Not Balanced String");
	       sc.close();
	    }
}
