package com.josh.java.filehandling;

import java.io.File;

public class HiddenFile {

	public static void main(String[] args) {
		//
		File file = new File("D:\\data\\notes.txt");
		//isHidden method return true or false based on the file is hidden or not
		if(file.isHidden()) {
			System.out.println("given file is hidden");
		}
		else {
			System.out.println("given file is  not hidden");
		}
	}

}
