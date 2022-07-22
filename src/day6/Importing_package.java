package day6;
//here importing package day5 and class name as Super_key.
import day5.Super_key;

public class Importing_package {

	public static void main(String[] args) {
		Super_key pk=new Super_key();
		int result=pk.add(10, 10);
		System.out.println("Addition of two num="+result);
	}

}
