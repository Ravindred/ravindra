package com.practice;

public class Stringtrial {
	public static void main(String[] args) {
		String s[]={"Bye","Hi","Mango","To","Amma"};
		String min=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(min.length()>s[i].length())
			{
				min=s[i];
			}
		}
		
			for(int i=0;i<s.length;i++)
			{
				if(min.length()==s[i].length())
				{
					System.out.println(s[i]);
				}
			}
		
	
	}

}
