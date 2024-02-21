package com.serialize.deserialize.externalize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class StudentInformation implements Externalizable {
	private Integer rollNo;
	private String name;
	private String passwordString;

	/*
	 * in case of serialization passwordString is exposed now it wont
	 */
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(rollNo);
		out.writeBytes(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		rollNo = in.readInt();
		name = in.readLine();
	}

}
