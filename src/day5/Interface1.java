package day5;

interface Vehicle {
    public String licensePlate = "";
    public float maxVel=100;
    public void start();
    public void stop();
    default void blowHorn(){
      System.out.println("Blowing horn");
   }
}
class Truck implements Vehicle {
    public void start() {
        System.out.println("starting engine...");
    }
    public void stop() {
        System.out.println("stopping engine...");
    }
}

public class Interface1 {
	public static void main(String[] args) {
		Vehicle tesla = new Truck();
		tesla.start(); 
		tesla.stop();
	}
}
