package day5;

class SetData{
	//wrapping a data members in single unit.
	private int age;
	private String name;
	private String city;
	//private data can given by using public get method.
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	//here we can set the data using set method.
	public void setAge(int age) {
		if(age>=18)this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setCity(String city) {
		this.city=city;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		SetData sd=new SetData();
		sd.setAge(10);//Age should be greater than 18 then only it will return.
		//sd.setAge(18);
		sd.setName("Ramesh");
		sd.setCity("Bengaluru");
		System.out.println("Age : "+sd.getAge());
		System.out.println("Name : "+sd.getName());
		System.out.println("City : "+sd.getCity());
	}
}
