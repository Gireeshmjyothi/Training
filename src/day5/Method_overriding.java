package day5;

class OldCar{

	public void musicPlayer() {
		System.out.println("Manual music player");
	}
	public void window() {
		System.out.println("Manual window closer");
	}
	public void steering() {
		System.out.println("Manual Steering");
	}
}
class NewCar extends OldCar{
	//method override, super class methods can be modify according to  sub class requirement.
	@Override
	public void musicPlayer() {
		System.out.println("Touch screen music player");
	}
	@Override
	public void window() {
		System.out.println("Power window closer");
	}
	@Override
	public void steering() {
		System.out.println("Power Steering");
	}
}

public class Method_overriding {
	public static void main(String[] args) {
		OldCar od=new NewCar();
		od.musicPlayer();
		od.window();
		od.steering();
	}

}
