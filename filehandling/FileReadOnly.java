package com.josh.java.filehandling;

import java.io.File;

public class FileReadOnly {

	public static void main(String[] args) {

		File file = new File("D:\\data\\javatext.txt");
		// making the file read only
		boolean flag = file.setReadOnly();
		if (flag == true) {
			System.out.println("File successfully converted to Read only mode!!");
		} else {
			System.out.println("Unsuccessful Operation!!");
		}

		//File newfile = new File("D:\\data\\javatext.txt");
		// Checking whether file is writable or not
		if (file.canWrite()) {
			System.out.println("File is writable.");
		} else {
			System.out.println("File is read only.");
		}
	}

}
