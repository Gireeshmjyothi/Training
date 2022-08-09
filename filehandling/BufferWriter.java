package com.josh.java.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
	// TO append string into a file
	public static void bufferWriter() {
		// Try block to check for exceptions
		try {

			// Open given file in append mode by creating an
			// object of BufferedWriter class
			// Creating a sample file with some random text
			String fileName = "D:\\data\\notes.txt";
			String text = "Hello world";
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));

			// Writing on output stream
			out.write(text);
			// Closing the connection
			out.close();
		}

		// Catch block to handle the exceptions
		catch (IOException e) {

			// Display message when exception occurs
			System.out.println("exception occurred" + e);
		}
	}
}
