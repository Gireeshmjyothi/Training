package com.josh.java.filehandling;

import java.io.File;

public class MainDriver {

	public static void main(String[] args) {
		// Here calling bufferWriter and bufferReader method to read and write files in
		// the specified path
		BufferWriter.bufferWriter();
		BufferReader.bufferReader();

		File del = new File("D:\\data\\book.text");
		// Deleting an existing file
		del.delete();

	}

}
