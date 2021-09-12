package com.practice;

public class Stringmax {
	public static void main(String[] args) {
		String s[]={"Bye","Hi","Mango","Naveen","Amma"};
		String max=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(max.length()<s[i].length())
			{
				max=s[i];
			}
			
		}
		System.out.println("String with maximum length:"+ max);
	}
	}


