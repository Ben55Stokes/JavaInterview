package com.serialize.deserialize.externalize;

public class Application {

	public static void main(String[] args) {
		try {
			SerializationDemo serializationDemo= new SerializationDemo();
			serializationDemo.serialize();
			
			DeserializationDemo deserializationDemo=new DeserializationDemo();
			deserializationDemo.deserialize();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
