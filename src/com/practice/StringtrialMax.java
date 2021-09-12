package com.practice;

public class StringtrialMax {
	public static void main(String[] args) {
		String s[]={"Bye","Hi","Mango","To","ravin"};
		String max=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(max.length()<s[i].length())
			{
				max=s[i];
			}
		}
		
			for(int i=0;i<s.length;i++)
			{
				if(max.length()==s[i].length())
				{
					System.out.println(s[i]);
				}
			}
		
	
	}
	}


