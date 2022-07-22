package day5;

class Father{
	String secondName="Sharma";
	String bloodGroup="B +ve";
	int age=35;
	
	public Father() {
		System.out.println("Living in London");
	}
	void m1() {
		System.out.println("m1()");
	}
}
class Son extends Father{
	int  age=12;
	
	public void display() {
		//compiler will implicitly add parent class constructor with the help of super keyword
		System.out.println("SecondName : "+secondName);
		System.out.println("BloodGroup : "+bloodGroup);
		System.out.println("Age : "+this.age);
		// here we  calling parent class m1() method explicitly using super keyword
		super.m1();
	}
}

public class Super_key {
	//here this method is used for just visible to importing_package.java
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Son s=new Son();
		s.display();
	}
}
