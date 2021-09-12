package com.practice;

import java.util.HashSet;

public class Demos {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(15);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(30);
		set.add("tyss");
		set.add('A');
		set.add(null);
		set.add(null);
		System.out.println(set);
		
	}

}
