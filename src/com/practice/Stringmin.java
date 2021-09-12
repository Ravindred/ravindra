package com.practice;

public class Stringmin {
	public static void main(String[] args) {
		String s[]={"Bye","Hi","Mango","Naveen","Amma"};
		String min=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(min.length()>s[i].length())
			{
				min=s[i];
			}
			
		}
		System.out.println("String with minimum length:"+ min);
	}

}
