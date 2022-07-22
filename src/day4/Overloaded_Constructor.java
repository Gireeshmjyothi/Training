package day4;

class Box{
	
	int height;
	int width;
	int length;
	/*Same constructor name with numbers of parameter then we call constructor overloading.*/
	public Box(int length, int width, int height ) {
		this.height = height;
		this.width = width;
		this.length = length;
	}
	public Box(int n) {
		this(n,n,n);
	}
	public Box(Box b) {
		System.out.println(b.length+b.width+b.height);
	}
	public void display() {
		System.out.println("Length["+length+"]\tWidth["+width+"]\tHeigtht["+height+"]");
	}
}

class Overloaded_Constructor {
	public static void main(String[] args) {
		Box b=new Box(10,10,20);
		b.display();
		Box b1=new Box(20);
		b1.display();
	}
}
