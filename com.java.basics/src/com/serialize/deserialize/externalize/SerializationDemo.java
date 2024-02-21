package com.serialize.deserialize.externalize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;
import java.util.Date;
import java.util.Random;

public class SerializationDemo {

	public void serialize() throws Exception {
		FileOutputStream outputStream = new FileOutputStream(
				"C:\\Users\\HP\\OneDrive\\Documents\\myFile.csv" + new Random().nextInt());
		;
		ObjectOutputStream objectOutputStream = null;
		Employee emp = null;
		StudentInformation studentInformation = null;
		try {
			emp = new Employee();
			emp.setId(1l);
			emp.setName("Ashfaq");
			studentInformation = new StudentInformation();
			studentInformation.setRollNo(161311269);
			studentInformation.setName("Ashfaq");
			studentInformation.setPasswordString(Base64.getEncoder().encodeToString("AlastairCook".getBytes()));
			objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(emp);
			objectOutputStream.writeObject(studentInformation);
//			String encode= Base64.getEncoder().encodeToString("AlastairCook".getBytes());
//			System.out.println(encode);
//			System.out.println(new String(Base64.getDecoder().decode(encode)));
		} catch (Exception e) {
			throw new Exception();
		} finally {
			objectOutputStream.close();
			outputStream.close();
		}
	}
}
