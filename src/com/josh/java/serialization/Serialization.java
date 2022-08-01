package com.josh.java.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// Passing multiple student data into StudentData type class
		StudentData[] studentdata = { new StudentData(401, "Raju", 89.50), new StudentData(401, "Raju", 89.50),
				new StudentData(401, "Raju", 89.50), new StudentData(401, "Raju", 89.50) };
		try {
			FileOutputStream createfile = new FileOutputStream("D:\\data\\studentdata.ser");
			ObjectOutputStream writefile = new ObjectOutputStream(createfile);
			writefile.writeObject(studentdata);
			System.out.println("Serialization completed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
