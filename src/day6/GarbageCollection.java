package day6;
class Box {
	int height;
	int width;
	
	public Box(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public void  display() {
		System.out.println("Height["+height+"] , Width["+width+"]");
	}
	@Override
	//finalize method belongs to object class before going to abandoned garbage collector calls this method.
	protected void finalize() {
		System.out.println("babye bx2");
	}
}
public class GarbageCollection {
	
	public static void main(String[] args) {
		Box bx1=new Box(10,20);
		Box bx2=new Box(20,40);
		bx1=bx2;
		//explicitly we are calling System.gc() method for immediate clean-up abandon in heap area.
		System.gc();
		bx1.display();
	}
}
