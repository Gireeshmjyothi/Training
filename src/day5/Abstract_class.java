package day5;

abstract class Car{
	 int a;
	 //If anyone trying to extends Car class the they must override below mentioned abstract method
	 public abstract void start();
	 public abstract void accelerate();
	 public abstract void stop();
}

class Audi extends Car{
	//Audi class is extending Class then Audi class must override those methods or else it will throw an error at compile time.
	 public  void start() {
		 System.out.println("Audi started="+this.a);
	 }
	 public  void accelerate() {
		 System.out.println("Audi Moving");
	 }
	 public  void stop() {
		 System.out.println("Audi stopped");
	 }
}

class Bmw extends Car{
	
	 public  void start() {
		 System.out.println("Bmw started"+a);
	 }
	 public  void accelerate() {
		 System.out.println("Bmw Moving");
	 }
	 public  void stop() {
		 System.out.println("Bmw stopped");
	 }
}

public class Abstract_class {
	public static void main(String[] args) {
		Car c=new Audi();
		c.a=200;
		c.start();
		c.accelerate();
		c.stop();
		System.out.println("-----------");
		Car c1=new Bmw();
		c1.a=100;
		c1.start();
		c1.accelerate();
		c1.stop();
	}
}
