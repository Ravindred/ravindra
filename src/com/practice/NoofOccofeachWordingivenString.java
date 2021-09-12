package com.practice;

import java.util.HashSet;

public class NoofOccofeachWordingivenString {
	public static void main(String[] args) {
		String s="welcome to india";
		String str[]=s.split(" ");
		//step1:
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		//step2:compare each character of set with all the characters of given string
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
	 //step3:If the given character is matching increment the count
					count++;
				}
			}
	//step4:Print the char and its respective count
			System.out.println(word+" "+count);
		}
	}

}
