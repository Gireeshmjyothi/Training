package day4;

class No_args{
	
	String book;
	String author;
	// Constructor is used to initialize an object, here we are passing zero parameter constructor.
	public No_args() {
        this.book = "Sherlock holmes";
		this.author ="Arthur Conan Doyle";
	}
	public void display() {
		System.out.println("Book Name : "+book);
		System.out.println("Book Author : "+author);
	}
}
public class NoAgs_Constructor {
	No_args ag=new No_args();
}
