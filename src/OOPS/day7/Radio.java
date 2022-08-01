package day7;
import java.util.Scanner;
public class Radio {
	
Scanner sc=new Scanner(System.in);
	
	public void fmRadio() {
		System.out.println("Press 1 for REDFM and Press 2 for RadioMirchi");
		int FM=sc.nextInt();
		if(FM==1) {
			System.out.println("REDFM 93.5--Indian News");
			}
		else if(FM==2) {
			System.out.println("RadioMirchi 105.5--Playing music");
		}
	}
}
