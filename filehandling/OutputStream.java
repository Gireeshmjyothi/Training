package com.josh.java.filehandling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

	public static void main(String[] args) {
		// create a fileoutputstream object
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {
			fout = new FileOutputStream("C:\\Users\\Shanmukh Talawar\\java\\newtext.txt", true);
			bout = new BufferedOutputStream(fout);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// we need to transfer this string to files
		String st = "Java Training";

		char ch[] = st.toCharArray();
		for (int i = 0; i < st.length(); i++) {
			// we will write the string by writing each
			// character one by one to file
			try {
				bout.write(ch[i]);
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		// by doing fout.close() all the changes which have
		// been made till now in RAM had been now saved to
		// hard disk
		try {
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
