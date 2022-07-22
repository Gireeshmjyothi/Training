package day4;
//Hierarchy inheritance, multiple sub-class inherit one super class 
class Car{
	String break_="To Stop";
	String clutch="To Shift the Gears";
	String acceleration="To increase the speed";
	
	public void driver() {
		System.out.println("Break : "+break_);
		System.out.println("Clutch : "+clutch);
		System.out.println("Acceleration : "+acceleration);
	}	
}
//Nano class acquiring properties from Car class.
class Nano extends Car{
	public void nanoCar() {
	super.driver();
	}
}
class Bmw extends Car{
	String musicplayer="Playing song";
	
	public void bmwCar() {
		super.driver();
		System.out.println(musicplayer);
	}
}
//Audi class acquiring properties from Car class.
class Audi extends Car{
	String musicplayer="Playing song";
	String newAc="21c";
	
	public void audiCar() {
		super.driver();
		System.out.println(musicplayer);
		System.out.println("Ac temperature : "+newAc);
	}
}
public class Hierarchy_Inheritance {
	public static void main(String[] args) {
		System.out.println("Nano Car");
		Nano c=new Nano();
		c.nanoCar();
			
		System.out.println("BMW Car");
		Bmw b=new Bmw();
		b.bmwCar();
		
		System.out.println("AUDI Car");
		Audi a=new Audi();
		a.audiCar();
		}
}

