package org.example;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class Customer {
	private String name;
	private String rating;
	private int age;
	
}
