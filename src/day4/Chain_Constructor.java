package day4;

class Chain{
	int t;
	Chain(int a){
		super();//here subclass calling object class(parent class for all sub classes) default constructor.
		this.t=a;
		System.out.println(t);
	}
	Chain(Chain c){
		int f=c.t;
		System.out.println(f);
	}
	public void display() {
		System.out.println(t);
	}
}
public class Chain_Constructor {
	public static void main(String[] args) {
		//creating an object and passing the value to parameterized constructor.
		Chain ch=new Chain(10);
		//with an object reference (ch)  we are call display method in it
		ch.display();
	}
}
