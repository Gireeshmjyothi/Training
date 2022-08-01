package com.josh.java.serialization;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class StudentData implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double marks;
}
