package com.practice;

import java.util.LinkedHashSet;

public class RemoveDuplifromString {
	public static void main(String[] args) {
		String s="killer";
		//step1:create a set collection and add all the characters of the given string 
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//step4:Print the char and its respective count
		for(Character ch:set)
		{
		System.out.print(ch);
		}
		
	}

}
