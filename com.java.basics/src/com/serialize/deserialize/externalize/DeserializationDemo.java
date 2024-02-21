package com.serialize.deserialize.externalize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public void deserialize() throws IOException {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		Employee emp = null;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\HP\\OneDrive\\Documents\\myFile.csv89");
			objectInputStream = new ObjectInputStream(fileInputStream);
			Employee e = (Employee) objectInputStream.readObject();
			StudentInformation se = (StudentInformation) objectInputStream.readObject();
			System.out.println(e.toString());
			System.out.println(se.toString());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			objectInputStream.close();
			fileInputStream.close();
		}
	}
}
