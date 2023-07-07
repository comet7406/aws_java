package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class MapList {
	
	
	public static void main(String[] args) {
		
		List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
				Customer a = Customer.builder()
						.name("홍길동")
						.rating("vip")
						.age(30).build();
				
				Customer b = Customer.builder()
						.name("김기영")
						.rating("gold")
						.age(35).build();
				System.out.println(a);
				System.out.println(b);

		for (Map<String, Object> customer : customers) {
			
		}
	}
}
