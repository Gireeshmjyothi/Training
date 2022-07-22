package day6;

//if we use class as final then that class con't be inherit.
final class Car{
	public void start() {
		System.out.println("start");
	}
	public void accelerate() {
		System.out.println("moving");
	}
	public void stop() {
		System.out.println("stop");
	}
}
// the type Bmw connote be sub-class of Car 
/*
 *  class Bmw extends Car{

		public void start() {
		System.out.println("start");
	}
	public void accelerate() {
		System.out.println("moving");
	}
	public void stop() {
		System.out.println("stop");
	}
*/
public class Final_class {
	public static void main(String[] args) {
		
	}
}
