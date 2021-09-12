package com.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Demotreeset {
           //homogenous in nature
	       //dont follow order of insertion
	       //elements are auto sorted
	      //dont allow null values

	public static void main(String[] args) {
		TreeSet set=new TreeSet<Object>();
		set.add(10);
		set.add(50);
		set.add(25);
		set.add(20);
		set.add(30);
		System.out.println(set.descendingSet());
		System.out.println(set);
	}

}
