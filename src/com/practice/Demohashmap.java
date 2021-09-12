package com.practice;

import java.util.HashMap;

public class Demohashmap {
	public static void main(String[] args) {
		//dont follow order of insertion
		//whenever we pass duplicate key ,it is going to replace old value with new value
		//allows duplicate values
		//we can add heterogenous keys
		HashMap map=new HashMap<>();
		map.put(10, 100);
		map.put(20, 200);
		map.put(30, 300);
		map.put(40, 400);
		map.put(50, 200);
		map.put(null, "abc");
		map.put("abc", null);
		map.put("c", null);
		System.out.println(map);
	}

}
