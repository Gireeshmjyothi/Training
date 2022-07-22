package day4;

class Rectangle{
	int length;
	int breadth;
	
	public Rectangle(int length, int breath) {
		this.length = length;
		this.breadth = breath;
	}
	//If we want same object then we go for copy constructor and we pass the same object for different constructor.
	public Rectangle(Rectangle r) {
		this.length=r.length;
		this.breadth=r.breadth;
	}
	public void display() {
		System.out.println("Length : "+length+","+"Breadth : "+breadth);
	}
}
public class Copy_Constructor {
	
	public static void main(String[] args) {
		//Here we initializing some value to get two different Rectangle with same dimension.
		Rectangle r=new Rectangle(20,20);
		r.display();
	}
}
