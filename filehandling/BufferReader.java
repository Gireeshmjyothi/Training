package com.josh.java.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void bufferReader() {
		// Let us print modified file
		try {
			BufferedReader in = new BufferedReader(new FileReader("D:\\data\\notes.txt"));

			String mystring;

			// TIll there is content in string
			// condition holds true
			while ((mystring = in.readLine()) != null) {
				System.out.println(mystring);
				in.close();
			}
		}

		// Catch block to handle IO exceptions
		catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
	}
}
