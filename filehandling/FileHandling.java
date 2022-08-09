package com.josh.java.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// Passing fully qualified path to create a new folders and files in it
		File creates = new File("D:\\FileHanding\\TextFiles\\write.txt");

		// Creating new folder using mkdir() method
		creates.mkdir();
		try {
			// Creating a text file here using createNewFile() method
			creates.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		// canRead() method is used to read the file or not if can then return true or
		// else return false
		System.out.println(creates.canRead());
		System.out.println(creates.exists());
		// Here storing the number of files and folders in string array from the given
		// below path
		File list = new File("C:\\Users\\Admin");
		String[] arr = list.list();

		// iterating the files and folders present in string list using for Each loop
		for (String str : arr) {
			System.out.println(str);
		}
		// Here we finding the number of files and folders present in it
		int fileCount = 0;
		int folderCount = 0;
		for (int i = 0; i < arr.length; i++) {
			File entry = new File(list, arr[i]);
			if (entry.isDirectory()) {
				folderCount++;
			} else {
				fileCount++;
			}
		}
		// Printing statement
		System.out.println("Number of folder :" + folderCount);
		System.out.println("Number of file :" + fileCount);
	}

}
