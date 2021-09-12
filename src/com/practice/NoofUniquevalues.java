package com.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NoofUniquevalues {
	public static void main(String[] args) {
		String s="killer";
		//step1:create a set collection and add all the characters of the given string 
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//step2:compare each character of set with all the characters of given string
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
	 //step3:If the given character is matching increment the count
					count++;
				}
			}
	//step4:Print the char and its respective count
			if(count==1)
			{
			System.out.print(ch);
			}
		}
	}

}
