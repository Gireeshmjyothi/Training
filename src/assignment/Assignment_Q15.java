package assignment;

import java.util.Scanner;

class Bubble{
	public static int[] bubblesort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
public class Assignment_Q15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();  
		System.out.println("Enter the array elements here");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int[] sortedArray=Bubble.bubblesort(arr);
		for(int a:sortedArray) {
			System.out.print(a+" ");
		}
		sc.close();
	}

}
