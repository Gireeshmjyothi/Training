package day4;
import java.util.Scanner;

class Book{
	String title;
	String author;
	double price;
	//here we just passing different value to the constructor, we call parameterized constructor.
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void display() {
		System.out.println("Title is : "+title);
		System.out.println("Author is : "+author);
		System.out.println("Price is : "+price);
	}
}
class BookCreator{
	// this class mainly used to create book as  a user input.
	public static Book bookCreator() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title");
		String t=sc.nextLine();
		System.out.println("Enter the auther name");
		String a=sc.nextLine();
		System.out.println("Enter the price");
		double p=sc.nextDouble();
		sc.close();
		return new Book(t,a,p);	
	}
	
}
public class Parameterized_constructor {
	
		public static void main(String[] args) {
			Book b=BookCreator.bookCreator();
			b.display();
		}
}
