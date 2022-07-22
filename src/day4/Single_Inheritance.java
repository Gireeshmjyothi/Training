package day4;

class Phone{
	String contactList="My contact list";
	double bluetoothVersion=4.1;
	String game="Mario";
	public void display() {
		System.out.println(contactList);
		System.out.println("BT_Version : "+bluetoothVersion);
		System.out.println("Game : "+game);
	}
}
//SmartPhone class acquiring Phone properties here.
class SmartPhone extends Phone{
	int cameraMP=63;
	String gen="5G";
	public void display() {
		super.display();
		System.out.println("CameraVerion : "+cameraMP+"MP");
		System.out.println("Gen : "+gen);
	}
}
public class Single_Inheritance {
	public static void main(String[] args) {
		Phone p=new Phone();
		p.display();
		System.out.println("---------------");
		Phone ph=new SmartPhone();
		ph.display();
	} 
}
