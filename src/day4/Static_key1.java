package day4;

class Bike{
	//static key is common property for all object.
	private static int start=1000,citycode=51;
	int num;
	String color;
	
	Bike(String color){
		this.color=color;
		num=++start;
	}
	public void display() {
		System.out.println("Color : "+color);
		System.out.println("KA - "+citycode+"-A-"+start);
	}
}
public class Static_key1 {
	public static void main(String[] args) {
		Bike b1=new Bike("Red");
		b1.display();
		Bike b2=new Bike("Black");
		b2.display();
	}
}
