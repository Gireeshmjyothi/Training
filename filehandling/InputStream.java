package com.josh.java.filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) {
		// Try block to check for exceptions
		try {
			FileInputStream read = new FileInputStream("D:\\data\\story.txt");
			BufferedInputStream readfile = new BufferedInputStream(read);
			// Printing text file content with help of read() method,
			// available method will return an integer if there is no content then it will
			// return 0
			while (readfile.available() > 0) {
				System.out.print((char) readfile.read());
			}
			// Closing the connection
			readfile.close();
			read.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
