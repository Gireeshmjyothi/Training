package day4;
//Here GrandFather class implicitly extending object.
class GrandFather{
	String secondName="Sharma";
	String color="Drak Borwn";
	String bloodGroup="B +ve";
	protected double height=6.1;
	
	public void display() {
		
		System.out.println("SecondName : "+secondName);
		System.out.println("Color : "+color);
		System.out.println("BloodGroup : "+bloodGroup);
		System.out.println("Height : "+height);
	}	
}
//here Father class acquiring  GrandFather properties.
class Father extends GrandFather{
	String color="Light brown";
	double height=5.6;
	public void display() {
		System.out.println("SecondName : "+super.secondName);
		System.out.println("BloodGroup : "+super.bloodGroup);
		System.out.println("Color : "+color);
		System.out.println("Height : "+height);
	}
}
// here Son class extending Father class properties the reason we call multi-level inheritance.
class Son extends Father{
	String color="White";
	public void display() {
		System.out.println("SecondName : "+super.secondName);
		System.out.println("Height : "+super.height);
		System.out.println("Color : "+color);
	}
}
public class MultiLevel_Inheritance {
	public static void main(String[] args) {
		GrandFather gf=new Father();
		gf.display();
		System.out.println("---------------");
		Father f=new Son();
		f.display();
	}
}
