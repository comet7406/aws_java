package org.example;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		HashMap<String, String> strMap = new HashMap<>();
		strMap.put("name", "홍길동");
		strMap.put("rating", "vip");
		strMap.put("age", "30");
		
		System.out.println(strMap);
	}

}
