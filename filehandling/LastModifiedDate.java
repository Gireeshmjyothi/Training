package com.josh.java.filehandling;

import java.io.File;
import java.text.SimpleDateFormat;
/*
 * This class provides the last modified date of specific file
 */
public class LastModifiedDate {

	public static void main(String[] args) {
		// Specifying the file name and path
		File file = new File("D:\\data\\notes.txt");
		SimpleDateFormat lmf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("Last modified date :" + lmf.format(file.lastModified()));

	}

}
