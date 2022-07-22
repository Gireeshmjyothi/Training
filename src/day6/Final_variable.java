package day6;
class Vahicle{
	//here data member mentioned as final the that value con't be changed.
	final  int KA=25;
	String model;
	String color;
	int num;
	
	public Vahicle(String model, String color, int num) {
		this.model = model;
		this.color = color;
		this.num = num;
	}
	public void display() {
		System.out.println("KA-"+KA+"-EQ-"+num);
		System.out.println("Model-"+model);
		System.out.println("Color-"+color);
	}
}

public class Final_variable {
	public static void main(String[] args) {
		Vahicle vc=new Vahicle("CB shine","Black",5810);
		//vc.KA=51; Here we can't change variable KA because that variable assigned as final
		vc.display();
	}
}
