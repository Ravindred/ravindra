package com.practice;

import java.util.TreeMap;

public class Demotreemap {
	public static void main(String[] args) {
		//keys should be homogenous
		//values should be either homogenous or heterogenous
		//values should be duplicate null also
		TreeMap map=new TreeMap<>();
		map.put(10, 100);
		map.put(20, 200);
		map.put(50, 500);
		map.put(30, 300);
		map.put(40, 400);
		//map.put("fruit", "mango");
		map.put(05, "mango");
		//map.put(null, 100);
		map.put(01, null);
		System.out.println(map);
		
	}

}
