package day4;

class Std_detail{
	
	String city;
	static String collegeName;
	int stdId;
	String stdName;
	static int count=0;
	Std_detail(String city,String collegeName){
		Std_detail.collegeName=collegeName;
		this.city=city;
		count++;
	}
	Std_detail(int stdId,String stdName){
		this("Bengaluru","KLE MSSCET");
		this.stdId=stdId;
		this.stdName=stdName;
	}
	public void display() {
		System.out.println("city : "+this.city+"\n"+"College Name : "+Std_detail.collegeName);
		System.out.println("Student ID : "+this.stdId+"\n"+"Student Name : "+this.stdName);
		System.out.println("Number of Students : "+count);
	}
}

public class Static_key2 {
	public static void main(String[] args) {
		Std_detail std=new Std_detail(401,"Ramesh");
		std.display();
		System.out.println("------------------");
		Std_detail std1=new Std_detail(402,"Suresh");
		std1.display();
	}
}
