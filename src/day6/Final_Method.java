package day6;

class Final1{
	
	public final void A() {
		System.out.println("final method executing");
	}
}
class Final2 extends Final1{
	//Here we trying to override super class A() method.Cannot override the final method from Final1
	/*public void A() {
		System.out.println("final method trying overriding in subclass");
	}*/
}
public class Final_Method {

	public static void main(String[] args) {
		Final1 fm=new Final2();
		fm.A();
	}

}
