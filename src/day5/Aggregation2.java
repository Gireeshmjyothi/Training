package day5;

class Laptop{
	/*protected access modifier can access within package and out side the package also,
	    if we want to access out side the package then it should be  sub-class in it.
	*/
	protected	int keys;
	protected String display;
	protected String mousepad;
	protected	String speaker;
	
	public Laptop(int keypad, String display, String mousepad, String speaker) {
		this.keys = keypad;
		this.display= display;
		this.mousepad = mousepad;
		this.speaker = speaker;
	}
	public void features() {
		System.out.println("Number of keys :"+keys);
		System.out.println("Display :"+display);
		System.out.println("Mousepad :"+mousepad);
		System.out.println("Speaker :"+speaker);
	}
}
class HP{
	Laptop l;
	String os;
	
	public HP(String os,Laptop l) {
		this.os=os;
		this.l=l;
	}
	public void display() {
		System.out.println("Operating System :"+os);
		l.features();
	}
}
class MacBook{
	Laptop i;
	String os;
	
	public MacBook(String os,Laptop i) {
		this.i = i;
		this.os = os;
	}
	public void display() {
		System.out.println("Operating System :"+os);
		i.features();
	}
}

public class Aggregation2 {
	public static void main(String[] args) {
		Laptop lp=new Laptop(104,"LED","Touch with key","Dolby");
		HP hp=new HP("Window",lp);
		hp.display();
		System.out.println("----------------------");
		Laptop lp1=new Laptop(84,"LED","Touch pad","Dolby-pluse");
		MacBook mk=new MacBook("iOS",lp1);
		mk.display();

	}

}
