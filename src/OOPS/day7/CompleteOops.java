package day7;

class Car extends Driver implements Engine{
	
	static String  numberplate="KA-25-EQ-2963";
	//Static block is used to initialize static members
	static{
		System.out.println(numberplate);
	}
	//Storing the Radio class object reference in Car class is called Aggregation.
	public Car(Radio r) {
		r.fmRadio();
	}
	//interface methods must be implements in implemented class.
	public  void engine() {
		System.out.println("4 Stroke- Petrol Engine");
	}
	public void start() {
		System.out.println("Started");
	}
	public void accelerate() {
		System.out.println("Moving");
	}
	public void stop() {
		System.out.println("Stopped");
	}
}
//Here we Extending and implementing Driver class and Engine interface 
class Bus extends Driver implements Engine{
	static String nameplate="KA-51-AA-2451";
	static 
	{
		System.out.println(nameplate);
	}
	@Override
	public void engine() {
		System.out.println("EngineName : "+engineName);
		System.out.println("4 stroke-Diesel Engine");
	}
	@Override
	public void start() {
		System.out.println("Started");
	}
	@Override
	public void accelerate() {
		System.out.println("Moving");
	}
	@Override
	public void stop() {
		System.out.println("Stopped");
	}
}

public class CompleteOops {

	public static void main(String[] args) {
		
		Car c=new Car(new Radio());
		c.engine();
		System.err.println("---------------");
		Bus b=new Bus();
		b.engine();
	}

}
