package com.josh.jdbc;

import java.util.Scanner;
/*
This class is used to operate CURD operation
 */
public class DriverA2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to create Table");
        System.out.println("Press 2 to delete song based on song number");
        System.out.println("Press 3 to modify attribute");

        int input = scanner.nextInt();
        A2 get=new A2();
        switch (input){
            case 1:
                get.createTable();
                break;
            case 2:
                get.delete();
                break;
            case 3:
                get.modify();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
