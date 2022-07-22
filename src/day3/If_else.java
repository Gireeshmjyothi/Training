package day3;

public class If_else {
	//if statement is used to check the condition if condition is satisfied the body will be execute or else else body will execute.
	public void evenNum(int a) {
		int n=a;
		int b=(n/2)*2;
		if(b==n)System.out.println("The given number is Even");
		else System.out.println("The given numbr is Odd");
	}
	
	public void equalNum(int a,int b) {
		// if else_if is used to check the multiple conditions and then satisfied condition will execute.
		if(a>b)System.out.println(a+" is greater than "+b);
		else if(b>a)System.out.println(b+" is greater than "+a);
		else System.out.println("Both are same ");
	}
	
	public static void main(String[] args) {
		If_else st=new If_else();
		st.evenNum(9);
		st.equalNum(1,4);
	}
}
