package com.serialize.deserialize.externalize;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Serializable{

	//even if u donot do this JVM does it during run time
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Long id;

}
