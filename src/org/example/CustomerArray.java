package org.example;

public class CustomerArray {
	
	public static void main(String[] args) {
		Customer[] customer = new Customer[1];
		
		customer[0] = Customer.builder().name("홍길동").rating("vip").age(30).build();
		customer[1] = Customer.builder().name("김기영").rating("gold").age(35).build();
	}

}
