package day5;

class Box{
	//Making same method name and passing different parameter is called method overloading.
	//method overloading is mainly used to clear readability programs.
	public void box(int a) {
		int areaSquare=a*a;
		System.out.println("Area of Square ["+a+"X"+a+"]="+areaSquare);
	}
	public void box(long b) {
		long areaSqaure=b*b;
		System.out.println("Area of Square ["+b+"X"+b+"]="+areaSqaure);
	}
	public void box(int length,int width) {
		int areaRectangle=length*width;
		System.out.println("Area of Rectangle ["+length+"X"+width+"]="+areaRectangle);
	}
	public void box(double length,double width) {
		double areaRectangle=length*width;
		System.out.println("Area of Rectangle ["+length+"X"+width+"]="+areaRectangle);
	}
}

public class Method_overloading {
	public static void main(String[] args) {
		Box b=new Box();
		b.box(10);
		b.box(10,20);
		b.box(25.50,30.75);

	}
}
